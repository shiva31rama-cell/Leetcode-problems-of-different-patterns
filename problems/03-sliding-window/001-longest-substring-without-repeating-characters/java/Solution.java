import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> window = new HashSet<>();
        int left = 0;
        int best = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            while (window.contains(current)) {
                // Remove the leftmost character until the window is valid again.
                window.remove(s.charAt(left));
                left++;
            }

            window.add(current);
            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}
