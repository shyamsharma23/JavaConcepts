package com.blit.Threads.Demo1;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());


        System.out.println("Downloading files..."+ Thread.currentThread().getName());



        for (int i = 0; i<Integer.MAX_VALUE; i++){
            if(Thread.interrupted()) break;
            System.out.println("Downloading file "+ i);
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Download Complete!");

    }
}
