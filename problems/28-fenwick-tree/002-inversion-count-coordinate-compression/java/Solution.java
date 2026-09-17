import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    private static class FenwickTree {
        private final int[] tree;

        FenwickTree(int size) {
            tree = new int[size + 1];
        }

        void add(int index, int value) {
            while (index < tree.length) {
                tree[index] += value;
                index += index & -index;
            }
        }

        int sum(int index) {
            int result = 0;
            while (index > 0) {
                result += tree[index];
                index -= index & -index;
            }
            return result;
        }
    }

    public long countInversions(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> rank = new HashMap<>();
        int nextRank = 1;
        for (int value : sorted) {
            if (!rank.containsKey(value)) {
                rank.put(value, nextRank++);
            }
        }

        FenwickTree bit = new FenwickTree(rank.size());
        long inversions = 0;
        int processed = 0;

        for (int value : nums) {
            int currentRank = rank.get(value);

            // Processed values greater than the current value.
            int lessOrEqual = bit.sum(currentRank);
            inversions += (long) processed - lessOrEqual;

            bit.add(currentRank, 1);
            processed++;
        }

        return inversions;
    }
}
