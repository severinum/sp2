package com.severinu.session4;

public class Person {
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void birthday(){
        age++;
        System.out.println("Happy Birthday!");
    }

    public void doSomething(){

    }
}
