public class Solution {
    private int[] tree;
    private int n;

    public Solution(int[] nums) {
        n = nums.length;
        tree = new int[4 * Math.max(1, n)];
        if (n > 0) build(nums, 1, 0, n - 1);
    }

    private void build(int[] nums, int node, int left, int right) {
        if (left == right) {
            tree[node] = nums[left];
            return;
        }
        int mid = left + (right - left) / 2;
        build(nums, node * 2, left, mid);
        build(nums, node * 2 + 1, mid + 1, right);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    public void update(int index, int value) {
        if (n > 0) update(1, 0, n - 1, index, value);
    }

    private void update(int node, int left, int right, int index, int value) {
        if (left == right) {
            tree[node] = value;
            return;
        }
        int mid = left + (right - left) / 2;
        if (index <= mid) update(node * 2, left, mid, index, value);
        else update(node * 2 + 1, mid + 1, right, index, value);
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }

    public int sumRange(int left, int right) {
        if (n == 0) return 0;
        return query(1, 0, n - 1, left, right);
    }

    private int query(int node, int left, int right, int queryLeft, int queryRight) {
        if (queryLeft <= left && right <= queryRight) return tree[node];
        int mid = left + (right - left) / 2;
        int sum = 0;
        if (queryLeft <= mid) sum += query(node * 2, left, mid, queryLeft, queryRight);
        if (queryRight > mid) sum += query(node * 2 + 1, mid + 1, right, queryLeft, queryRight);
        return sum;
    }
}
