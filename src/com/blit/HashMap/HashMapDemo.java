package com.blit.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map<String, Integer> map = new HashMap<>();

        String s1 = "john";
        String s2 = "john";

        String s3 = "FB";
        String s4 = "Ea";

        System.out.print(s1.hashCode() +" "+ s2.hashCode());


        map.put("s3", 1);
        map.put("s4", 2);
//		map.put("b", 2);
//		map.put("c", 3);
//		map.put("d", 4);

    }
}
