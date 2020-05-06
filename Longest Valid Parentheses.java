/*
  Author: Sourish Mukherjee
  Date: 06-06-2020
  Link: https://leetcode.com/problems/longest-valid-parentheses/
*/

class Solution {
    public int longestValidParentheses(String s) {
        int left =0,right=0,max=0;
        for(char c: s.toCharArray())
        {
            if(c=='(')
                left++;
            else 
                right++;
            if(left==right)
                max = Math.max(max,2*right);
            if(right>left)
                left=right=0;
        }
        left=0;right=0;
        for(int i = s.length()-1;i>=0;i--){
             if(s.charAt(i)=='(')
                left++;
            else 
                right++;
            if(left==right)
                max = Math.max(max,2*left);
            if(left>right)
                left=right=0;
        }
        return max;
    }
}
