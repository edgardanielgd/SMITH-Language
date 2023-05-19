grammar SMITHGrammar;

/*
*  SMITHGrammar.h
*  SMITH
*
*  Created by Jhonatan Rodriguez, Miguel Puentes & Edgar Gonzalez
*
*/


// Leftmost blocks are designed as what we would call "namespaces" in C++
// They are used to group similar blocks together
// For example, the "decide" block is used to group the "if" and "ifnot" blocks
// The "loop" block is used to group the "repeat" block
// and forth...

// Grammar
program: block EOF
    ;

// Global utils
atomictype: INT | FLOAT | BOOL | STRING;
variabletype : atomictype;

// - Join integers with floats
numberliteral: INTEGER_LITERAL | FLOAT_LITERAL ;

// Decide block
decideblock: decideprefix IF conditional statementbody decisionextension
    ;

decisionextension: decideprefix IFNOT conditional statementbody decisionextension
    | decideprefix DEFAULT statementbody
    | // Not even necessary
    ;
decideprefix: DECIDE COLON
    ;

// Define statement
definestatement: defineprefix defineextension IDENTIFIER definedefaultvalue SEMICOLON
    ;

definedefaultvalue: ASSIGN assignationexp
    | // Not even necessary, we can calculate a default value easily
    ;

defineextension: atomictype arrayextension
    | FUNCTION functiondefextension
    ;

arrayextension: OPEN_BRACKET dimensions CLOSE_BRACKET
    | // Not even necessary, we can define an array without dimensions
    ;

dimensions: numberliteral furtherdimensions
    ;

furtherdimensions: COMMA dimensions
    | // We can pass more dimensions or not
    ;

functiondefextension : COLON atomictype
    | // Not even necessary
    ;

assignationexp : expression
    | functionblock
    ;

defineprefix: DEFINE COLON
    ;

// Loops statement
loopblock: loopprefix loopextension
    ;

loopprefix: LOOP COLON
    ;

loopextension: REPEAT COLON repeattype conditional statementbody
    | FOR COLON forextension statementbody
    ;

repeattype: UNTIL | WHILE
    ;

forextension: EACH OPEN_BRACE IDENTIFIER IN expression CLOSE_BRACE
    | BLIND expression // No need for an index, just iterate an integer number of times
    ;

rangeextension: COLON expression // Range offset
    | // We can pass an offset or not
    ;

// Statements block / oneline expression
statementbody: OPEN_BRACKET block CLOSE_BRACKET
    | expression SEMICOLON
    ;

// Conditional
conditional: OPEN_BRACE expression CLOSE_BRACE;

// Functions definition
// Recall functions must be assigned to variables
functionblock: functionarguments statementbody
    ;

functionarguments: OPEN_BRACE arguments CLOSE_BRACE
    ;

arguments : atomictype IDENTIFIER furtherarguments
    | // Maybe we wouldn't like to pass arguments
    ;

furtherarguments : COMMA arguments
    | // And again, maybe we would't like to pass more things here
    ;

// Expression
expression: literal expressionextension
    | OPEN_PAREN expression CLOSE_PAREN expressionextension
    ;

expressionextension: aritmeticoperator expression
    | logicaloperator expression
    | comparisonoperator expressionnc
    | // Not even necessary
    ;

// - Expression without comparison operators
expressionnc: literal expressionncextension
    | OPEN_PAREN expression CLOSE_PAREN expressionncextension
    ;

// Note we removed here the comparison operators
expressionncextension: aritmeticoperator expressionnc
    | logicaloperator expressionnc
    | // Not even necessary
    ;

aritmeticoperator: PLUS | MINUS | TIMES | DIVIDE | MOD
    ;

logicaloperator: AND | OR
    ;

comparisonoperator: LESS | GREATER | LESS_EQUAL | GREATER_EQUAL | EQUAL_EQUAL | NOT_EQUAL
    ;

literal: BOOLEAN_LITERAL
      | STRING_LITERAL
      | IDENTIFIER
      | numberliteral
      | functioncall
      ;

functioncall: IDENTIFIER functionarguments
    ;

// Return statement
returnstatement: RETURN expression SEMICOLON
    ;

// Block
block: decideblock block
    | loopblock block
    | definestatement block
    | functioncall SEMICOLON block
    | returnstatement block
    | // Block can be empty
    ;

// Defining tokens to read
COLON: ':' ;
SEMICOLON: ';' ;
COMMA: ',' ;
DOT: '.' ;
EQUAL: '=' ;
PLUS: '+' ;
MINUS: '-' ;
TIMES: '*' ;
DIVIDE: '/' ;
MOD: '%' ;
AND: '&' ;
OR: '|' ;
NOT: '!' ;
LESS: '<' ;
GREATER: '>' ;
LESS_EQUAL: '<=' ;
GREATER_EQUAL: '>=' ;
EQUAL_EQUAL: '==' ;
NOT_EQUAL: '!=' ;
ASSIGN: 'as';
OPEN_PAREN: '(' ;
CLOSE_PAREN: ')' ;
OPEN_BRACKET: '[' ;
CLOSE_BRACKET: ']' ;
OPEN_BRACE: '{' ;
CLOSE_BRACE: '}' ;

// Literals
INTEGER_LITERAL: [0-9]+ ;
FLOAT_LITERAL: [0-9]+ '.' [0-9]+ ;
STRING_LITERAL: '"' ( '\\' . | ~('\\'|'"') )* '"' ;
BOOLEAN_LITERAL: 'true' | 'false' ;

//
// Reserved words
//

// Decide block
DECIDE: 'decide';
IF: 'if' ;
IFNOT: 'ifnot' ;
DEFAULT: 'default';

// Loop block
LOOP: 'loop' ;

// - Repeat substatement
REPEAT: 'repeat' ;
UNTIL: 'until';
WHILE: 'while';

// - ForEach substatement
FOR: 'for';
EACH: 'each';
IN: 'in';
BLIND: 'blind';

// Definitions block
DEFINE: 'define' ;
INT: 'int' ;
FLOAT: 'float' ;
ARRAY: 'array' ;
// - Join Flaot with int
NUMBER: INT | FLOAT;
STRING: 'string' ;
BOOL: 'bool' ;
FUNCTION: 'function' ;
TYPE: 'type' ; // Useful when defining parameters

// Outputs block
OUTPUT: 'output' ;
PRINT: 'print' ;
PRINTLN: 'println' ;
WRITEFILE: 'writefile' ;

// Inputs block
INPUT: 'input' ;
READFILE: 'readfile' ;
READCONSOLE: 'readconsole' ;

// Assignations
SET: 'set' ;

// Probabilistic block
PROB: 'prob' ;

// Maybe if time allows it we will include gaussian cumulative distribution
DUNIFORM: 'duniform' ;
DPOISSON: 'dpoisson' ;
DBERNOULLI: 'dbernoulli' ;
DBINOMIAL: 'dbinomial' ;
DGEOMETRIC: 'dgeometric' ;

PUNIFORM: 'puniform' ;
PPOISSON: 'ppoisson' ;
PBERNOULLI: 'pbernoulli' ;
PBINOMIAL: 'pbinomial' ;
PGEOMETRIC: 'pgeometric' ;

// Other reserved words
RETURN: 'return' ;

// Identifiers
IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]* ;

// Scaping
WS: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
COMMENT: '//' ~[\r\n]* -> skip ; // skip comments
// Useful for non-case sensitive terminals
A : 'a' | 'A' ;
S: 's' | 'S' ;
// ... (if needed :) )

