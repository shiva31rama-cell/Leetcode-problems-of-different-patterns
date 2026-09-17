import java.util.Arrays;

public class Solution {
    private int[] nums;
    private int target;
    private Boolean[] memo;

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int total = 0;
        for (int value : nums) total += value;
        if (k <= 0 || total % k != 0) return false;

        this.nums = nums.clone();
        this.target = total / k;
        Arrays.sort(this.nums);
        int n = nums.length;
        memo = new Boolean[1 << n];
        return dfs(0, 0);
    }

    private boolean dfs(int mask, int currentSum) {
        if (mask == (1 << nums.length) - 1) return currentSum == 0;
        if (memo[mask] != null) return memo[mask];

        for (int i = nums.length - 1; i >= 0; i--) {
            if ((mask & (1 << i)) != 0) continue;
            if (currentSum + nums[i] > target) continue;

            int nextSum = currentSum + nums[i];
            int nextMask = mask | (1 << i);
            if (nextSum == target) nextSum = 0;

            if (dfs(nextMask, nextSum)) return memo[mask] = true;
            if (currentSum == 0) break;
            while (i > 0 && nums[i] == nums[i - 1]) i--;
        }
        return memo[mask] = false;
    }
}
