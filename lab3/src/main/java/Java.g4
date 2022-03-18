grammar Java;

@header {
	import java.util.*;
}

@members{
    public StringBuilder html = new StringBuilder("<html>\n\t<head>\n\t\t<title>Code</title>\n" +
    "\t\t<style>\n\t\t\tbody {\n\t\t\t\tfont: normal normal 18px courier;\n\t\t\t}\n" +
    "\t\t\t.highlight  {\n\t\t\t\tcolor: darkorange;\n\t\t\t}\n" +
    "\t\t\t.number {\n\t\t\t\tcolor: darkseagreen;\n\t\t\t}\n" +
    "\t\t\t.string {\n\t\t\t\tcolor: olivedrab;\n\t\t\t}\n" +
    "\t\t\t.types {\n\t\t\t\tcolor: darkgoldenrod;\n\t\t\t}\n\t\t</style>\n\t</head>\n" +
    "\t<body text=\"#ffe4c4\" bgcolor=\"#282923\">\n\t\t");
    private void highlight (String s) {
        html.append("<span class=\"highlight\">").append(s).append("</span>");
    }
    private void number (String s) {
        html.append("<span class=\"number\">").append(s).append("</span>");
    }
    private void string (String s) {
        html.append("<span class=\"string\">").append(s).append("</span>");
    }
    private void types (String s) {
        html.append("<span class=\"types\">").append(s).append("</span>");
    }
}

start :
    ws?
    parsePackage?
    parseImport*
    code
    EOF {
        html.append("<br>\n\t</body>\n</html>");
    }
;

parsePackage :
    (PACKAGE {highlight("package");}) ws? packageName ws? semicolon ws
;

packageName :
    word (dot word)*
;

parseImport :
    (IMPORT {highlight("import");}) ws? importName ws? semicolon ws
;

importName :
    packageName dot (mul | word)
;

code :
    ((PUBLIC {highlight("public");}) ws)?
    (parseClass | parseInterface)
;

parseClass :
    (CLASS {highlight("class");}) ws? word (ws? extend)? (ws? implement)? ws?
    op_brace ws? classPiece* ws? cl_brace ws?
;

classPiece :
    (modifier ws)? ((STATIC {highlight("static");}) ws)?
    ( parseClass
    | parseInterface
    | (VOID {types("void");}) ws? classMethod ws? cl_brace
    | type ws? classMethodReturnOrFeild
    )
    ws?
;

classMethod :
    word ws? op_bracket ws? arg? ws? cl_bracket (ws? (THROWS {highlight("throws");}) ws? word)? ws?
    op_brace ws? statement* ws?
;

classMethodReturnOrFeild :
    classMethod ws? (RETURN {highlight("return");}) ws? data ws? semicolon ws? cl_brace ws? | varInit
;

statement :
    ws?
    (((type ws)? varInit)
    | parseIf
    | parseWhile
    | parseFor
    | parseDoWhile)
    ws?
;

parseIf :
    (IF {highlight("if");}) ws? op_bracket ws? condition ws? cl_bracket ws?
    (ws? statement ws? | ws? op_brace ws? statement* ws? cl_brace ws?) ws?
    ((ELSE {highlight("else");}) ws? (statement | op_brace statement+ cl_brace))?
;

parseFor :
    (FOR {highlight("for");}) ws? op_bracket ws?
    (type ws? word ws? init ws? expr (ws? comma ws? type ws? word ws? init ws? expr ws?)*)?
    ws? semicolon ws? (condition ws? (ws? comma ws? condition)*)? ws? semicolon
    ws? (word ws? init ws? expr)? ws? cl_bracket ws?
    (statement | op_brace statement* cl_brace)
;

parseWhile :
    (WHILE {highlight("while");}) ws? op_bracket ws? condition ws? cl_bracket ws?
    (statement | op_brace statement* cl_brace)
;

parseDoWhile :
    (DO {highlight("do");}) ws? (statement | op_brace statement* cl_brace) ws?
    (WHILE {highlight("while");}) ws? op_bracket ws? condition ws? cl_bracket ws? semicolon ws?
;
DO: 'do';

extend :
    (EXTENDS {highlight("extends");}) ws? word
;

implement :
    (IMPLEMENTS {highlight("implements");}) ws? word
;

parseInterface :
    (INTERFACE {highlight("interface");}) ws? word (ws extend)? ws? op_brace ws? interfacePiece* ws? cl_brace
;

interfacePiece :
    ws? (modifier ws)? ((STATIC {highlight("static");}) ws)?
    ( parseInterface
    | (VOID {types("void");}) ws? interfaceMethod
    | type ws? interfaceMethodOrFeild
    )
;

modifier :
    (PUBLIC | PRIVATE | PROTECTED) {
        if (_localctx != null) highlight(_localctx.getText());
    }
;

type :
   (INT | BOOL | LONG | FLOAT | DOUBLE | CHAR) {
        if (_localctx != null) types(_localctx.getText());
   }
   | STRING {
        if (_localctx != null) html.append(_localctx.getText());
   }
;

interfaceMethod :
    word ws? op_bracket ws? arg? cl_bracket (ws? (THROWS {highlight("throws");}) ws? word)? ws? semicolon ws?
;

arg :
    type ws? word ws? (comma ws? type ws? word ws?)*
;

interfaceMethodOrFeild :
    interfaceMethod | varInit
;

varInit :
    word ws? (init ws? expr)? ws? semicolon ws?
;

data :
    (INTEGER_NUM
    | INTEGER_NUM 'L'
    | DOUBLE_NUM
    | DOUBLE_NUM 'F' ) {
        if (_localctx != null) number(_localctx.getText());
    }
    | (STRING_VALUE
    | CHAR_VALUE) {
        if (_localctx != null) string(_localctx.getText());
    }
    | (BOOLEAN_VALUE
    | NULL) {
        if (_localctx != null) highlight(_localctx.getText());
    }
    | WORD {
        if (_localctx != null) html.append(_localctx.getText());
    }
;

expr :
    ws? data ws? plus ws? expr ws?
    | ws? data ws? minus ws? expr ws?
    | ws? data ws? div ws? expr ws?
    | ws? data ws? mul ws? expr ws?
    | ws? data ws? mod ws? expr ws?
    | ws? data ws?
;

condition :
    ws? expr ws? less ws? condition ws? |
    ws? expr ws? greater ws? condition ws? |
    ws? expr ws? and ws? condition ws? |
    ws? expr ws? or ws? condition ws? |
    ws? expr ws? eq ws? condition ws? |
    ws? expr ws?;

PACKAGE: 'package';
IMPORT: 'import';
PUBLIC: 'public';
PRIVATE: 'private';
PROTECTED: 'protected';
STATIC: 'static';
CLASS: 'class';
INTERFACE: 'interface';
EXTENDS: 'extends';
IMPLEMENTS: 'implements';
THROWS: 'throws';

VOID: 'void';

INT: 'int';
STRING: 'String';
BOOL: 'boolean';
LONG: 'long';
DOUBLE: 'double';
FLOAT: 'float';
CHAR: 'char';
NULL: 'null';

IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
RETURN: 'return';

INTEGER_NUM : '-'?[0-9]+;
DOUBLE_NUM : INTEGER_NUM '.' [0-9]*;
BOOLEAN_VALUE : 'true' | 'false';
CHAR_VALUE: QUOTE [a-zA-Z] QUOTE;
STRING_VALUE : DOUBLE_QOUTE (WORD | WS | COMMA | DOT)* DOUBLE_QOUTE;

word :
    WORD {html.append($WORD.text);}
;
WORD : [a-zA-Z] [a-zA-Z0-9]*;

space :
    WS {
        html.append($WS.text);
    }
;
WS : ' ';
tab :
    TAB {html.append("&nbsp;&nbsp;&nbsp;&nbsp;");}
;
TAB : '\t';
R : '\r' -> skip;
newline :
    NEWLINE {html.append("<br>\n\t\t");}
;
NEWLINE : '\n';

ws :
    (space | newline | tab)+
;

comma :
    COMMA {html.append(",");}
;
COMMA  : ',';
dot :
    DOT {html.append(".");}
;
DOT    : '.';
op_bracket :
    OP_BRACKET {html.append("(");}
;
OP_BRACKET: '(';
cl_bracket :
    CL_BRACKET {html.append(")");}
;
CL_BRACKET: ')';
op_brace :
    OP_BRACE {html.append("{");}
;
OP_BRACE: '{';
cl_brace :
    CL_BRACE {html.append("}");}
;
CL_BRACE : '}';

init :
    INIT {html.append("=");}
;
INIT : '=';

QUOTE : '\'';
DOUBLE_QOUTE : '"';
semicolon:
    SEMICOLON {html.append(";");}
;
SEMICOLON : ';';

plus :
    PLUS {html.append("+");}
;
PLUS  : '+';
minus :
    MINUS {html.append("-");}
;
MINUS : '-';
div :
    DIV {html.append("/");}
;
DIV   : '/';
mul :
    MUL {html.append("*");}
;
MUL   : '*';
mod :
    MOD {html.append("%");}
;
MOD   : '%';

or :
    OR {html.append("||");}
;
OR : '||';
and :
    AND {html.append("&&");}
;
AND : '&&';
less :
    LESS {html.append("<");}
;
LESS : '<';
greater:
    GREATER {html.append(">");}
;
GREATER : '>';
eq :
    EQ {html.append("==");}
;
EQ : '==';