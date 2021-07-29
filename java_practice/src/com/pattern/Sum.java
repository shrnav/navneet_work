package com.pattern;

public class Sum {
    public static void main(String[] args) {
        int values[] = {1,2,3,4};
        int sum = 0;
        for(int i=0;i<values.length;i++)
        {
            sum = sum+values[i];

        }
        System.out.println(sum);
    }


}
