import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        frequency.put(0, 1);

        int prefix = 0;
        int count = 0;

        for (int value : nums) {
            prefix += value;

            int needed = prefix - k;
            count += frequency.getOrDefault(needed, 0);

            frequency.put(prefix, frequency.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}
