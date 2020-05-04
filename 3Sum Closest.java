/*
  Author: Sourish Mukherjee
  Date: 04-05-2020
  Link: https://leetcode.com/problems/3sum-closest/
*/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-1;i++)
        {
            int left =i+1;
            int right = nums.length-1;
            int close_so_far = 0;
            while(left<right)
            {
                close_so_far = nums[i]+nums[left]+nums[right];
                if(Math.abs(target-close_so_far)<Math.abs(target-close))
                    close=close_so_far;
                if(target-close==0)
                    return target;
                if(close_so_far > target)
                    right--;
                else
                    left++;
            }
        }
        return close;
        
    }
}
