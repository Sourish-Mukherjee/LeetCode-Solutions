/*
  Author: Sourish Mukherjee
  Date: 04-05-2020
  Link: https://leetcode.com/problems/climbing-stairs/
*/

// The problem is basically based on Fibonacci Series, or Formula.

class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2)
            return n;
        int a = 1;
        int b = 2;
        int c = 0;
        for(int i=3;i<=n;i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
