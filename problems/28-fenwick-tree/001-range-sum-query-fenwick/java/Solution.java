public class Solution {
    private final int[] bit;
    private final int[] values;

    public Solution(int[] nums) {
        values = nums.clone();
        bit = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) add(i + 1, nums[i]);
    }

    private void add(int index, int delta) {
        while (index < bit.length) {
            bit[index] += delta;
            index += index & -index;
        }
    }

    private int prefixSum(int index) {
        int sum = 0;
        while (index > 0) {
            sum += bit[index];
            index -= index & -index;
        }
        return sum;
    }

    public void update(int index, int value) {
        int delta = value - values[index];
        values[index] = value;
        add(index + 1, delta);
    }

    public int sumRange(int left, int right) {
        return prefixSum(right + 1) - prefixSum(left);
    }
}
