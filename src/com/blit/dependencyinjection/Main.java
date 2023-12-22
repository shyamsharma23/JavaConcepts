package com.blit.dependencyinjection;

public class Main {
    public static void main(String[] args) {
        TaxCalculatorImpl taxCalculator = new TaxCalculatorImpl(1000);
        TaxReport taxReport = new TaxReport(taxCalculator);
        taxReport.show();

    }
}
