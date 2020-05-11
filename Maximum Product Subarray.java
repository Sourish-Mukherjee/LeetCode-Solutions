/*
  Author: Sourish Mukherjee
  Date: 11-5-2020
  Link: https://leetcode.com/problems/maximum-product-subarray/
*/
class Solution {
    public int maxProduct(int[] nums) {
    if(nums == null) return 0;
        int min = nums[0], max = nums[0], res = nums[0];
        for (int i=1; i<nums.length; i++) {
            int tempMax = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(tempMax * nums[i], min * nums[i]), nums[i]);
            res = Math.max(res, max);
        }
        
        return res;
    }
}
