import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Store: number -> index where we saw that number.
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement was seen earlier, we found the pair.
            if (seen.containsKey(complement)) {
                return new int[] { seen.get(complement), i };
            }

            // Store the current number only after checking its complement.
            seen.put(nums[i], i);
        }

        // The problem guarantees an answer; this is a safe fallback.
        return new int[0];
    }
}
