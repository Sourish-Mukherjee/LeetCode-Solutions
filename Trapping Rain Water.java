/*
  Author: Sourish Mukherjee
  Date:10-5-2020
  Link: https://leetcode.com/problems/trapping-rain-water/
*/


class Solution {
    public int trap(int[] height) {
        int low[] = new int[height.length];
        int high[] = new int[height.length];
        int left =0;
        for(int i=0;i<height.length;i++)
            left=low[i]=Math.max(height[i],left);
        int right =0;
        for(int i=height.length-1;i>=0;i--)
            right=high[i]=Math.max(height[i],right);
        int count =0;
        for(int i=0;i<height.length;i++)
        {
            count+=Math.min(low[i],high[i])-height[i];
        }
        return count;
    }
}
