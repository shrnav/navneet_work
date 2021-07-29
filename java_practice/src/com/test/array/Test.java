package com.test.array;

public class Test {

    public static void main(String[] args) {
//        int n=1;
//        while (true) {
//            if (n < 0)
//                break;
//            foo(n);
//            n = n - 1;
//        }


        int sum = 0;
        int x[] = {-1,1,2,3,-3,4};
        for (int i = 0; i <x.length ; i++) {
            if (x[i] <= 0) continue;
            sum += x[i];

        }
        System.out.println(sum);
    }

    private static void foo(int n) {
        System.out.println(n+1);
    }


}
