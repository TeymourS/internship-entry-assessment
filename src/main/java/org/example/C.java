package org.example;


class C extends B {
    public C(String name) {
        super(name);
    }


    public void PrintName(String message) {
        System.out.println(message + ": " + name);
    }
}