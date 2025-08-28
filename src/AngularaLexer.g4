lexer grammar AngularaLexer;

// Keywords
IMPORT: 'import';
SLASH: '/';
FROM: 'from';
EXPORT: 'export';
DEFAULT: 'default';
CLASS: 'class';
INTERFACE: 'interface';
AT: '@';
NULL: 'null';
EXTENDS: 'extends';
CONSTRUCTOR: 'constructor';
IF: 'if';
ELSE: 'else';
LET: 'let';
CONST: 'const';
NEW: 'new';
THIS: 'this';
COMPONENT: '@Component';
SELECTOR: 'selector';
STANDALONE: 'standalone';
IMPORTS: 'imports';
TEMPLATE: 'template';
STYLE_URLS: 'styleUrls';
STRING_TYPE: 'string';
NUMBER_TYPE: 'number';
BOOLEAN_TYPE: 'boolean';
VOID: 'void';
AS: 'as';

// HTML specific
DOCTYPE: '<!doctype html>' | '<!DOCTYPE html>';

HTML: 'html';
HEAD: 'head';
BODY: 'body';
META: 'meta';
TITLE: 'title';
BASE: 'base';
LINK: 'link';

// Operators
ASSIGN: '=';
EQ: '==';
NE: '!=';
EQ_STRICT: '===';
NE_STRICT: '!==';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';
LOGICAL_AND: '&&';
LOGICAL_OR: '||';
ARROW: '=>';
SPREAD: '...';
EXCLAMATION: '!';

// Punctuation
SEMI_Q: ';';
COMMA: ',';
COLON: ':';
DOT: '.';
LBRACE: '{';
RBRACE: '}';
LPAREN: '(';
RPAREN: ')';
LBRACK: '[';
RBRACK: ']';
BACKTICK: '`';
DOLLAR: '$';
LT: '<';
GT: '>';
QUESTION: '?';
IMPLEMENTS: 'implements';
PRIVATE: 'private';
PUBLIC: 'public';
PROTECTED: 'protected';
PIPE: '|';

// Literals
BOOLEAN_LITERAL: 'true' | 'false';
NUMBER: [0-9]+ ('.' [0-9]+)?;
TEMPLATE_STR: '`' ( ~[`\\] | '\\' . | '${' .*? '}' )* '`';


STRING: '\'' ( ~['\\\r\n] | '\\' . )* '\''
      | '"' ( ~["\\\r\n] | '\\' . )* '"';

// Support for Arabic and emoji identifiers
fragment ARABIC: [\u0600-\u06FF\u0750-\u077F\u08A0-\u08FF\uFB50-\uFDFF\uFE70-\uFEFF\u1EE00-\u1EEFF];
fragment EMOJI: [\u1F300-\u1F6FF\u1F900-\u1F9FF];

IDENTIFIER
    : [a-zA-Z_$] [a-zA-Z0-9_$-]*
    ;

// Whitespace and comments
WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;