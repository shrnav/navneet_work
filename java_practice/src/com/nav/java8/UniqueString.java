package com.nav.java8;

public class UniqueString {
    public static void main(String[] args) {
        //Assuming 256 character
        System.out.println(isUnique("aabc"));

    }
    public static boolean isUnique(String str) {
        char[] arr = str.toCharArray();
        if (arr.length > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < arr.length; i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }

        return true;
    }

}
