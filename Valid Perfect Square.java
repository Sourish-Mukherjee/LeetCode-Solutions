/*
  Author: Sourish Mukherjee
  Date: 09-05-2020
  Link: https://leetcode.com/problems/valid-perfect-square/
*/


class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
            return true;
         long low = 1, high = num / 2;
         while (low <= high) {
            long mid = low + (high - low) / 2;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            
        }
        return false;
    }
}
