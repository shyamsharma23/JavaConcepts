package com.blit;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        TaxCalc taxCalc = new TaxCalc(100, 20);
        TaxReport taxReport = new TaxReport(taxCalc);
        taxReport.show();

    }
}
