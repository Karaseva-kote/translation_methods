grammar Grammar;

@header {
	import java.util.regex.Pattern;
	import java.util.Set;
	import java.util.stream.Collectors;
}

@members {
    Set<Character> escapeChars = Set.of('+', '*', '(', ')');
}

start returns [Grammar g]
@init {
    $g = new Grammar();
} :
    parseGrammar[$g]
    EOF {
        $g.term.add(new Term("EPS", Pattern.compile("")));
        $g.term.add(new Term("EOF", Pattern.compile("")));
    }
;

parseGrammar[Grammar g] :
    header[$g]
    (term {
        $g.term.add($term.t);
    } | nonterm {
        $g.nonterm.add($nonterm.nt);
    })*
;

header[Grammar g] :
    GRAMMAR NAME SEMICOLON {
        $g.setName($NAME.text);
    }
;

term returns [Term t] :
    NAME COLON regex SEMICOLON {
        $t = new Term($NAME.text, $regex.p);
    }
;

regex returns [Pattern p] :
    (QUOTE string QUOTE {
        $p = Pattern.compile($string.text.chars().mapToObj(ch -> (char) ch).map(ch -> escapeChars.contains(ch)? "\\" + ch: ch).map(Object::toString).collect(Collectors.joining()));

    }) | (NUMPATTERN {
        $p = Pattern.compile($NUMPATTERN.text);
    }) | (LETTERPATTERN {
        $p = Pattern.compile($LETTERPATTERN.text);
    })
;

nonterm returns [NonTerm nt] :
    NAME args returnType COLON lexElems SEMICOLON {
        $nt = new NonTerm($NAME.text);
        $nt.list = $lexElems.list;
        $nt.args = $args.s;
        $nt.returnType = $returnType.type;
    }
;

lexElems returns [List<Rule> list]
@init {
    $list = new ArrayList<>();
} :
    elems {
        $list.add($elems.r);
    } (OR elems {
        $list.add($elems.r);
    })*
;

elems returns [Rule r]
@init {
    $r = new Rule();
} :
    (fun {
        $r.lexElems.add($fun.f);
    })+
    ((LFB code RFB) {
        $r.code = $code.text;
    })?
;

fun returns [CallLexElement f] : NAME {$f = new CallLexElement($NAME.text);} ((LB code RB) {$f.args = $code.text;})?;

args returns [String s]
@init {
    $s = "";
}: ((LB type=NAME name=NAME RB) {
        $s = $type.getText() + " " + $name.getText();
    })?
;

returnType returns [String type]
@init {
    $type = "void";
}: ((RETURNS string) {
        $type = $string.text;
    })?
;

code : (string | DOLLAR)+;
string : (
    NAME
    | LFB | LFB
    | LB | RB | PLUS | MUL
    | SEMICOLON | DIV | EQUAL | DIGIT
    | DOT | COMMA
    | '-' | '<' | '>' | '"'
)+;
GRAMMAR : 'grammar';
RETURNS : 'returns';
NAME : [a-zA-Z][a-zA-Z0-9]*;
PLUS : '+';
MUL : '*';
SUB : '-';
DIV : '/';
SEMICOLON : ';';
COLON : ':';
QUOTE : '\'';
OR : '|';
NUMPATTERN : '[0-9]+';
LETTERPATTERN : '[a-zA-Z]';
LB : '(';
RB : ')';
LSB : '[';
RSB : ']';
LFB : '{';
RFB : '}';
COMMA : ',';
DOT : '.';
DOLLAR : '$';
EQUAL : '=';
DIGIT : [0-9]+;
WS : [ \t\n\r] -> skip;