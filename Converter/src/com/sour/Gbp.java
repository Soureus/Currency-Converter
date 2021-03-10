package com.sour;

public class Gbp {

    private double converted;
    private double amount;
    private double roundOff;

    Gbp(){

    }

    public double toDollar(){

        converted = amount * 1.38858;
        roundOff = Math.round(converted * 100.0)/100.0;
        converted = roundOff;
        return converted;

    }


    public double toAud(){

        converted = amount * 1.80646;
        roundOff = Math.round(converted * 100.0)/100.0;
        converted = roundOff;
        return converted;

    }

    public double toYen(){

        converted = amount * 151.084;
        roundOff = Math.round(converted * 100.0)/100.0;
        converted = roundOff;
        return converted;

    }

    public double toEuro(){
        converted = amount * 1.16922;
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
