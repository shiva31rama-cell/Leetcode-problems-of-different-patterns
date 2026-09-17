class Solution:
    def longest_palindrome_subseq(self, s):
        n=len(s); dp=[[0]*n for _ in range(n)]
        for i in range(n-1,-1,-1):
            dp[i][i]=1
            for j in range(i+1,n):
                dp[i][j]=2+(dp[i+1][j-1] if i+1<=j-1 else 0) if s[i]==s[j] else max(dp[i+1][j],dp[i][j-1])
        return dp[0][n-1] if n else 0
