package com.blit.dependencyinjection;

public class Main {
    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculatorImpl(2000, 3000);
        TaxReport taxReport = new TaxReport(taxCalculator);
        taxReport.show();

    }
}
