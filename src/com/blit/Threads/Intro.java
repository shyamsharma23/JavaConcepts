package com.blit.Threads;

public class Intro {
    public static void main(String[] args) {
//        System.out.println(Thread.activeCount());
//        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Thread.currentThread().getName());


        Thread myThread = new CountThread();
        myThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        for(int i=0; i<5; i++){
            System.out.println(i);
        }






//        try {
//            myThread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


    }
}
