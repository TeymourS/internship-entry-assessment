package org.example;

class D extends A {
    public D(String name) {
        super(name);
    }

    @Override
    public void PrintName() {
        System.out.println("Class D Name: " + name);
    }
}
