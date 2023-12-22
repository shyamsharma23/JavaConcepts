package com.blit.multithreading;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyThread thread = new MyThread();
        thread.start();



        MyThread2 thread2 = new MyThread2();
        thread2.start();
        thread2.join();



        System.out.println(Thread.currentThread().getName());


//        Thread thread1 = new Thread(new Thread1());
//        thread1.start();
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println("Downloading fle...");
    }
}
