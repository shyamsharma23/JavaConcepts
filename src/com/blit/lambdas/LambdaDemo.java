package com.blit.lambdas;

import java.util.function.Consumer;

public class LambdaDemo  {

    public static void greet(Printer printer) { //accepting a interface object
//        printer.print("Hello World from lambda an. function");
        printer.print("Hello world");
    }

    public static void greetAgain(Printer printer){
        printer.print("Hello from another method");
    }

    public static void main(String[] args) {
//        Printer printer = new PrinterImpl();
//        Consumer<String> myVar = (message) -> System.out.println(message);
//        LambdaDemo.greet((message) -> System.out.println(message));
//        LambdaDemo.greet(System.out::println);//Supplier, Consumer,  Predicate, Function
//        Consumer<String> var1 = (mymessage) -> System.out.println(mymessage);
//        LambdaDemo.greet((message)-> System.out.println(message));

        LambdaDemo.greet(System.out::print);

        LambdaDemo.greetAgain((message)-> System.out.println(message));
    }

    public static void printResult(String mes){
        System.out.println(mes);
    }
}
