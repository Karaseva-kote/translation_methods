import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PythonLogicLexer {
	public String input;
	public int curPos;
	public String curData;
	public PythonLogicToken curToken;

	public PythonLogicLexer(String input) throws ParseException {
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
				curToken = PythonLogicToken.EOF;
				return;
			}
			if(input.charAt(curPos) == ' ')
				curPos++;
			else
				break;
		}
		if (find("or")) {
			curPos += curData.length();
			curToken = PythonLogicToken.OR;
		} else if (find("xor")) {
			curPos += curData.length();
			curToken = PythonLogicToken.XOR;
		} else if (find("and")) {
			curPos += curData.length();
			curToken = PythonLogicToken.AND;
		} else if (find("not")) {
			curPos += curData.length();
			curToken = PythonLogicToken.NOT;
		} else if (find("\\(")) {
			curPos += curData.length();
			curToken = PythonLogicToken.LB;
		} else if (find("\\)")) {
			curPos += curData.length();
			curToken = PythonLogicToken.RB;
		} else if (find("[a-zA-Z]")) {
			curPos += curData.length();
			curToken = PythonLogicToken.VAR;
		} else throw new ParseException ("unknown token, position: " + curPos, curPos);
	}
}