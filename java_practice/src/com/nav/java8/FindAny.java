package com.nav.java8;

import java.util.stream.Stream;

public class FindAny {

    public static void main(String[] args) {

        int arr[] = {1,1,2};
        int k[] =  removeDuplicates(arr);
        for (int i = 0; i <k.length-1 ; i++) {
            System.out.println(k[i]);
        }


    }

         public static int[] removeDuplicates(int[] nums) {
         int j=0;
         int finalArr[] = new int[nums.length];
         //[1,1,2,3] == [1,2]
         for (int i = 0; i <nums.length-1 ; i++) {
             if(nums[i]==nums[i+1])
             {
                 continue;
             }
             else
             {
                 j++;
                 finalArr[j-1] = nums[i];
             }
             finalArr[j] = nums[i+1];
         }

         return finalArr;
     }
}
