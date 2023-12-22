package com.blit.String;

import java.util.Arrays;

public class MyString {

    public boolean reverseString(char ch[]){
        int len = ch.length;
        int r = 0;
        char[] newArr = new char[len];

        //len = 5
        //'R' 'A' 'C' 'E' 'C' 'A' 'R'


        //System.out.print(ch[4])
        for(int i =len-1; i>=0; i--) {

            if(ch[r] != ch[i]){
                return false;
            }
            r++;
        }

        return true;

    }

    public static void main(String[] args) {

        MyString obj = new MyString();
       boolean result = obj.reverseString(new char[]{'R','a','C','E','C','A','R'});
        System.out.println(result);
//        String str1 = new String("Computer");
//        String str = "Computer";t
//        String str2 = "Computer";
//        String myStr = new String("John");
//        System.out.println(str1.equals(str2));
    }
}
