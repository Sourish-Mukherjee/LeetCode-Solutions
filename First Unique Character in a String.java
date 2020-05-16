/*
  Author: Sourish Mukherjee
  Date: 16-05-2020
  Link: https://leetcode.com/problems/first-unique-character-in-a-string/
*/
class Solution {
    public int firstUniqChar(String s) {
        int [] charCount = new int[26];
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            charCount[c - 'a'] = charCount[c - 'a'] + 1;
        }
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(charCount[c - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }        
}
