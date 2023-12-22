package com.blit.Threads.Demo;

public class MyThread3 implements Runnable{

    private Resource resource;

    public MyThread3(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for(int i =0; i<10_000; i++){
            resource.incrementNum();
        }
    }
}
