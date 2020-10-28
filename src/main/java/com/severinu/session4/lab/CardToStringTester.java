package com.severinu.session4.lab;

public class CardToStringTester {
    public static void main(String[] args) {
        Card card1 = new CallingCard("HappyCallingCard", "1234-567-890",1234);
        Card card2 = new DriverLicence("John Doe", "123456789", 2025);
        Card card3 = new IDCard("John Doe", "AB9876542");
        Card card4 = new Card("John Doe");


        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);
    }
}
