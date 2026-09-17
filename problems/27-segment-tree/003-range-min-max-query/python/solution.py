class SegmentTree:
    def __init__(self, nums):
        self.n = len(nums)
        self.min_tree = [0] * (4 * self.n)
        self.max_tree = [0] * (4 * self.n)
        self._build(1, 0, self.n - 1, nums)

    def _build(self, node, left, right, nums):
        if left == right:
            self.min_tree[node] = self.max_tree[node] = nums[left]
            return
        mid = (left + right) // 2
        self._build(node * 2, left, mid, nums)
        self._build(node * 2 + 1, mid + 1, right, nums)
        self._pull(node)

    def _pull(self, node):
        self.min_tree[node] = min(self.min_tree[node * 2], self.min_tree[node * 2 + 1])
        self.max_tree[node] = max(self.max_tree[node * 2], self.max_tree[node * 2 + 1])

    def query(self, ql, qr):
        return self._query(1, 0, self.n - 1, ql, qr)

    def _query(self, node, left, right, ql, qr):
        if qr < left or right < ql:
            return float('inf'), float('-inf')
        if ql <= left and right <= qr:
            return self.min_tree[node], self.max_tree[node]
        mid = (left + right) // 2
        a = self._query(node * 2, left, mid, ql, qr)
        b = self._query(node * 2 + 1, mid + 1, right, ql, qr)
        return min(a[0], b[0]), max(a[1], b[1])

    def update(self, index, value):
        self._update(1, 0, self.n - 1, index, value)

    def _update(self, node, left, right, index, value):
        if left == right:
            self.min_tree[node] = self.max_tree[node] = value
            return
        mid = (left + right) // 2
        if index <= mid:
            self._update(node * 2, left, mid, index, value)
        else:
            self._update(node * 2 + 1, mid + 1, right, index, value)
        self._pull(node)
