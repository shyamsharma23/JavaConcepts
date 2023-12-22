package com.blit.dependencyinjection;

public class TaxReport {
    private TaxCalculator taxCalculator;

    TaxReport(TaxCalculator taxCalculator){

        this.taxCalculator = taxCalculator;

    }

    public void show(){
        System.out.println(taxCalculator.calculate());
    }
}
