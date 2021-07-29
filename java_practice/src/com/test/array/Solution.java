package com.test.array;

public class Solution {
    public static void main(String args[]) {
        //int nums[] = {3,2,4};
        //int arr[] = twoSum(nums,6);
        int x = reverse(-112);
        System.out.println(x);
    }
    public static int[] twoSum(int[] nums, int target) {
        int i =0;
        int j = 0;
        int k=0;
        int l=0;
        //int arr[]={};
        while(i<nums.length-1) {
            for( j=1;j<nums.length;j++){
                if((i!=j) && nums[i]+nums[j]==target)
                {
                    System.out.println(i+","+j);
                    k=i;
                    l=j;

                }
                //break;
            }

            i++;

        }//end of while

        //arr[1] =2;
        return new int[]{l,k};
    }

    public static int reverse(int x) {
        long res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
        }

        if (res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) {
            return 0;
        } else {
            return (int)res;
        }
    }
}
