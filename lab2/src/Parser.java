import java.io.InputStream;
import java.text.ParseException;

public class Parser {

    private static Tree E(LexicalAnalyzer lex) throws ParseException {
        return new Tree( "E", T(lex), EPrime(lex));
    }

    private static Tree EPrime(LexicalAnalyzer lex) throws ParseException {
        switch (lex.curToken()) {
            case OR:
                lex.nextToken();
                return new Tree("E'", new Tree("or"), T(lex), EPrime(lex));
            case XOR:
                lex.nextToken();
                return new Tree("E'", new Tree("xor"), T(lex), EPrime(lex));
        }
        return new Tree("E'", new Tree("eps"));
    }

    private static Tree T(LexicalAnalyzer lex) throws ParseException {
        return new Tree("T", S(lex), TPrime(lex));
    }

    private static Tree TPrime(LexicalAnalyzer lex) throws ParseException {
        if (lex.curToken() == Token.AND) {
            lex.nextToken();
            return new Tree("T'", new Tree("and"), S(lex), TPrime(lex));
        }
        return new Tree("T'", new Tree("eps"));
    }

    private static Tree S(LexicalAnalyzer lex) throws ParseException {
        switch (lex.curToken()) {
            case LPAREN:
                lex.nextToken();
                Tree e = E(lex);
                if (lex.curToken() != Token.RPAREN) {
                    throw new ParseException(") expected at position ", lex.curPos());
                }
                lex.nextToken();
                return new Tree("S", new Tree("("), e, new Tree(")"));
            case NOT:
                lex.nextToken();
                return new Tree("S", new Tree("not"), S(lex));
            case VAR:
                lex.nextToken();
                return new Tree("S", new Tree("var"));
            default:
                throw new AssertionError();
        }
    }

    public static Tree parse(InputStream is) throws ParseException {
        LexicalAnalyzer lex = new LexicalAnalyzer(is);
        lex.nextToken();
        Tree result = E(lex);
        if (lex.curToken() == Token.END)
            return result;
        else
            throw new AssertionError();
    }

}
