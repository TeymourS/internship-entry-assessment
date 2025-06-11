package org.example;


public class B extends A {
    public B(String name) {
        super(name);
    }

    private void PrintName(String message) {
        System.out.println(message + ": " + name);
    }


    public void callPrintWithMessage(String message) {
        PrintName(message);
    }

    @Override
    public void PrintName() {
        System.out.println("Class B Name: " + name);
    }
}