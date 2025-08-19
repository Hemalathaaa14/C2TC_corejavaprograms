package com.tnsif.Day4.firstpackage;

public class Base {
    /*
     * Declaring default, public, private and protected variables 
     */
    int varDefault = 10;           // Default access
    public int varPublic = 20;     // Public access
    private int varPrivate = 30;   // Private access
    protected int varProtected = 40; // Protected access

    /*
     * Declaring methods with default, public, private, protected types
     */
    void methodDefault() {
        System.out.println("Default access Base class");
        System.out.println("Default Variable : " + varDefault);
    }

    public void methodPublic() {
        System.out.println("Public access Base class");
        System.out.println("Public Variable : " + varPublic);
    }

    private void methodPrivate() {
        System.out.println("Private access Base class");
        System.out.println("Private Variable : " + varPrivate);
    }

    protected void methodProtected() {
        System.out.println("Protected access Base class");
        System.out.println("Protected Variable : " + varProtected);
    }

    // A helper method to call private method inside the class
    public void callPrivateMethod() {
        methodPrivate();
    }
}

