package com.sour;

public class Aud {

    private double converted;
    private double amount;
    private double roundOff;

    Aud(){

    }


    public double toEuro(){
        converted = amount * 0.647274;
        roundOff = Math.round(converted*100.0)/100.0;
        converted = roundOff;
        return converted;
    }

    public double toGbp(){
        converted = amount * 0.553494;
        roundOff = Math.round(converted*100.0)/100.0;
        converted = roundOff;
        return converted;
    }

    public double toUsd(){
        converted = amount *  0.769169;
        roundOff = Math.round(converted*100.0)/100.0;
        converted = roundOff;
        return converted;
    }

    public double toYen(){
        converted = amount *  83.6523;
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
