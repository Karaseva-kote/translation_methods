import java.text.ParseException;

public class CalculatorParser {
	public CalculatorLexer lexer;

	public CalculatorParser(CalculatorLexer lexer) throws ParseException {
		this.lexer = lexer;
		lexer.nextToken();
	}

	public double s() throws Exception {
		switch(lexer.curToken) {
			case SUB, LB, NUM -> {
				double val_e = e();
				return val_e;
			}
		}
		throw new Exception("expected tokens: [SUB, LB, NUM] found token: " + lexer.curToken);
	}

	public double e() throws Exception {
		switch(lexer.curToken) {
			case SUB, LB, NUM -> {
				double val_t = t();
				double val_e2 = e2(val_t);
				return val_e2;
			}
		}
		throw new Exception("expected tokens: [SUB, LB, NUM] found token: " + lexer.curToken);
	}

	public double e2(double left) throws Exception {
		switch(lexer.curToken) {
			case PLUS -> {
				String val_PLUS = skip(CalculatorToken.PLUS);
				double val_t = t();
				double val_e2 = e2(left+val_t);
				return val_e2;
			}
			case SUB -> {
				String val_SUB = skip(CalculatorToken.SUB);
				double val_t = t();
				double val_e2 = e2(left-val_t);
				return val_e2;
			}
			case RB, EOF -> {
				return left;
			}
		}
		throw new Exception("expected tokens: [RB, SUB, EOF, PLUS] found token: " + lexer.curToken);
	}

	public double t() throws Exception {
		switch(lexer.curToken) {
			case SUB, LB, NUM -> {
				double val_f = f();
				double val_t2 = t2(val_f);
				return val_t2;
			}
		}
		throw new Exception("expected tokens: [SUB, LB, NUM] found token: " + lexer.curToken);
	}

	public double t2(double left) throws Exception {
		switch(lexer.curToken) {
			case MUL -> {
				String val_MUL = skip(CalculatorToken.MUL);
				double val_f = f();
				double val_t2 = t2(left*val_f);
				return val_t2;
			}
			case DIV -> {
				String val_DIV = skip(CalculatorToken.DIV);
				double val_f = f();
				double val_t2 = t2(left/val_f);
				return val_t2;
			}
			case RB, SUB, EOF, PLUS -> {
				return left;
			}
		}
		throw new Exception("expected tokens: [DIV, RB, SUB, MUL, EOF, PLUS] found token: " + lexer.curToken);
	}

	public double f() throws Exception {
		switch(lexer.curToken) {
			case SUB, LB, NUM -> {
				double val_p = p();
				java.util.function.Function<Double,Double> val_f2 = f2();
				return val_f2.apply(val_p);
			}
		}
		throw new Exception("expected tokens: [SUB, LB, NUM] found token: " + lexer.curToken);
	}

	public java.util.function.Function<Double,Double> f2() throws Exception {
		switch(lexer.curToken) {
			case POW -> {
				String val_POW = skip(CalculatorToken.POW);
				double val_p = p();
				java.util.function.Function<Double,Double> val_f2 = f2();
				return i->Math.pow(i,val_f2.apply(val_p));
			}
			case DIV, RB, SUB, MUL, EOF, PLUS -> {
				return i->i;
			}
		}
		throw new Exception("expected tokens: [DIV, RB, SUB, MUL, POW, EOF, PLUS] found token: " + lexer.curToken);
	}

	public double p() throws Exception {
		switch(lexer.curToken) {
			case NUM -> {
				String val_NUM = skip(CalculatorToken.NUM);
				return Double.parseDouble(val_NUM);
			}
			case LB -> {
				String val_LB = skip(CalculatorToken.LB);
				double val_e = e();
				String val_RB = skip(CalculatorToken.RB);
				return val_e;
			}
			case SUB -> {
				String val_SUB = skip(CalculatorToken.SUB);
				double val_f = f();
				return -1*val_f;
			}
		}
		throw new Exception("expected tokens: [SUB, LB, NUM] found token: " + lexer.curToken);
	}

	public String skip(CalculatorToken token) throws Exception {
		if(lexer.curToken != token)
			throw new Exception("expected token:" + token + ", found token: " + lexer.curToken);
		if(lexer.curToken == CalculatorToken.EOF)
			throw new Exception("can't skip EOF");
		String res = lexer.curData;
		lexer.nextToken();
		return res;
	}
}