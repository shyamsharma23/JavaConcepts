package com.blit.lambdas;

public class PrinterImpl implements Printer{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
    
}
