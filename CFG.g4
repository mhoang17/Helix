grammar CFG;

start: stmt EOF;
stmt: ID ASSIGN e
    | BEGIN stmts END;
    //| PLAY LPAREN (MEASURE',')?(chord | note) RPAREN;
stmts: stmts SEMI stmt
    | stmt;
e: e PLUS t
    |t;
t: ID | NUM;
//chord: LPAREN NUM(',' NUM)*? RPAREN (',' chord | ',' note)?;
//note: NUM (',' chord | ',' note)?;

/* OPERATORS*/
PLUS: '+';
ASSIGN: '=';
BEGIN: '{';
END:'}';
SEMI: ';';

MEASURE: NUM '/' NUM;
LPAREN: '(';
RPAREN: ')';
PLAY: 'play';

/* TERMINALS */
NUM: [0-9]+;
ID: [a-z]+;

/* WHITE SPACE */
WS  :   (' '|'\r'|'\n'|'\t') -> channel(HIDDEN);
