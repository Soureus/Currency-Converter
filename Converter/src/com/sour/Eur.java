package com.sour;

public class Eur {

    private double converted;
    private double amount;
    private double roundOff;

    public Eur() {

    }

    public double toDollar(){

        converted = amount * 1.19127;
        roundOff = Math.round(converted * 100.0)/100.0;
        converted = roundOff;
        return converted;

    }


    public double toAud(){

        converted = amount * 1.545022;
        roundOff = Math.round(converted * 100.0)/100.0;
        converted = roundOff;
        return converted;

    }

    public double toYen(){

        converted = amount * 129.269;
        roundOff = Math.round(converted * 100.0)/100.0;
        converted = roundOff;
        return converted;

    }

    public double toGbp(){

        converted = amount * 0.856412;
        roundOff = Math.round(converted * 100.0)/100.0;
        converted = roundOff;
        return converted;

    }

    public double getConverted() {
        return converted;
    }

    public void setConverted(double converted) {
        this.converted = converted;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
