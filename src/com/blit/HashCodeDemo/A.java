package com.blit.HashCodeDemo;

import java.util.HashSet;
import java.util.Set;

public class A {

    int n ;

    public A(int n){
        this.n = n;
    }
    @Override
    public String toString(){
        return n + " ";
    }

    public static void main(String[] args){
        Set<A> aset = new HashSet<>();
        aset.add(new A(10));
        aset.add(new A(11));
        aset.add(new A(10));

        for(A a:aset){
            System.out.print(a +"");

        }
    }
}
