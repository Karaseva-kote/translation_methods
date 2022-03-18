import antr.JavaLexer;
import antr.JavaParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final List<String> testList = Arrays.asList("Sum", "A", "B");

    private static void runTest(String test) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File("javaFiles/" + test + ".java")));
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        String ls = System.getProperty("line.separator");
        while( ( line = reader.readLine() ) != null ) {
            stringBuilder.append( line );
            stringBuilder.append( ls );
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        JavaLexer lexer = new JavaLexer(CharStreams.fromString(stringBuilder.toString()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        parser.start();
        FileWriter writer = new FileWriter("htmlFiles/" + test  + ".html", false);
        writer.write(parser.html.toString());
        writer.flush();
    }

    public static void main(String[] args) throws IOException {
        for (String test : testList) {
            runTest(test);
        }
    }
}
