package com.severinu.session4.lab;

public class WalletTester2 {
    public static void main(String[] args) {
        Card card1 = new CallingCard("HappyCallingCard", "1234-567-890",1234);
        Card card2 = new DriverLicence("John Doe", "123456789", 2017);

        Wallet wallet = new Wallet();
        wallet.addCard(card1);
        wallet.addCard(card2);

        int expected = 1;
        int actual = wallet.getExpiredCardCount();
        if( expected == actual ){
            System.out.println("TEST: OK \t getExpiredCardCount \t expected: "+ expected + " actual: " + actual );
        } else {
            System.out.println("TEST: FAILED \t getExpiredCardCount \t expected: "+ expected + " actual: " + actual );
        }
    }
}
