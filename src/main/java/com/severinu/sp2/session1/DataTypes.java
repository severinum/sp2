package com.severinu.sp2.session1;

import java.util.Scanner;

enum Colours {
    WHITE,BLACK,RED,YELLOW,BLUE,BROWN,CYAN;
}

public class DataTypes {

    public static void main(String[] args) {
        byte years = 29;
        short year = 2020;
        int age;
        long stockSharesvalue = 2_345_767L;
        float shoppingValue = 289.99f;
        double salary = 89000.50;
        boolean isAvailable = false;
        char initial = 'S';

        System.out.println(Colours.BLACK);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Say number : ");
        int num = scanner.nextInt();
        int dblNum = num * 2;
        System.out.println("Double num is : " + dblNum);
    }
}
