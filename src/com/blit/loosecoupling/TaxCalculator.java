package com.blit.loosecoupling;

public class TaxCalculator implements TaxCalculator2023 {

    double income;

//    double extra;

    TaxCalculator(double income){
        this.income = income;

    }


    @Override
    public double calculateTax() {
        return 0.3 * this.income;
    }
}
