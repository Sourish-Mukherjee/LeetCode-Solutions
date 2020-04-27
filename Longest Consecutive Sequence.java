
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet(); //Using Set because accessing is O(1) and it won't allow duplicates
        int max = 0;
        for(int n : nums)
            set.add(n); // Storing all the numbers in the set
        for(int n:set) {
            int c = 1; // Since every number will be a part of subsequence of, c = 1. 
            /* Suppose set is 5 2 4 1 3 , we see that for 4, 1,2 and 3 is already present so no need to count.
                We always want to check in increasing continuos manner, that is start from 1 only in this case. */
            if(!set.contains(n-1)) 
            {   
            /* now if no smaller elements, we can search for coninuity by increasing the number by +1 . Like 1 is the smallest in above 
            example, we check if 2 is present, then 3 and finally 4.
                while(set.contains(n+1)) // Contains function is O(1)
                {
                    c++; // Increment counter
                    n++;// Go to next number
                }
            }
            max = Math.max(c,max);
        }
        return max;
    }
}
