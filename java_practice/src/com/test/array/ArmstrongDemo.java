package com.test.array;

import java.util.Scanner;

public class ArmstrongDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number::");
        int number = scanner.nextInt();
        boolean check = isArmstrongNumber(number);
        System.out.println(check);
    }

    public static boolean isArmstrongNumber(int number) {
        int orignalNumber = number;
        int firstModulus =  orignalNumber%10;
        int finalNumber = 0;

        for (int i = 0; i <(orignalNumber+"").length() ; i++) {

            int a = number/10;
            int b = number%10;
            number =a ;
            System.out.println(b);
            finalNumber = finalNumber+(b*b*b);
        }
        System.out.println("finalNumber=="+finalNumber);
        if(orignalNumber==finalNumber){
            return true;
        }
        return false;
    }

}
