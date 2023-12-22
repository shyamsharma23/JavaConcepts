package com.blit.HashSetdemo;

import java.util.HashSet;
import java.util.Set;

public class Atest {
    public static void main(String[] args) {
      Set<A> mySet = new HashSet<>();

      A var1 = new A(10);
      A var2 = new A(13);
      A var3 = new A(11);
      A var4 = new A(10);


      mySet.add(var1);
      mySet.add(var2);
      mySet.add(var3);
      mySet.add(var4);



//        System.out.println(var1 ==var3);
//        System.out.println(var1.equals(var3));

//        System.out.println(mySet);
        for (A item: mySet) {

            System.out.print(item + " ");
            System.out.println(item.hashCode());

        }





    }
}
