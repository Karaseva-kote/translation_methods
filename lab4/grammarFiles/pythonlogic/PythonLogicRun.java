import java.io.*;

public class PythonLogicRun {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new FileReader(new File("D:\\study\\5sem\\MT\\lab4\\grammarFiles\\PythonLogic.test"))
		);
		String line;
		while((line = reader.readLine()) != null) {
			System.out.print(line + " = ");
			try {
				PythonLogicParser parser = new PythonLogicParser(new PythonLogicLexer(line));
				parser.start();
				System.out.println("passed");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}