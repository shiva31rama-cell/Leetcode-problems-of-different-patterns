public class Solution {
    private int[] minTree, maxTree;
    private int n;

    public void build(int[] a) {
        n = a.length;
        minTree = new int[4 * n];
        maxTree = new int[4 * n];
        build(1, 0, n - 1, a);
    }

    private void build(int node, int l, int r, int[] a) {
        if (l == r) { minTree[node] = maxTree[node] = a[l]; return; }
        int m = l + (r - l) / 2;
        build(node * 2, l, m, a); build(node * 2 + 1, m + 1, r, a);
        pull(node);
    }

    private void pull(int node) {
        minTree[node] = Math.min(minTree[node * 2], minTree[node * 2 + 1]);
        maxTree[node] = Math.max(maxTree[node * 2], maxTree[node * 2 + 1]);
    }

    public int[] query(int ql, int qr) {
        int[] result = query(1, 0, n - 1, ql, qr);
        return result;
    }

    private int[] query(int node, int l, int r, int ql, int qr) {
        if (qr < l || r < ql) return new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE};
        if (ql <= l && r <= qr) return new int[]{minTree[node], maxTree[node]};
        int m = l + (r - l) / 2;
        int[] a = query(node * 2, l, m, ql, qr);
        int[] b = query(node * 2 + 1, m + 1, r, ql, qr);
        return new int[]{Math.min(a[0], b[0]), Math.max(a[1], b[1])};
    }

    public void update(int index, int value) { update(1, 0, n - 1, index, value); }

    private void update(int node, int l, int r, int index, int value) {
        if (l == r) { minTree[node] = maxTree[node] = value; return; }
        int m = l + (r - l) / 2;
        if (index <= m) update(node * 2, l, m, index, value);
        else update(node * 2 + 1, m + 1, r, index, value);
        pull(node);
    }
}