// Defining a function and considering its variables environment

define:function main = { } [
    define:int a as 4;
    define:bool b as true;

    decide:if{ a < 3 } [
        define:int c as 5;
        print{ "a < 3" };
    ] decide:default [
        define:int d as 6;
        print{ "a >= 3" };
        // Lets consider that as soon this function is defined, variables defined
        // but that are not parameters are just setted as constants
        define:function:bool e = { } [
            // e is a constant here
            define:int f as e;
            print{ "e" };
        ]
    ]
]