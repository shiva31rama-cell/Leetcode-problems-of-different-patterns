public class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            // Removing the lowest set bit gives a smaller number
            // whose bit count is already known.
            dp[i] = dp[i & (i - 1)] + 1;
        }

        return dp;
    }
}
