/*
  Author: Sourish Mukherjee
  Date: 29-04-2020
  Link: https://leetcode.com/problems/4sum/
*/

// We can solve the problem using 3 Sum approach.

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums.length<4 || 4*nums[0]>target)
            return new ArrayList();
        Set<List<Integer>> set = new HashSet();
        int n = nums.length;
        for(int i=0; i<n-3; i++) {
            if(nums[i]*4>target)
                return new ArrayList(set);
            for(int j=i+1; j<n-2; j++) {
                if(nums[j]*3>target-nums[i])
                    break;
                int left = j+1;
                int right = n-1;
                int diff = target-(nums[i]+nums[j]);
                while(left<right)
                {
                    if(nums[left]+nums[right]==diff)
                    {
                        set.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        left++;
                        right--;
                    }
                    else if(nums[left]+nums[right]>diff)
                        right--;
                    else
                        left++;
                }
            }
        }
        return new ArrayList(set);
    }
}
