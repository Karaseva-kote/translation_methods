import java.io.FileWriter;
import java.io.IOException;

public abstract class Generator {
	public Grammar grammar;
	public String path;

	public Generator(Grammar g, String path) {
		this.grammar = g;
		this.path = path;
	}

	public void generate(String type) throws IOException {
		FileWriter writer = new FileWriter(path + "\\" + grammar.name + type + ".java");
		writer.write(generateClass());
		writer.close();
	}

	public abstract String generateClass();
}
