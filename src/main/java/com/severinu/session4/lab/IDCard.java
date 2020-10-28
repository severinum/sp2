package com.severinu.session4.lab;

import java.util.Objects;

public class IDCard extends Card {
    private String idNumber;

    public IDCard(String name, String idNumber) {
        super(name);
        this.idNumber = idNumber;
    }

    @Override
    public String format(){
        return super.format() + ", id: " + this.idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "[id=" + this.idNumber + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        IDCard idCard = (IDCard) o;
        return super.getName().equals(idCard.getName()) &&
                Objects.equals(idNumber, idCard.idNumber);
    }

}
