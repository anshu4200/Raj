package com.develop.SpringRedditProject.DSA100Question.Arrays;

public class BuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices.length == 1) return 0;

        int min = prices[0];
        int max = 0;
        for(int i=1; i<prices.length; i++) {
            if(prices[i] - min > max) {
                max = prices[i] - min;
            }

            if(prices[i] < min) {
                min = prices[i];
            }
        }
        return max;
    }
}
