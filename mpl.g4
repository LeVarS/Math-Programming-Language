/*
Parser rules
 */
grammar mpl; //matches name of *.g4
source  
    : (statement '.')+ 
    ;
//begin parser rules
statement
    : 'display' expr '.'
    | LET VAR (',' VAR)* 'exist' //(',' VAR)* allows for multiple declartion in single line e.g. let a,b,c,d,e,f,g exist.
    | LET VAR (',' VAR)* '=' expr '.'
    | SET VAR (',' VAR)* '=' expr '.' //todo: how to override parser to check for an existing variable(s)
    | 'solve for' VAR ',' 'given' equ '.'
    | 'solve for' VAR ',' 'given' equ ',' 'when' equ '.'
    ;
//an expression can be a string, or a series of operations
expr    
    : STRING
    | operation
    ;
operation //I think this covers PEMDAS - JO
    : '(' operation ')'
    | operation '(' operation ')'
    | (TERM '**' operation) //exponenation 
    | (TERM '*' operation | TERM '/' operation | TERM '%' operation) //% support for modulo
    | (TERM '+' operation | TERM '-' operation)
    ;
equ
    : '\'' expr EQU_SIGN expr '\''
    | '\'' expr EQU_SIGN VAR EQU_SIGN expr '\'' //to catch equations 'like 1 <= x <= 2'
    ;

/*
Lexor Rules
*/
SET 
    : ('Set' | 'set') 
    ;
LET
    : ('Let' | 'let')
    ;
VAR 
    : [a-zA-Z]([a-zA-Z] | [0-9] | [_])*
    ;
EQU_SIGN 
        : '==' | '<=' | '>=' | '<' | '>'
        ;
STRING  
    : '"' ([a-zA-Z] | [0-9] | OPERATOR | OPERATOR | EQU_SIGN)* '"' //TODO: expand to include symbols
    ;
INT
    : ([-])?([0-9])+
    ;
OPERATOR
    : '-' | '+' | '*' | '/' 
    ;
TERM
    : VAR
    | INT
    | INT VAR
    ;