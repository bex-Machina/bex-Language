grammar ExampleGrammar;

prgm
    : (decl | declArr | declFunc | param | assignment | assignStmt | atomStmt | controlStmt | block
    | stmt | unknownExpr | exprAll | exprArr | floatExprArr | boolExprArr | stringExprArr | expr | floatExpr |
    boolExpr | stringExpr)+
    ;

decl
    : TYPE IDENTIFIER (EQ exprAll)? SEMICOLON
    ;

declArr
    : TYPE IDENTIFIER LSQ expr RSQ (EQ exprArr)? SEMICOLON
    ;

param
    : TYPE (LSQ RSQ)? IDENTIFIER
    ;

declFunc
    : TYPE (LSQ RSQ)? IDENTIFIER LPAREN (params+=param (COMMA params+=param)*)? RPAREN block
    ;

assignment
    : IDENTIFIER EQ exprAll                     #AssignToId
    | IDENTIFIER LSQ expr RSQ EQ expr           #AssignToIdAsArr
    | INC IDENTIFIER                            #IncId
    | INC IDENTIFIER LSQ expr RSQ               #IncIdAsArr
    | DEC IDENTIFIER                            #DecId
    | DEC IDENTIFIER LSQ expr RSQ               #DecIdAsArr
    ;

assignStmt
    : assignment SEMICOLON
    ;

controlStmt
    : 'if' boolExpr block 'else' block                                                                      #If
    | 'for' LPAREN (TYPE IDENTIFIER EQ expr)? SEMICOLON boolExpr? SEMICOLON assignment? RPAREN block        #For
    | 'while' boolExpr block                                                                                #While
    | 'do' block 'while' boolExpr                                                                           #DoWhile
    ;

atomStmt
    : 'input' IDENTIFIER SEMICOLON                                                          #Input
    | 'print' exprAll SEMICOLON                                                             #Print
    | 'return' exprAll SEMICOLON                                                            #Return
    | IDENTIFIER LPAREN (args+=exprAll (COMMA args+=exprAll)*)? RPAREN SEMICOLON            #FuncCall
    ;

block
    : LCURL (decl | declArr)* stmt* RCURL
    ;

stmt
    : assignStmt
    | controlStmt
    | atomStmt
    ;

unknownExpr
    : IDENTIFIER                                                            #UnknownId
    | IDENTIFIER LSQ exprAll RSQ                                            #UnknownIdAsArr
    | IDENTIFIER LPAREN (args+=exprAll (COMMA args+=exprAll)*)? RPAREN      #UnknownFuncCall
    | LPAREN unknownExpr RPAREN                                             #ParenUnknown
    ;

exprAll
    : unknownExpr
    | expr
    | exprArr
    ;

exprArr
    : unknownExpr
    | floatExprArr
    | boolExprArr
    | stringExprArr
    ;

floatExprArr
    : LCURL elements+=floatExpr (COMMA elements+=floatExpr)* RCURL
    ;

boolExprArr
    : LCURL elements+=boolExpr (COMMA elements+=boolExpr)* RCURL
    ;

stringExprArr
    : LCURL elements+=stringExpr (COMMA elements+=stringExpr)* RCURL
    ;

expr
    : unknownExpr
    | floatExpr
    | boolExpr
    | stringExpr
    ;

floatExpr
    : floatExpr op=(ADD | SUB | MUL | DIV) floatExpr                #FloatArith
    | INT                                                           #Int
    | FLOAT                                                         #Float
    | unknownExpr                                                   #FloatUnknown
    | LPAREN floatExpr RPAREN                                       #ParenFloat
    ;

boolExpr
    : boolExpr op=(AND | OR | XOR) boolExpr                         #BoolExprBoolOp
    | NOT boolExpr                                                  #NotBoolExpr
    | floatExpr op=(LT | LE | GT | GE | EQEQ | NEQ) floatExpr       #BoolExprFloatOp
    | TRUE                                                          #BoolExprTrue
    | FALSE                                                         #BoolExprFalse
    | unknownExpr                                                   #BoolUnknown
    | LPAREN boolExpr RPAREN                                        #ParenBoolExpr
    ;

stringExpr
    : stringExpr CONCAT stringExpr                                  #StrCat
    | STRING                                                        #Str
    | unknownExpr                                                   #StrUnknown
    | LPAREN stringExpr RPAREN                                      #ParenStr
    ;

TYPE
    : 'float'
    | 'boolean'
    | 'string'
    ;

TRUE
    : 'true'
    ;

FALSE
    : 'false'
    ;

CONCAT: '##' ;

LT: '<' ;
LE: '<=' ;
GT: '>' ;
GE: '>=' ;
EQEQ: '==' ;
NEQ: '!=' ;

AND: '&&' ;
OR: '||' ;
NOT: '!' ;
XOR: '^' ;

INC: '++' ;
DEC: '--' ;
MUL: '*' ;
DIV: '/' ;
ADD: '+' ;
SUB: '-' ;

EQ : '=' ;
SEMICOLON : ';' ;
COMMA : ',' ;
LSQ : '[';
RSQ : ']';
LPAREN: '(' ;
RPAREN: ')' ;
LCURL: '{' ;
RCURL: '}' ;

INT: DIGIT+ ;
FLOAT: DIGIT+ '.' DIGIT+ ;
IDENTIFIER : (DIGIT | NONDIGIT)+ ;
STRING : '"' CHAR* '"' ;

fragment NONDIGIT : [a-zA-Z_] ;
fragment DIGIT : [0-9] ;
fragment CHAR : ~["\\\r\n] ;

WS : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
