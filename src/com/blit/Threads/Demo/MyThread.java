package com.blit.Threads.Demo;

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Downloading a file ....:" + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Download complete");
    }
}
