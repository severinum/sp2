package com.severinu.session4.lab;

public class CadEqualsTest {
    public static void main(String[] args) {
        Card card1 = new CallingCard("HappyCallingCard", "1234-567-890",1234);
        Card card2 = new DriverLicence("John Doe", "123456789", 2025);
        Card card3 = new IDCard("John Doe", "AB9876542");
        Card card4 = new Card("John Doe");

        Card card10 = new CallingCard("HappyCallingCard", "1234-567-890",1234);
        Card card20 = new DriverLicence("John Doe", "123456789", 2025);
        Card card30 = new IDCard("John Doe", "AB9876542");
        Card card40 = new Card("John Doe");

        Card card100 = new CallingCard("HappyCallingCard 2", "1234-567-890",1234);
        Card card200 = new DriverLicence("John Doe", "123456788", 2025);
        Card card300 = new IDCard("John Doe", "AB9876541");
        Card card400 = new Card("John Does");

        checkIfCardsAreEqual(card1 , card10, "card1", "card10");
        checkIfCardsAreEqual(card2 , card20, "card2", "card20");
        checkIfCardsAreEqual(card3 , card30, "card3", "card30");
        checkIfCardsAreEqual(card4 , card40, "card4", "card40");

        checkIfCardsAreEqual(card1 , card100, "card1", "card100");
        checkIfCardsAreEqual(card2 , card200, "card2", "card200");
        checkIfCardsAreEqual(card3 , card300, "card3", "card300");
        checkIfCardsAreEqual(card4 , card400, "card4", "card400");




    }

    public static boolean checkIfCardsAreEqual(Card c1, Card c2, String c1name, String c2name){
        if(c1.equals(c2)){
            System.out.println(c1name + " EQUALS " + c2name);
            return true;
        } else {
            System.out.println(c1name + " NOT EQUALS " + c2name);
            return false;
        }
    }
}
