/*
  Author: Sourish Mukherjee
  Date: 29-04-2020
*/

/* 
   The problem is based on Kadane's algorithm.
   GeeksForGeeks : https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
   YouTube : https://www.youtube.com/watch?v=2MmGzdiKR9Y
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int actualMax = nums[0];
        for(int i =1;i<nums.length;i++){
            maxSoFar = Math.max(maxSoFar+nums[i],nums[i]);
            actualMax = Math.max(maxSoFar,actualMax);
        }
        return actualMax;
    }
}
