import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorLexer {
	public String input;
	public int curPos;
	public String curData;
	public CalculatorToken curToken;

	public CalculatorLexer(String input) throws ParseException {
		this.input = input;
		curPos = 0;
	}

	public boolean find(String p) {
		Matcher m = Pattern.compile(p).matcher(input);
		boolean res = m.find(curPos);
		if (res && m.start() == curPos) {
			curData = m.group();
		}
		return res && m.start() == curPos;
	}

	public void nextToken() throws ParseException {
		while(true) {
			if (curPos == input.length()) {
				curToken = CalculatorToken.EOF;
				return;
			}
			if(input.charAt(curPos) == ' ')
				curPos++;
			else
				break;
		}
		if (find("pow")) {
			curPos += curData.length();
			curToken = CalculatorToken.POW;
		} else if (find("\\+")) {
			curPos += curData.length();
			curToken = CalculatorToken.PLUS;
		} else if (find("\\*")) {
			curPos += curData.length();
			curToken = CalculatorToken.MUL;
		} else if (find("-")) {
			curPos += curData.length();
			curToken = CalculatorToken.SUB;
		} else if (find("/")) {
			curPos += curData.length();
			curToken = CalculatorToken.DIV;
		} else if (find("[0-9]+")) {
			curPos += curData.length();
			curToken = CalculatorToken.NUM;
		} else if (find("\\(")) {
			curPos += curData.length();
			curToken = CalculatorToken.LB;
		} else if (find("\\)")) {
			curPos += curData.length();
			curToken = CalculatorToken.RB;
		} else throw new ParseException ("unknown token, position: " + curPos, curPos);
	}
}