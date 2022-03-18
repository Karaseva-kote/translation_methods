import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.lang.constant.Constable;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
	private static void generate(String grammarFile) throws IOException {
		Path grammarPath = Paths.get(grammarFile + ".meow");
		BufferedReader reader = new BufferedReader(new FileReader(grammarPath.toFile()));
		String line;
		StringBuilder stringBuilder = new StringBuilder();
		String ls = System.getProperty("line.separator");
		while ((line = reader.readLine()) != null) {
			stringBuilder.append(line);
			stringBuilder.append(ls);
		}
		stringBuilder.deleteCharAt(stringBuilder.length() - 1);
		GrammarLexer lexer = new GrammarLexer(CharStreams.fromString(stringBuilder.toString()));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		GrammarParser parser = new GrammarParser(tokens);
		Grammar grammar = parser.start().g;
		grammar.generate(grammarPath.getParent().toString());
	}

	public static void main(String[] args) throws IOException {
		if (args == null || args.length == 0) {
			throw new IllegalArgumentException("expect 2 argument");
		}
		generate(args[0]);
	}
}
