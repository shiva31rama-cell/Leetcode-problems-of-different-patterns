class NumArray:
    def __init__(self, nums: list[int]):
        self.n = len(nums)
        self.tree = [0] * (4 * max(1, self.n))
        if self.n:
            self._build(nums, 1, 0, self.n - 1)

    def _build(self, nums, node, left, right):
        if left == right:
            self.tree[node] = nums[left]
            return
        mid = (left + right) // 2
        self._build(nums, node * 2, left, mid)
        self._build(nums, node * 2 + 1, mid + 1, right)
        self.tree[node] = self.tree[node * 2] + self.tree[node * 2 + 1]

    def update(self, index: int, val: int) -> None:
        if self.n:
            self._update(1, 0, self.n - 1, index, val)

    def _update(self, node, left, right, index, val):
        if left == right:
            self.tree[node] = val
            return
        mid = (left + right) // 2
        if index <= mid:
            self._update(node * 2, left, mid, index, val)
        else:
            self._update(node * 2 + 1, mid + 1, right, index, val)
        self.tree[node] = self.tree[node * 2] + self.tree[node * 2 + 1]

    def sumRange(self, left: int, right: int) -> int:
        if not self.n:
            return 0
        return self._query(1, 0, self.n - 1, left, right)

    def _query(self, node, left, right, query_left, query_right):
        if query_left <= left and right <= query_right:
            return self.tree[node]
        mid = (left + right) // 2
        total = 0
        if query_left <= mid:
            total += self._query(node * 2, left, mid, query_left, query_right)
        if query_right > mid:
            total += self._query(node * 2 + 1, mid + 1, right, query_left, query_right)
        return total
