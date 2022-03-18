import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class GeneratorParser extends Generator {

	public GeneratorParser(Grammar g, String path) {
		super(g, path);
	}

	@Override
	public String generateClass() {
		return "import java.text.ParseException;\n\n"
		        + "public class " + grammar.name + "Parser {\n"
				+ "\tpublic " + grammar.name + "Lexer lexer;\n\n"
				+ "\tpublic " + grammar.name + "Parser(" + grammar.name + "Lexer lexer) throws ParseException {\n"
				+ "\t\tthis.lexer = lexer;\n"
				+ "\t\tlexer.nextToken();\n"
				+ "\t}\n\n"
				+ generateMethods()
				+ "\tpublic String skip(" + grammar.name + "Token token) throws Exception {\n"
				+ "\t\tif(lexer.curToken != token)\n"
				+ "\t\t\tthrow new Exception(\"expected token:\" + token + \", found token: \" + lexer.curToken);\n"
				+ "\t\tif(lexer.curToken == " + grammar.name + "Token.EOF)\n"
				+ "\t\t\tthrow new Exception(\"can't skip EOF\");\n"
				+ "\t\tString res = lexer.curData;\n"
				+ "\t\tlexer.nextToken();\n"
				+ "\t\treturn res;\n"
				+ "\t}\n"
				+ "}";
	}

	private String generateMethods() {
		StringBuilder sb = new StringBuilder();
		grammar.nonterm.forEach(nt -> {
			Set<String> past = new HashSet<>();
			sb.append("\tpublic ").append(nt.returnType).append(" ").append(nt.name).append("(").append(nt.args).append(") throws Exception {\n");
			sb.append("\t\tswitch(lexer.curToken) {\n");
			nt.list.forEach(rule -> {
				sb.append("\t\t\tcase ");
				Set<String> set;
				if (rule.lexElems.get(0).name.equals("EPS")) {
					set = grammar.follow.get(nt.name).stream().filter(x -> !x.equals("EPS")).collect(Collectors.toSet());
				} else {
					set = grammar.first.get(rule.lexElems.get(0).name);
				}
				sb.append(set.stream().filter(s -> !past.contains(s)).collect(Collectors.joining(", ")));
				past.addAll(new HashSet<>(set));
				sb.append(" -> {\n");
				rule.lexElems.forEach(elem -> {
					if (!elem.name.equals("EPS") && !elem.name.equals("EOF")) {
						sb.append("\t\t\t\t");
						if (grammar.isNonterm(elem.name)) {
							sb.append(grammar.getType(elem.name));
							sb.append(elem.name).append("(").append(elem.args.replace("$", "val_")).append(");\n");
						} else {
							if (rule.code != null) sb.append("String val_").append(elem.name).append(" = ");
							sb.append("skip(").append(grammar.name).append("Token.").append(elem.name).append(");\n");
						}
					}
				});
				if (rule.code != null) {
					sb.append("\t\t\t\t").append(rule.code.replace("$", "val_")
							.replace("return", "return ")).append("\n");
				} else {
					sb.append("\t\t\t\treturn;\n");
				}
				sb.append("\t\t\t}\n");
			});
			sb.append("\t\t}\n");
			sb.append("\t\tthrow new Exception(\"expected tokens: ").append(past.toString()).append(" found token: \" + lexer.curToken);\n");
			sb.append("\t}\n\n");
		});
		return sb.toString();
	}
}
