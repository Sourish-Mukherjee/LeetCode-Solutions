class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet();
        int left = 0,right =0,max = 0,n = s.length();
        while(right<n) {
            if(!set.contains(s.charAt(right)))
                set.add(s.charAt(right++));
            else
                set.remove(s.charAt(left++));   
            max = Math.max(set.size(),max);
        }
        return max;
    }
}
