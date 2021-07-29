package com.test.array;

public class ReverseString {
    static String str = "This is world";
    public static void main(String[] args) {
        char[] strArray = str.toCharArray();
        for (int i = strArray.length; i > 0 ; --i) {
            System.out.println(strArray[i-1]);
        }
    }

}
