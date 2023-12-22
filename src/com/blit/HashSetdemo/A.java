package com.blit.HashSetdemo;

import java.util.Objects;

public class A {
    int n;

    A(int n) {
        this.n = n;

    }

    @Override
    public String toString() {
        return n + " ";
    }

//    @Override
//    public boolean equals(Object o) {
//
//    }


    @Override
    public int hashCode() {
        return n;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        A a = (A) o;
//        return n == a.n;
//    }
    @Override
    public boolean equals(Object o) {
        return o.hashCode() == this.hashCode();
    }
//}


}
