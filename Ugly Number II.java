/*
  Author: Sourish Mukherjee
  Date: 30-04-2020
  Link: https://leetcode.com/problems/ugly-number-ii/
*/

class Solution {
    public int nthUglyNumber(int n) {
        int dp[] = new int[n];
        int fac2 = 0, fac3 =0,fac5 =0;
        int mul2 =2, mul3=3,mul5=5;
        dp[0]=n;
        for(int i = 1;i<n;i++)
        {
            int num = (int)Math.min((int)Math.min(mul2,mul3),mul5);
            dp[i]=num;
            if(dp[i]==mul2)
            {
                fac2++;mul2=dp[fac2]*2;
            }
            if(dp[i]==mul3)
            {
                fac3++;mul3=dp[fac3]*3;
            }
            if(dp[i]==mul5)
            {
                fac5++;mul5=dp[fac5]*5;
            }
        }
        return dp[n-1];
    }
}
