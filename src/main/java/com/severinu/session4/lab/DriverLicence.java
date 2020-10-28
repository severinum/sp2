package com.severinu.session4.lab;

import java.time.LocalDate;

public class DriverLicence extends IDCard {
    private int expirationYear;

    public DriverLicence(String name, String idNumber, int expirationYear) {
        super(name, idNumber);
        this.expirationYear = expirationYear;
    }

    @Override
    public String format(){
        return super.format() + ", expiration year: " + this.expirationYear;
    }

    @Override
    public boolean isExpired(){
        int currentYear = LocalDate.now().getYear();
        if(currentYear > this.expirationYear){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length()-1) + ",expirationYear=" + this.expirationYear +"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverLicence that = (DriverLicence) o;
        return super.getName().equals(that.getName()) &&
                super.getIdNumber().equals(that.getIdNumber()) &&
                expirationYear == that.expirationYear;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
