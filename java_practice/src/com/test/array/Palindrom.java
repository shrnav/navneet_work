package com.test.array;

public class Palindrom {

    public static void main(String[] args) {
        int a =200;

        boolean y = isPalindrome(a);
        System.out.println(y);
    }

    public static boolean isPalindrome(int x) {
        int revertedNumber =0;

        int mod = 1;
        int res = 0;
        int original = x;
        if(x<0 || (x % 10 == 0 && x != 0)){
            return false; //All negative numbers are non palindroms.
        }
        else if(x<99 && x>9){

            int a = x%10;
            int b = x/10;
            if(a==b){
                return true;
            }
        }
        else
        {
            while(x > revertedNumber) {
                revertedNumber = revertedNumber * 10 + x % 10;
                x /= 10;


            }
            System.out.println("x=="+x);
            System.out.println("=="+revertedNumber);
            if(x==revertedNumber || x == revertedNumber/10){
                return true;
            }
        }
        return false;
    }

}
