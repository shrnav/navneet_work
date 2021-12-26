package com.test.array;

public class Duplicate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        boolean isDuplicate = containsDuplicate(arr);
    }

    private static boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(i!=j)
                    if(nums[i]==nums[j]){
                        flag=true;
                    }
            }

        }
        if(flag){
            System.out.println("Yes");

        }
        else
        {
            System.out.println("N");
        }
        return flag;
    }
}
