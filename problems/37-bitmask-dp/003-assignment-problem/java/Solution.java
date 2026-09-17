import java.util.*;
public class Solution {
 public int minCost(int[][] cost){int n=cost.length,N=1<<n; int[] dp=new int[N]; Arrays.fill(dp,1_000_000_000); dp[0]=0; for(int mask=0;mask<N;mask++){int worker=Integer.bitCount(mask); if(worker==n)continue; for(int job=0;job<n;job++)if((mask&(1<<job))==0) dp[mask|1<<job]=Math.min(dp[mask|1<<job],dp[mask]+cost[worker][job]);} return dp[N-1];}
}