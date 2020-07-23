//Link: https://leetcode.com/problems/kth-largest-element-in-an-array/

class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> q=new PriorityQueue<>();
        
        for(int element:nums){
            q.add(element);
            
            if(q.size()>k){
                q.remove();
            }
        }
        
        return q.peek();
        
    }
