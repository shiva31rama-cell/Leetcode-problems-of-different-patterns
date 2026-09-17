public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                // Target must be in the right half.
                left = mid + 1;
            } else {
                // Target must be in the left half.
                right = mid - 1;
            }
        }

        return -1;
    }
}
