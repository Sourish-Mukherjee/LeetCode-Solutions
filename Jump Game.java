//Link: https://leetcode.com/problems/jump-game/

class Solution {
    public boolean canJump(int[] nums) {
        if(nums[0]==0 && nums.length!=1)
            return false;
        if(nums.length==1)
            return true;
        int good = nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=good)
                good=i;
        }
        return good==0;
    }
}
