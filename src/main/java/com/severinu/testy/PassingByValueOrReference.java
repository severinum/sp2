package com.severinu.testy;

public class PassingByValueOrReference {

    public static void main(String[] args) {
        User adam = new User("Adam", "Smith");
        User anna = new User("Anna", "Turnner");

        int x = 4;
        adam.doStuff(x);
        System.out.println("x: " + x);
        System.out.println("x after doStudd(x) : " + x);

        User.changeName(adam);
        System.out.println(adam);

        String str = "This text is before manipulate method";
        System.out.println(str);
        User.manipulateString(str);
        System.out.println(str);

        Integer y = 100;

        changeInteger(y);
        System.out.println("y = " + y);

    }

    public static void changeInteger(Integer x){
        x.doubleValue();
    }
}
