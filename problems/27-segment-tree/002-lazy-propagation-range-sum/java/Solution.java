public class Solution {
    private long[] tree;
    private long[] lazy;
    private int n;

    public Solution(int[] nums) {
        n = nums.length;
        tree = new long[4 * Math.max(1, n)];
        lazy = new long[4 * Math.max(1, n)];
        if (n > 0) {
            build(nums, 1, 0, n - 1);
        }
    }

    private void build(int[] nums, int node, int left, int right) {
        if (left == right) {
            tree[node] = nums[left];
            return;
        }

        int mid = left + (right - left) / 2;
        build(nums, node * 2, left, mid);
        build(nums, node * 2 + 1, mid + 1, right);
        pull(node);
    }

    // Add delta to every value in [queryLeft, queryRight].
    public void rangeAdd(int queryLeft, int queryRight, long delta) {
        if (n == 0 || queryLeft > queryRight) {
            return;
        }
        rangeAdd(1, 0, n - 1, queryLeft, queryRight, delta);
    }

    private void rangeAdd(int node, int left, int right,
                          int queryLeft, int queryRight, long delta) {
        if (queryLeft <= left && right <= queryRight) {
            tree[node] += delta * (right - left + 1L);
            lazy[node] += delta;
            return;
        }

        push(node, left, right);
        int mid = left + (right - left) / 2;

        if (queryLeft <= mid) {
            rangeAdd(node * 2, left, mid, queryLeft, queryRight, delta);
        }
        if (queryRight > mid) {
            rangeAdd(node * 2 + 1, mid + 1, right, queryLeft, queryRight, delta);
        }

        pull(node);
    }

    // Return the sum of values in [queryLeft, queryRight].
    public long rangeSum(int queryLeft, int queryRight) {
        if (n == 0 || queryLeft > queryRight) {
            return 0;
        }
        return rangeSum(1, 0, n - 1, queryLeft, queryRight);
    }

    private long rangeSum(int node, int left, int right,
                          int queryLeft, int queryRight) {
        if (queryLeft <= left && right <= queryRight) {
            return tree[node];
        }

        push(node, left, right);
        int mid = left + (right - left) / 2;
        long sum = 0;

        if (queryLeft <= mid) {
            sum += rangeSum(node * 2, left, mid, queryLeft, queryRight);
        }
        if (queryRight > mid) {
            sum += rangeSum(node * 2 + 1, mid + 1, right, queryLeft, queryRight);
        }

        return sum;
    }

    private void push(int node, int left, int right) {
        if (lazy[node] == 0 || left == right) {
            return;
        }

        int mid = left + (right - left) / 2;
        long delta = lazy[node];

        tree[node * 2] += delta * (mid - left + 1L);
        tree[node * 2 + 1] += delta * (right - mid);
        lazy[node * 2] += delta;
        lazy[node * 2 + 1] += delta;
        lazy[node] = 0;
    }

    private void pull(int node) {
        tree[node] = tree[node * 2] + tree[node * 2 + 1];
    }
}
