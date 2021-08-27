package com.test.array;


import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number<0){
            return;
        }
        boolean isPrime = checkPrime(number);
        System.out.println(isPrime);
    }

    static boolean checkPrime(int numbers) {
        if (numbers == 0 || numbers == 1) { return false; }
        for (int i = 2; i <numbers ; i=i+1) {



            if(numbers%i==0){
                return false;
            }
        }
        return true;
    }
}