package com.blit.java.concept;

public class Remote implements Volume, Channel {
    private int vol;

    private int channel;

    public Remote(int vol) {
        this.vol = vol;

    }
    public Remote(int channel, int vol){
        this.channel = channel;
    }





    @Override
    public void volumeUp() {
        System.out.println(this.vol + 1);
    }

    @Override
    public void volumeDown() {
        System.out.println(this.vol -1);
    }

    @Override
    public void channelNext() {
        System.out.println(this.channel + 1);
    }

    @Override
    public void channelPre() {
        System.out.println(this.channel -1);

    }
}
