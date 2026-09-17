class Solution:
    def is_interleave(self,a,b,c):
        if len(a)+len(b)!=len(c): return False
        dp=[False]*(len(b)+1); dp[0]=True
        for j in range(1,len(b)+1): dp[j]=dp[j-1] and b[j-1]==c[j-1]
        for i in range(1,len(a)+1):
            dp[0]=dp[0] and a[i-1]==c[i-1]
            for j in range(1,len(b)+1):
                dp[j]=(dp[j] and a[i-1]==c[i+j-1]) or (dp[j-1] and b[j-1]==c[i+j-1])
        return dp[-1]
