package com.blit;

public class TaxCalc implements Calc2023 {
    double income;

    double extraTax;

    TaxCalc(double income, double extraTax){
        this.income = income;
        this.extraTax = extraTax;


    }

    @Override
    public double calc(){
        return 0.3 * this.income + this.extraTax;
    }
}
