import java.text.ParseException;

public class PythonLogicParser {
	public PythonLogicLexer lexer;

	public PythonLogicParser(PythonLogicLexer lexer) throws ParseException {
		this.lexer = lexer;
		lexer.nextToken();
	}

	public void start() throws Exception {
		switch(lexer.curToken) {
			case NOT, LB, VAR -> {
				e();
				return;
			}
		}
		throw new Exception("expected tokens: [NOT, LB, VAR] found token: " + lexer.curToken);
	}

	public void e() throws Exception {
		switch(lexer.curToken) {
			case NOT, LB, VAR -> {
				t();
				e2();
				return;
			}
		}
		throw new Exception("expected tokens: [NOT, LB, VAR] found token: " + lexer.curToken);
	}

	public void e2() throws Exception {
		switch(lexer.curToken) {
			case OR -> {
				skip(PythonLogicToken.OR);
				t();
				e2();
				return;
			}
			case XOR -> {
				skip(PythonLogicToken.XOR);
				t();
				e2();
				return;
			}
			case RB, EOF -> {
				return;
			}
		}
		throw new Exception("expected tokens: [RB, OR, XOR, EOF] found token: " + lexer.curToken);
	}

	public void t() throws Exception {
		switch(lexer.curToken) {
			case NOT, LB, VAR -> {
				s();
				t2();
				return;
			}
		}
		throw new Exception("expected tokens: [NOT, LB, VAR] found token: " + lexer.curToken);
	}

	public void t2() throws Exception {
		switch(lexer.curToken) {
			case AND -> {
				skip(PythonLogicToken.AND);
				s();
				t2();
				return;
			}
			case RB, OR, XOR, EOF -> {
				return;
			}
		}
		throw new Exception("expected tokens: [RB, OR, AND, XOR, EOF] found token: " + lexer.curToken);
	}

	public void s() throws Exception {
		switch(lexer.curToken) {
			case LB -> {
				skip(PythonLogicToken.LB);
				e();
				skip(PythonLogicToken.RB);
				return;
			}
			case VAR -> {
				skip(PythonLogicToken.VAR);
				return;
			}
			case NOT -> {
				skip(PythonLogicToken.NOT);
				s();
				return;
			}
		}
		throw new Exception("expected tokens: [NOT, LB, VAR] found token: " + lexer.curToken);
	}

	public String skip(PythonLogicToken token) throws Exception {
		if(lexer.curToken != token)
			throw new Exception("expected token:" + token + ", found token: " + lexer.curToken);
		if(lexer.curToken == PythonLogicToken.EOF)
			throw new Exception("can't skip EOF");
		String res = lexer.curData;
		lexer.nextToken();
		return res;
	}
}