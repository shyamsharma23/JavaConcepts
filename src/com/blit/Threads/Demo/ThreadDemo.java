package com.blit.Threads.Demo;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());




            Thread thread1 = new Thread(new MyThread());
            thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//
//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("Scanning the downloaded file: " + Thread.currentThread().getName());
//
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        Thread thread2 = new Thread(new MyThread2());
//        thread2.start();

//        Resource resource = new Resource();
//
//        List<Thread> threadList = new ArrayList<>();
//
//        Thread thread3 = new Thread(new MyThread3(resource));
//        thread3.start();
//        try {
//            thread3.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

//        Thread thread4 = new Thread(new MyThread4(resource));
//        thread4.start();
//
//        threadList.add(thread3);
//        threadList.add(thread4);
//
//        for(Thread thread : threadList){
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
////        try {
////            thread4.join();
////        } catch (InterruptedException e) {
////            throw new RuntimeException(e);
////        }
//
//
//        System.out.println(resource.getTotal());

    }
}
