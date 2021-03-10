package com.sour;

public class Usd {

    private double converted;
    private double amount;
    private double roundOff;

    Usd(){

    }

    public double toAud(){

        converted = amount * 1.30084;
        roundOff = Math.round(converted * 100.0)/100.0;
        converted = roundOff;
        return converted;

    }

    public double toYen(){

        converted = amount * 108.786;
        roundOff = Math.round(converted * 100.0)/100.0;
        converted = roundOff;
        return converted;

    }

    public double toEuro(){
        converted = amount * 0.842044;
        roundOff = Math.round(converted*100.0)/100.0;
        converted = roundOff;
        return converted;
    }

    public double toGbp(){
        converted = amount * 0.719974 ;
        roundOff = Math.round(converted*100.0)/100.0;
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
