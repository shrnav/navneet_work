package com.test.array;

public class SingleNumber {

    public static void main(String[] args) {
        int unique[] = {4,1,2,1,2};
        System.out.println(singleNumber(unique));
    }
    public static int singleNumber(int[] nums) {

        //nums =[1,2,3,1,2]
        int flag = 0;
        int val = 0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < nums.length - 1; j++) {
                if(i!=j) {
                    if (nums[i] == nums[j]) {
                        flag++;
                       // break;
                    } else {
                        val = nums[i];
                        //break;
                    }
                }
            }
        }

        if (flag == 0) {
            System.out.println(val);
        }

        return val;

    }
}