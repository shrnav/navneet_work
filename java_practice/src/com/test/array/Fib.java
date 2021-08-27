package com.test.array;

public class Fib {
    //1 1 2 3 5 8 13 .
    static int y;
    public static void main(String[] args) {
      //  int x = fibnoci(3);
        for (int i = 1; i <=15 ; i++) {
            System.out.println(fibnoci(i));
        }

    }


    public static int fibnoci(int n) {
        if (n == 1 || n == 2) {
            //System.out.println(n);
            //y=n;
            return 1;
        } else {
            return fibnoci(n-1) + fibnoci(n - 2);
            //n--;
            //return y;
        }

    }
}


