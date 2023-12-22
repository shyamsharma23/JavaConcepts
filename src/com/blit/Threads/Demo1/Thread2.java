package com.blit.Threads.Demo1;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Scanning the file..."+ Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("File is scanned!"+ Thread.currentThread().getName());
    }
}
