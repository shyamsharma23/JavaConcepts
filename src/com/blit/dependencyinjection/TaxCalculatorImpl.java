package com.blit.dependencyinjection;

public class TaxCalculatorImpl implements TaxCalculator{

    private double income;

    TaxCalculatorImpl(double income, double extraTax){
        this.income = income;

    }
    @Override
    public double calculate() {
        return (income * 0.3);
    }
}
