package com.test.array;

public class Combination {

    public static void main(String[] args) {
        finadCombi("abc");
    }

    public static void finadCombi(String str){

        char charArr[] = str.toCharArray();
        for (char i = 0; i <charArr.length ; i++) {
            System.out.println(charArr[i]);
        }
    }
}
