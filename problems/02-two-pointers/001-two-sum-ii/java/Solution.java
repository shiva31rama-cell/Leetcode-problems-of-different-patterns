public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // The problem expects 1-based indices.
                return new int[] { left + 1, right + 1 };
            }

            if (sum < target) {
                // Need a larger sum, so move left to a larger value.
                left++;
            } else {
                // Need a smaller sum, so move right to a smaller value.
                right--;
            }
        }

        return new int[0];
    }
}
