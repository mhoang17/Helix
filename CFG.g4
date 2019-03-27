grammar CFG;

/* RULES */
start: aStmt EOF;
aStmt: ID ASSIGN stmt;
stmt: t PLUS stmt | t;
t: NUM | ID;

/*start: stmt EOF;
stmt: ID ASSIGN e
    | BEGIN stmts END;
stmts: stmts SEMI stmt
    | stmt;
e: e PLUS t
    |t;
t: ID | NUM;*/

/* OPERATORS*/
PLUS: '+';
ASSIGN: '=';
BEGIN: '{';
END:'}';
SEMI: ';';

/* TERMINALS */
NUM: [0-9]+;
ID: [a-z]+;

/* WHITE SPACE */
WS  :   (' '|'\r'|'\n'|'\t') -> channel(HIDDEN);
