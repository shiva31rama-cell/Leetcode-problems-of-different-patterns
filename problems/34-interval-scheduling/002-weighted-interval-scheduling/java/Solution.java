import java.util.Arrays;

public class Solution {
    public long maxWeight(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        // Sort by end time so compatible jobs form a prefix.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int n = intervals.length;
        long[] dp = new long[n + 1];

        for (int i = 1; i <= n; i++) {
            int start = intervals[i - 1][0];
            int profit = intervals[i - 1][2];

            // Find the last job ending at or before this start time.
            int previous = findPrevious(intervals, i - 1, start);

            long take = profit + dp[previous + 1];
            long skip = dp[i - 1];
            dp[i] = Math.max(skip, take);
        }

        return dp[n];
    }

    private int findPrevious(int[][] intervals, int endExclusive, int start) {
        int left = 0;
        int right = endExclusive - 1;
        int answer = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (intervals[mid][1] <= start) {
                answer = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;
    }
}
