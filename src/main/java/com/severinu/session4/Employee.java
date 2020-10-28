package com.severinu.session4;

public class Employee extends Person {
    private double hourlyWage;
    private String name;

    public Employee(String name) {
        super(name);
    }

    public void pay(double hoursWorked){
        System.out.println("Pay: " + getName() + " GBP" + hoursWorked * hourlyWage);
    }

    @Override
    public void doSomething(){

    }
}
