package com.test.array;

public class MaxProfit {

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int maxProfit =  maxProfit(prices);
        System.out.println(maxProfit);
    }

    public static int maxProfit(int[] prices) {
        int profit =0;
        for (int i = 0; i <prices.length-1 ; i++) {

            if(prices[i]>prices[i+1]){
                continue;
            }
            else
            {
                profit = profit+(prices[i+1]-prices[i]);
            }
        }

        return profit;
    }
}
