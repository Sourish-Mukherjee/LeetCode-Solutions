/*
  Author: Sourish Mukherjee
  Date : 29-04-2020
*/

class Solution {
    
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the array so that we can use 2 pointer technique
        List<List<Integer>> list = new ArrayList();
        int n = nums.length;
        for(int i=0;i<n-2;i++){//Since we are using 2 pointers for the other two elements, i has to be less than n-2
            if(i==0 || (i>0 && nums[i]!=nums[i-1])) { // To check if we are not seeing duplicate elements
                int left =i+1;
                int right = n-1;
                int diff= 0-nums[i];//Actual sum which we need to find out using 2 pointer
                while(left<right){
                    if(nums[left]+nums[right]==diff)
                    {
                        list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                         while(left<right && nums[left]==nums[left+1]) left++; // Skip Duplicate elements
                         while(left<right && nums[right]==nums[right-1]) right--; // Skup Duplicate elements
                        left++;right--;
                    }
                    else if(nums[left]+nums[right]>diff)
                        right--;
                    else
                        left++;
                }
            }
        }
        return list;
        
    }
}
