/**
 Author : Sourish Mukherjee
 Language: Java
 Date : 27-04-2020
*/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Use Of HashSet, because Sets don't allow duplicate characters
        HashSet<Character> set = new HashSet();
        //Use Of Two Pointers left and right
        int left = 0,right =0,max = 0,n = s.length();
        while(right<n) {
            //If the set does not contain the given character, add it to the set
            if(!set.contains(s.charAt(right)))
                set.add(s.charAt(right++));// Post increment the right operator
            else
                set.remove(s.charAt(left++));// If it does contain the set, remove the characters from the left
            max = Math.max(set.size(),max);//Cacluclate max size by checking set size and max value
        }
        return max;
    }
}
