class Solution:
    def min_cost(self,cost):
        n=len(cost); dp=[10**18]*(1<<n); dp[0]=0
        for mask in range(1<<n):
            worker=mask.bit_count()
            if worker==n: continue
            for job in range(n):
                if not mask>>job&1:
                    nxt=mask|1<<job
                    dp[nxt]=min(dp[nxt],dp[mask]+cost[worker][job])
        return dp[-1]
