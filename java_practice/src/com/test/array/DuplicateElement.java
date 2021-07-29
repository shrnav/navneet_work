package com.test.array;

import java.util.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        int [] arr1 = {1,3,4,3,7,7,9,9};
        String str= "Jaaava";
        char[] ary = str.toCharArray();
        Arrays.sort(ary);
//        for (int i = 1; i <arr1.length-1 ; i++) {
//            if(arr1[i]==arr1[i+1] && (arr1[i] <= arr1.length)){
//                System.out.println(arr1[i]+ " has duplicate");
//            }
//        }
        System.out.println(ary.length);
        for (char i = 0; i <ary.length-1 ; i++) {
            System.out.println(ary[i]==ary[i+1]);
            if(ary[i]==ary[i+1] && (ary[i] <= ary.length)){
                System.out.println(ary[i]+ " has duplicate");
            }
        }
    }
}
