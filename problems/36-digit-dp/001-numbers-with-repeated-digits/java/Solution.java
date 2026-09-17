import java.util.Arrays;

public class Solution {
    private String digits;
    private Integer[][][][] memo;

    public int numDupDigitsAtMostN(int n) {
        digits = String.valueOf(n);
        int length = digits.length();
        memo = new Integer[length][1 << 10][2][2];
        int unique = dfs(0, 0, true, false);
        return n - unique;
    }

    private int dfs(int pos, int mask, boolean tight, boolean started) {
        if (pos == digits.length()) return started ? 1 : 0;
        int t = tight ? 1 : 0;
        int s = started ? 1 : 0;
        if (memo[pos][mask][t][s] != null) return memo[pos][mask][t][s];

        int limit = digits.charAt(pos) - '0';
        int total = 0;
        for (int digit = 0; digit <= limit; digit++) {
            boolean nextTight = tight && digit == limit;
            if (!started && digit == 0) {
                total += dfs(pos + 1, mask, nextTight, false);
            } else if ((mask & (1 << digit)) == 0) {
                total += dfs(pos + 1, mask | (1 << digit), nextTight, true);
            }
        }
        return memo[pos][mask][t][s] = total;
    }
}
