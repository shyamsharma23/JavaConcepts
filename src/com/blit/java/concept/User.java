package com.blit.java.concept;

public class User {
    public static void main(String[] args) {
        Remote remote = new Remote(4);
        Channel remoteForChannelOnly = new Remote(5, 10);
        Volume volume = new Remote(4);
    }
}
