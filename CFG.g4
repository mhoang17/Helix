grammar CFG;

start: EOF;

WS  :   (' '|'\r'|'\n'|'\t') -> channel(HIDDEN);
