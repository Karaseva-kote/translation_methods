import java.util.stream.Collectors;

public class GeneratorLexer extends Generator {

	public GeneratorLexer(Grammar g, String path) {
		super(g, path);
	}

	@Override
	public String generateClass() {
		return "import java.io.IOException;\n"
				+ "import java.io.InputStream;\n"
				+ "import java.text.ParseException;\n"
				+ "import java.util.regex.Matcher;\n"
				+ "import java.util.regex.Pattern;\n\n"
				+ "public class " + grammar.name + "Lexer {\n"
				+ "\tpublic String input;\n"
				+ "\tpublic int curPos;\n"
				+ "\tpublic String curData;\n"
				+ "\tpublic " + grammar.name + "Token curToken;\n\n"
				+ "\tpublic " + grammar.name + "Lexer(String input) throws ParseException {\n"
				+ "\t\tthis.input = input;\n"
				+ "\t\tcurPos = 0;\n"
				+ "\t}\n\n"
				+ "\tpublic boolean find(String p) {\n"
				+ "\t\tMatcher m = Pattern.compile(p).matcher(input);\n"
				+ "\t\tboolean res = m.find(curPos);\n"
				+ "\t\tif (res && m.start() == curPos) {\n"
				+ "\t\t\tcurData = m.group();\n"
				+ "\t\t}\n"
				+ "\t\treturn res && m.start() == curPos;\n"
				+ "\t}\n\n"
				+ "\tpublic void nextToken() throws ParseException {\n"
				+ "\t\twhile(true) {\n"
				+ "\t\t\tif (curPos == input.length()) {\n"
				+ "\t\t\t\tcurToken = " + grammar.name + "Token.EOF;\n"
				+ "\t\t\t\treturn;\n"
				+ "\t\t\t}\n"
				+ "\t\t\tif(input.charAt(curPos) == ' ')\n"
				+ "\t\t\t\tcurPos++;\n"
				+ "\t\t\telse\n"
				+ "\t\t\t\tbreak;\n"
				+ "\t\t}\n\t\t"
				+ grammar.term.stream().filter(term -> !term.name.equals("EOF") && !term.name.equals("EPS"))
					.map(t -> "if (find(\"" + t.pattern.toString().replace("\\", "\\\\") + "\")) {\n" +
												"\t\t\tcurPos += curData.length();\n" +
												"\t\t\tcurToken = " + grammar.name + "Token." + t.name + ";\n" +
												"\t\t} else ")
										.collect(Collectors.joining())
				+ "throw new ParseException (\"unknown token, position: \" + curPos, curPos);\n"
				+ "\t}\n"
				+ "}";
	}
}
