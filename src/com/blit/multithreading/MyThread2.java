package com.blit.multithreading;

public class MyThread2 extends Thread{
    @Override
    public void run(){

        System.out.println(Thread.currentThread().getName());

    }
}
