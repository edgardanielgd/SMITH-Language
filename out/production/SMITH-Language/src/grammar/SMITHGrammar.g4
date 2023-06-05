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
atomictype: INT | FLOAT | BOOL | STRING | ARRAY;
variabletype : atomictype;

// - Join integers with floats
numberliteral: INTEGER_LITERAL | FLOAT_LITERAL ;

// - Arrays definition (inline)
arrayliteral: OPEN_BRACKET arrayelements CLOSE_BRACKET
    ;

arrayelements: expression furtherarrayelements
    | // We can pass elements or not
    ;

furtherarrayelements: COMMA arrayelements
    | SEMICOLON optionalinterval SEMICOLON expression // Shorthand arrays
    | // We can pass more elements or not
    ;

optionalinterval: expression
    | // Not even necessary, we can define an array without an interval (default to 1)
    ;

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
definestatement: defineprefix defineextension SEMICOLON
    ;

defineextension: atomictype IDENTIFIER definedefaultvalue
    | FUNCTION functiondefextension IDENTIFIER ASSIGN functionblock
    ;

definedefaultvalue: ASSIGN expression
    | // Not even necessary, we can calculate a default value easily
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

// Output statement
outputblock: outputprefix outputextension
    ;

outputprefix: OUTPUT COLON
    ;

outputextension: printtype OPEN_BRACE expression CLOSE_BRACE SEMICOLON
    | PLOT OPEN_BRACE expression COMMA expression CLOSE_BRACE SEMICOLON
    | WRITEFILE OPEN_BRACE expression COMMA expression CLOSE_BRACE SEMICOLON
    ;

printtype: PRINT | PRINTLN
    ;

// Input statement
// - NOTE: Not an actual block :)
inputblock: inputprefix inputextension
    ;

inputprefix: INPUT COLON
    ;

inputextension: READFILE OPEN_BRACE expression CLOSE_BRACE
    | READCONSOLE OPEN_BRACE CLOSE_BRACE
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

arguments : atomictype COLON IDENTIFIER furtherarguments
    | // Maybe we wouldn't like to pass arguments
    ;

furtherarguments : COMMA arguments
    | // And again, maybe we would't like to pass more things here
    ;

// Expression
expression: literal
    | MINUS expression
    | inputblock // Not an actual block, just a shorthand for reading from console
    | atomictype OPEN_BRACE expression CLOSE_BRACE
    | expression TILDE expression
    | expressionnc comparisonoperator expressionnc
    | expression TIMES expression
    | expression DIVIDE expression
    | expression MOD expression
    | expression PLUS expression
    | expression MINUS expression
    | expression OR expression
    | expression AND expression

    | OPEN_PAREN expression CLOSE_PAREN
    ;

// - Expression without comparison operators
expressionnc: literal
    | MINUS expressionnc
    | inputblock // Not an actual block, just a shorthand for reading from console
    | atomictype OPEN_BRACE expression CLOSE_BRACE
    | expressionnc TILDE expressionnc
    | expressionnc TIMES expressionnc
    | expressionnc DIVIDE expressionnc
    | expressionnc MOD expressionnc
    | expressionnc PLUS expressionnc
    | expressionnc MINUS expressionnc
    | expressionnc OR expression
    | expressionnc AND expression
    | OPEN_PAREN expression CLOSE_PAREN
    ;

comparisonoperator: LESS | GREATER | LESS_EQUAL | GREATER_EQUAL | EQUAL_EQUAL | NOT_EQUAL
    ;

literal: BOOLEAN_LITERAL
      | STRING_LITERAL
      | IDENTIFIER arrayitem
      | numberliteral
      | functioncall
      | arrayliteral
      ;

arrayitem : OPEN_BRACKET arrayaccessor CLOSE_BRACKET
    | // Not even necessary, we can access an array without an index
    ;

arrayaccessor: expression furtherarrayaccessor
    ;

furtherarrayaccessor: COMMA arrayaccessor
    | // We can access more elements or not
    ;

functioncall: CALL COLON IDENTIFIER functioncallarguments
    ;

functioncallarguments: OPEN_BRACE callarguments CLOSE_BRACE
    ;

callarguments: expression furthercallarguments
    | // We can pass arguments or not
    ;

furthercallarguments: COMMA callarguments
    | // We can pass more arguments or not
    ;

// Return statement
returnstatement: RETURN expression SEMICOLON
    ;

// Set statement
setstatement: SET IDENTIFIER arrayitem ASSIGN expression SEMICOLON
    ;

// Block
block: decideblock block
    | loopblock block
    | definestatement block
    | functioncall SEMICOLON block
    | returnstatement block
    | outputblock block
    | setstatement block
    | // Block can be empty
    ;

// Defining tokens to read
COLON: ':' ;
SEMICOLON: ';' ;
COMMA: ',' ;
TILDE: '~' ;
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
ASSIGN: 'as' | 'como';
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
BOOLEAN_LITERAL: 'true' | 'false' | 'verdadero' | 'falso' ;

//
// Reserved words
//

// Decide block
DECIDE: 'decide' | 'decidir';
IF: 'if' | 'si' ;
IFNOT: 'ifnot' | 'sino' ;
DEFAULT: 'default' | 'pordefecto';

// Call block
CALL: 'call' | 'invocar' ;

// Loop block
LOOP: 'loop' | 'ciclo';

// - Repeat substatement
REPEAT: 'repeat' | 'repetir';
UNTIL: 'until' | 'hasta';
WHILE: 'while' | 'mientras';

// - ForEach substatement
FOR: 'for' | 'para';
EACH: 'each' | 'cada';
IN: 'in' | 'en';
BLIND: 'noiterator' | 'siniterador';

// Definitions block
DEFINE: 'define' | 'definir' ;
INT: 'int' | 'entero';
FLOAT: 'float' | 'decimal' ;
ARRAY: 'array' | 'arreglo' ;
// - Join Flaot with int
NUMBER: INT | FLOAT;
STRING: 'string' | 'cadena' ;
BOOL: 'bool' | 'booleano' ;
FUNCTION: 'function' | 'funcion' ;
TYPE: 'type' | 'tipo' ; // Useful when defining parameters

// Outputs block
OUTPUT: 'output' | 'salida' ;
PRINT: 'print' | 'imprimir';
PRINTLN: 'println' | 'imprimirl' ;
WRITEFILE: 'writefile' | 'escribirarchivo' ;
PLOT: 'plot' | 'graficar' ;

// Inputs block
INPUT: 'input' | 'entrada' ;
READFILE: 'readfile' | 'leerarchivo' ;
READCONSOLE: 'readconsole' | 'leerconsola' ;

// Assignations
SET: 'set' | 'asignar' ;

// Other reserved words
RETURN: 'return' | 'regresar' ;

// Identifiers
IDENTIFIER: [a-zA-Z][a-zA-Z0-9_]* ;

// Scaping
WS: [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
COMMENT: '//' ~[\r\n]* -> skip ; // skip comments
// Useful for non-case sensitive terminals
A : 'a' | 'A' ;
S: 's' | 'S' ;
// ... (if needed :) )