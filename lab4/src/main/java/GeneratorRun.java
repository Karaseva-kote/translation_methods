public class GeneratorRun extends Generator {
	public GeneratorRun(Grammar g, String path) {
		super(g, path);
	}

	@Override
	public String generateClass() {
		return "import java.io.*;\n\n"
				+ "public class " + grammar.name + "Run {\n"
				+ "\tpublic static void main(String[] args) throws IOException {\n"
				+ "\t\tBufferedReader reader = new BufferedReader(\n"
				+ "\t\t\t\tnew FileReader(new File(\"D:\\\\study\\\\5sem\\\\MT\\\\lab4\\\\grammarFiles\\\\" + grammar.name + ".test\"))\n"
				+ "\t\t);\n"
				+ "\t\tString line;\n"
				+ "\t\twhile((line = reader.readLine()) != null) {\n"
				+ "\t\t\tSystem.out.print(line + \" = \");\n"
				+ "\t\t\ttry {\n"
				+ "\t\t\t\t" + grammar.name + "Parser parser = new " + grammar.name + "Parser(new " + grammar.name + "Lexer(line));\n"
				+ "\t\t\t\t" + generateSout() + ";\n"
				+ "\t\t\t} catch (Exception e) {\n"
				+ "\t\t\t\tSystem.out.println(e.getMessage());\n"
				+ "\t\t\t}\n"
				+ "\t\t}\n"
				+ "\t}\n"
				+ "}";
	}

	private String generateSout() {
		String res = "parser." + grammar.nonterm.get(0).name + "()";
		if (!grammar.nonterm.get(0).returnType.equals("void")) {
			res = "System.out.println(" + res + ")";
		} else {
			res = res + ";\n\t\t\t\tSystem.out.println(\"passed\")";
		}
		return res;
	}
}
