// Sample of recursion
define:function:int fibonacci as { int param } [
    if { param < 2 } [
        return param;
    ]
    return fibonacci{param - 1} + fibonacci{param - 2};
]

// Lets say we will always need a Main function
define:function main = { } [
    define:int a as 5;
    define:
    loop:for:blind 10 [
        fibonacci{a};
        a = a + 1;
    ]
]