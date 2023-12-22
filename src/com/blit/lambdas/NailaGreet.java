package com.blit.lambdas;

public class NailaGreet {

    public static void greet(PrintHello printHello){
        printHello.sayHello("Good morning");
    }

    public static void main(String[] args) {
        NailaGreet.greet(NailaGreet::test);
    }

    public static void test(String str){
        System.out.println(str);
    }
}
