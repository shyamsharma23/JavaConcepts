package com.blit.Threads.Demo;

public class Resource {
    volatile int num;

    public int getNum() {
        return num;
    }

    public void incrementNum() {
    synchronized (this){
        num++;
    }



    }


    public int getTotal(){
        return this.num;
    }

}
