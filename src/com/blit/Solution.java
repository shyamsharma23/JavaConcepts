package com.blit;

import java.util.*;
public class Solution {


    public  static List<Integer> reverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();

        // Iterating over the original list in reverse order
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        return reversedList;
    }

    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        List<Integer> newArr = Solution.reverseList(arr);
        System.out.print(newArr);
    }
}