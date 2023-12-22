package com.blit.loosecoupling;

public class Main {

    public static void main(String[] args) {
        TaxCalculator2023 taxCalculator2023 = new TaxCalculator(1000);
        TaxReport taxReport = new TaxReport(taxCalculator2023);
        taxReport.showReport();
    }
}
