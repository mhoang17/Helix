grammar CFG;

program: importStmt* start EOF;

importStmt: IMPORT PATH AS ID;

start: (dcls| processDcl)*;

/* DECLARATION RULES*/
dcls: ETYPE ID ASSIGN aExp
    | CTYPE ID ASSIGN chord;
processDcl: PTYPE ID LPAREN ID? RPAREN BEGIN stmt* END;

/* STATEMENT RULES */
stmt: dcls
     | PLAY LPAREN (MEASURE COMMA)? playStruc RPAREN
     | SEND LPAREN c COMMA aExp RPAREN
     | REC LPAREN c COMMA x RPAREN
     | IF LPAREN bExp RPAREN BEGIN stmt* END (ELSE BEGIN stmt* END)?
     | WHILE LPAREN bExp RPAREN BEGIN stmt* END;

/* MUSIC COMMANDS */
playStruc: (chord | n) (COMMA (playStruc)?)*;
chord: LPAREN n (COMMA n)* RPAREN | ID;
n: NOTE;

/* EXPRESSION RULES */
aExp: t OP aExp | LPAREN aExp RPAREN (OP aExp)? | t;
bExp: aExp BOP aExp;

/* TERMINALS */
t: NUM | ID;
x: t | chord;
c: ID;

/* OPERATORS*/
OP: '+'|'-'|'*';
BOP: '<' | '==' | '&&' | '||';
ASSIGN: '=';
BEGIN: '{';
END:'}';
SEMI: ';';
COMMA: ',';

/* DATATYPES */
ETYPE: 'num';
CTYPE: 'chord';
PTYPE: 'Instrument' | 'Event';

MEASURE: INT '/' INT;
LPAREN: '(';
RPAREN: ')';

/* KEYWORDS*/
PLAY: 'play';
SEND: 'send';
REC: 'receive';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
IMPORT: 'import';
AS: 'as';

/* SYMBOLS */
NUM: [0-9]+ ('.' [0-9]+)?;
INT: [0-9];
ID: [a-z]+;
NOTE: [a-gA-G][0-9];
PATH: (ID'/')+;

/* WHITE SPACE */
WS  :   (' '|'\r'|'\n'|'\t') -> channel(HIDDEN);
