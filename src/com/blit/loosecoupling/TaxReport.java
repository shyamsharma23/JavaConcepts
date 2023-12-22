package com.blit.loosecoupling;

public class TaxReport {

//    TaxCalculator taxCalculator = new TaxCalculator(1000, 30);

    TaxCalculator2023 taxCalculator2023;

    TaxReport(TaxCalculator2023 taxCalculator2023){
        this.taxCalculator2023 = taxCalculator2023;

    }
    public void showReport(){
        System.out.println(taxCalculator2023.calculateTax());

    }

}
