package com.blit.Threads.Demo1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread1 = new Thread(new Thread1());
        thread1.start();

//        thread1.interrupt();
//
//
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        System.out.println("Downloaded file is ready to be scanned!"+ Thread.currentThread().getName());
//
//        Thread thread2 = new Thread(new Thread2());
//        thread2.start();
//
//        try {
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("Done!:"+ Thread.currentThread().getName());
    }
}
