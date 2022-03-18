import java.util.stream.Collectors;

public class GeneratorToken extends Generator {
	public GeneratorToken(Grammar g, String path) {
		super(g, path);
	}

	@Override
	public String generateClass() {
		return "public enum " + grammar.name + "Token {\n\t" +
				grammar.term.stream().map(t -> t.name).collect(Collectors.joining(", ")) +
				";\n}";
	}
}
