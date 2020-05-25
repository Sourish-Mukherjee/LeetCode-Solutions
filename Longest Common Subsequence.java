//Link: https://leetcode.com/problems/longest-common-subsequence

class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
       if(text1.length()==0 || text2.length()==0) return 0;
        
        int m = text1.length();
        int n = text2.length();
        
        int[][] dp = new int[m+1][n+1];
        
        char[] array1 = text1.toCharArray();
        char[] array2 = text2.toCharArray();
        
        for (int i = 1; i <= m; i++) {
            
            for (int j = 1; j <= n; j++) {
                
                if (array1[i-1] == array2[j-1]) {
                    
                   dp[i][j] = dp[i-1][j-1] + 1;
                    
                } else {
                    
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return dp[m][n];
    }
}
