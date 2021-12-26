package com.nav.java8;

import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        boolean whether = isPermuationsToEachOther( "abc ","abc");
        System.out.println(whether);
    }

    private static boolean isPermuationsToEachOther(String first, String second){
        if(first.length()!=second.length())
        return false;

        if(sort(first).equals(sort(second))){
            return true;
        }
        return false;
    }
    private static String sort(String str) {

        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        System.out.println("=="+new String(arr));
        return new String(arr);
    }
}
