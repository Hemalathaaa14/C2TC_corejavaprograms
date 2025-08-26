package com.tnsif.Day9;

public class WrapperClassDemo {
    public static void main(String[] args) {
        // Unboxing (manual way)
        Integer i = new Integer(10);   // Integer object created with value 10
        System.out.println(i);         // Prints the Integer object (10)
        
        int b = i.intValue();          // Explicitly converting Integer -> int
        System.out.println(b);         // Prints 10

        // Without using intValue() (auto-unboxing)
        int c = i;                     // Java automatically converts Integer -> int
        System.out.println(c);         // Prints 10
        
        // Autoboxing (int -> Integer)
        int a = 100;
        Integer i1 = a;                // Java automatically converts int -> Integer
        System.out.println(i1);        // Prints 100
    }
}
