package com.sour;

public class Yen {

    private double converted;
    private double amount;
    private double roundOff;

    Yen(){

    }

    public double toAud(){

        converted = amount * 0.0119563;
        roundOff = Math.round(converted * 100.0)/100.0;
        converted = roundOff;
        return converted;

    }

    public double toEuro(){
        converted = amount * 0.00773928;
        roundOff = Math.round(converted*100.0)/100.0;
        converted = roundOff;
        return converted;
    }

    public double toGbp(){
        converted = amount * 0.00661817;
        roundOff = Math.round(converted*100.0)/100.0;
        converted = roundOff;
        return converted;
    }

    public double toUsd(){
        converted = amount *  0.00919340;
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

