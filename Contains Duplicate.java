/*
  Author: Sourish Mukherjee
  Date: 08-05-2020
  Link: https://leetcode.com/problems/contains-duplicate/
*/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int n: nums)
        {
            if(set.contains(n))
                return true;
            set.add(n);
        }
        return false;
    }
}
