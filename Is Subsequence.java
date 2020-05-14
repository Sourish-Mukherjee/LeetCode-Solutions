/*
  Author: Sourish Mukherjee
  Date: 14-02-2020
  Link: https://leetcode.com/problems/is-subsequence/
*/

class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
            return true;
        int scount = 0,tcount =0;
        while(tcount<t.length())
        {
            if(s.charAt(scount)==t.charAt(tcount))
                scount++;
            if(scount==s.length()) 
                return true;
            tcount++;
        }
        return false;
    }
}
