package com.test.array;

public class Rotate {
    public static void main(String[] args) {
        int nums[] = { -1,-100,3,99};
        int k =2;
        int rotatedArray[] = rotate(nums, 3);
        for (int i = 1; i <=rotatedArray.length- k; i++) {
            System.out.println(rotatedArray[i]);
        }
    }
    private static int[] rotate(int[] nums, int k) {
        int temp = nums[0];
        int remArr [] = new int[nums.length+k];
        for (int i = 0; i <=k ; i++) {
            remArr[nums.length-k+i] = nums[i];
        }
        int p =0;
        for (int i = k; i <nums.length ; i++) {
            //System.out.println("=="+nums[i]);
            remArr[p] = nums[i];
            p++;
        }
        StringBuilder sb = new StringBuilder();
       // System.out.print("[");
sb.append("[");
//String result;
        for(int i=1;i<=remArr.length-k;i++){
            sb.append(remArr[i]);
            if(i!=nums.length)
                sb.append(",");
    //        result = String.join(",",remArr[i]+"");

            //sb.app

        }
        sb.append("]");
        //System.out.print("]");
        System.out.print(sb);
        return remArr;
    }
}
