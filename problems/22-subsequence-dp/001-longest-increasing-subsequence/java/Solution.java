import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> tails = new ArrayList<>();

        for (int value : nums) {
            int left = 0;
            int right = tails.size();

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (tails.get(mid) < value) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            if (left == tails.size()) {
                tails.add(value);
            } else {
                tails.set(left, value);
            }
        }

        return tails.size();
    }
}
