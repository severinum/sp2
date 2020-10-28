package com.severinu.session4.lab;

public class Wallet {
    private Card card1;
    private Card card2;

    public void addCard(Card card){
        if(this.card1 == null){
            this.card1 = card;
        } else if( this.card2 == null){
            this.card2 = card;
        }
    }

    public String formatCards(){
        return "[" + card1.format() + " | " + card2.format() + "]";
    }

    public int getExpiredCardCount(){
        int count = 0;
        if(this.card1.isExpired() == true) {
            count++;
        } else if( this.card2.isExpired() == true){
            count++;
        }
        return count;
    }
}
