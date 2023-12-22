package com.blit;

public class TaxReport {

//    private Calc2023 calc2023;
 private TaxCalc taxCalc;
    TaxReport(TaxCalc taxCalc){

        this.taxCalc = taxCalc;

    }



    public void show(){
        System.out.println("Your tax is " + this.taxCalc.calc());
    }


}
