grammar CFG;

/* RULES */
start: aStmt EOF;
aStmt: ID ASSIGN stmt;
stmt: t PLUS stmt | t;
t: NUM;

/* OPERATORS*/
PLUS: '+';
ASSIGN: '=';

/* TERMINALS */
NUM: [0-9]+;
ID: [a-z]+;

/* WHITE SPACE */
WS  :   (' '|'\r'|'\n'|'\t') -> channel(HIDDEN);
