import java.io.*;

public class CalculatorRun {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(
				new FileReader(new File("D:\\study\\5sem\\MT\\lab4\\grammarFiles\\Calculator.test"))
		);
		String line;
		while((line = reader.readLine()) != null) {
			System.out.print(line + " = ");
			try {
				CalculatorParser parser = new CalculatorParser(new CalculatorLexer(line));
				System.out.println(parser.s());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}