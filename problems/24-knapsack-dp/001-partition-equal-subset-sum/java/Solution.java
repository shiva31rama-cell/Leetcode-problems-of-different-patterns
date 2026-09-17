public class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int value : nums) {
            total += value;
        }

        if (total % 2 != 0) {
            return false;
        }

        int target = total / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int value : nums) {
            for (int sum = target; sum >= value; sum--) {
                dp[sum] = dp[sum] || dp[sum - value];
            }
        }

        return dp[target];
    }
}
