package com.blit.Threads.Demo;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Scanning completed. : "+Thread.currentThread().getName());
    }
}
