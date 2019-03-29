grammar CFG;

program: start EOF;

start: (dcls | processDcl)*;

dcls: eDcl SEMI | chordDcl SEMI;

/* DECLARATION RULES*/
eDcl: ETYPE ID ASSIGN e;
chordDcl: CTYPE ID ASSIGN chord;
processDcl: PTYPE ID LPAREN ID? RPAREN BEGIN stmt* END;

/* STATEMENT RULES */
stmt: dcls
     | PLAY LPAREN (MEASURE COMMA)? playStruc RPAREN SEMI
     | SEND LPAREN c COMMA e RPAREN SEMI
     | REC LPAREN c COMMA x RPAREN SEMI;

/* MUSIC COMMANDS */
playStruc: (chord | n) (COMMA chord | COMMA n | COMMA)*;
chord: LPAREN NOTE (COMMA NOTE)* RPAREN | ID;
n: NOTE;

/* EXPRESSION RULES */
e: t OP e | t;

/* TERMINALS */
t: NUM | ID;
x: t | chord;
c: ID;

/* OPERATORS*/
OP: '+'|'-'|'*';
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

/* SYMBOLS */
NUM: [0-9]+ ('.' [0-9]+)?;
INT: [0-9];
ID: [a-z]+;
NOTE: [a-gA-G][0-9];

/* WHITE SPACE */
WS  :   (' '|'\r'|'\n'|'\t') -> channel(HIDDEN);
