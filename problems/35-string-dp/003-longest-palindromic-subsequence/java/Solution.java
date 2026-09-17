public class Solution {
    public int longestPalindromeSubseq(String s) {
        int n=s.length(); if(n==0)return 0;
        int[][] dp=new int[n][n];
        for(int i=n-1;i>=0;i--){dp[i][i]=1; for(int j=i+1;j<n;j++) dp[i][j]=s.charAt(i)==s.charAt(j)?2+(i+1<=j-1?dp[i+1][j-1]:0):Math.max(dp[i+1][j],dp[i][j-1]);}
        return dp[0][n-1];
    }
}