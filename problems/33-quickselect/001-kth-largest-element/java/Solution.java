public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int pivot = partition(nums, left, right);
            if (pivot == target) return nums[pivot];
            if (pivot < target) left = pivot + 1;
            else right = pivot - 1;
        }
        return -1;
    }

    private int partition(int[] nums, int left, int right) {
        int pivotValue = nums[right];
        int store = left;
        for (int i = left; i < right; i++) {
            if (nums[i] <= pivotValue) {
                swap(nums, i, store++);
            }
        }
        swap(nums, store, right);
        return store;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a]; nums[a] = nums[b]; nums[b] = temp;
    }
}
