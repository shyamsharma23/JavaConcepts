package com.blit.Threads;

public class CountThread extends Thread{
    @Override
    public void run(){

        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=5; i<=6; i++){
            System.out.println(i);
        }
    }
}
