/*
  Author: Sourish Mukherjee
  Date: 11-05-2020
  Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
*/

class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0)
            return 0;
        int min = Integer.MAX_VALUE;
        int result =Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            min = Math.min(prices[i],min);
            if(prices[i]-min > result)
                result=prices[i]-min;
        }
        if(result == Integer.MIN_VALUE)
            return 0;
        return result;
    }
}
