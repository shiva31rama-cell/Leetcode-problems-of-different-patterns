import java.util.Arrays;

public class Solution {
    public int tsp(int[][] cost) {
        int n = cost.length;
        if (n <= 1) {
            return 0;
        }

        int totalMasks = 1 << n;
        long[][] dp = new long[totalMasks][n];
        long inf = Long.MAX_VALUE / 4;

        for (long[] row : dp) {
            Arrays.fill(row, inf);
        }

        dp[1][0] = 0; // Start at city 0.

        for (int mask = 1; mask < totalMasks; mask++) {
            for (int last = 0; last < n; last++) {
                if ((mask & (1 << last)) == 0 || dp[mask][last] == inf) {
                    continue;
                }

                for (int next = 0; next < n; next++) {
                    if ((mask & (1 << next)) != 0) {
                        continue;
                    }

                    int nextMask = mask | (1 << next);
                    long newCost = dp[mask][last] + cost[last][next];
                    dp[nextMask][next] = Math.min(dp[nextMask][next], newCost);
                }
            }
        }

        int fullMask = totalMasks - 1;
        long answer = inf;

        for (int last = 1; last < n; last++) {
            answer = Math.min(answer, dp[fullMask][last] + cost[last][0]);
        }

        return (int) answer;
    }
}
