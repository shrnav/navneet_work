package com.test.array;

public class InterfaceDemo implements PrintDemo {
    public static void main(String[] args)
    {

        // Call Interface method as Interface
        // name is preceeding with method
        PrintDemo.hello();

        // Call Class static method
        InterfaceDemo.hello();
        hello();
    }

    // Class Static method is defined
    static void hello()
    {
        System.out.println("Called from Class");
    }
}
