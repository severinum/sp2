package com.severinu.session4.lab;

public class WalletTester {

    public static void main(String[] args) {
        Card card1 = new CallingCard("HappyCallingCard", "1234-567-890",1234);
        Card card2 = new DriverLicence("John Doe", "123456789", 2025);

        Wallet wallet = new Wallet();
        wallet.addCard(card1);
        wallet.addCard(card2);

        System.out.println(wallet.formatCards());

    }
}
