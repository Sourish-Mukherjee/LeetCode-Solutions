/*
  Author: Sourish Mukherjee
  Date: 11-05-2020
  Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
*/

class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1])
                result+=prices[i]-prices[i-1];
        }
        return result;
    }
}
