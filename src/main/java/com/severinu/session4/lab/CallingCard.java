package com.severinu.session4.lab;

import java.util.Objects;

public class CallingCard extends Card {
    private String cardNumber;
    private int pin;

    /**
     * Constructor
     * @param name1 owner name
     * @param cardNumber calling card number
     * @param pin pin to the card
     * @author Sewern Michota
     */
    public CallingCard(String name1, String cardNumber, int pin) {
        super(name1);
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    @Override
    public String format(){
        return super.format() + ", number: " + this.cardNumber + ", pin: " + this.pin;
    }

    @Override
    public String toString() {
        return this.name + "[number=" + this.cardNumber +",pin=" + this.pin +"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CallingCard that = (CallingCard) o;
        return pin == that.pin &&
                Objects.equals(cardNumber, that.cardNumber) &&
                Objects.equals(super.getName(), that.getName());
    }


}
