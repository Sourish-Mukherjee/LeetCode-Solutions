/* 
    Author: Sourish Mukherjee
    Date: 29-05-2020
    Problem Link: https://leetcode.com/problems/missing-number/
*/

class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length*(nums.length+1))/2;// Given array numbers are from 0 to n(size). 
        for(int n:nums)
            sum-=n;//Actual Sum of Array = Missing Element + Remaining elements 
        return sum;
    }
}
