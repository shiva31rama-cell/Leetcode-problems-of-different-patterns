class Solution:
    def __init__(self, nums: list[int]):
        self.n = len(nums)
        self.tree = [0] * (4 * max(1, self.n))
        self.lazy = [0] * (4 * max(1, self.n))
        if self.n:
            self._build(nums, 1, 0, self.n - 1)

    def _build(self, nums: list[int], node: int, left: int, right: int) -> None:
        if left == right:
            self.tree[node] = nums[left]
            return

        mid = left + (right - left) // 2
        self._build(nums, node * 2, left, mid)
        self._build(nums, node * 2 + 1, mid + 1, right)
        self._pull(node)

    def range_add(self, query_left: int, query_right: int, delta: int) -> None:
        if not self.n or query_left > query_right:
            return
        self._range_add(1, 0, self.n - 1, query_left, query_right, delta)

    def _range_add(
        self,
        node: int,
        left: int,
        right: int,
        query_left: int,
        query_right: int,
        delta: int,
    ) -> None:
        if query_left <= left and right <= query_right:
            self.tree[node] += delta * (right - left + 1)
            self.lazy[node] += delta
            return

        self._push(node, left, right)
        mid = left + (right - left) // 2

        if query_left <= mid:
            self._range_add(node * 2, left, mid, query_left, query_right, delta)
        if query_right > mid:
            self._range_add(node * 2 + 1, mid + 1, right, query_left, query_right, delta)

        self._pull(node)

    def range_sum(self, query_left: int, query_right: int) -> int:
        if not self.n or query_left > query_right:
            return 0
        return self._range_sum(1, 0, self.n - 1, query_left, query_right)

    def _range_sum(
        self,
        node: int,
        left: int,
        right: int,
        query_left: int,
        query_right: int,
    ) -> int:
        if query_left <= left and right <= query_right:
            return self.tree[node]

        self._push(node, left, right)
        mid = left + (right - left) // 2
        total = 0

        if query_left <= mid:
            total += self._range_sum(node * 2, left, mid, query_left, query_right)
        if query_right > mid:
            total += self._range_sum(node * 2 + 1, mid + 1, right, query_left, query_right)

        return total

    def _push(self, node: int, left: int, right: int) -> None:
        if self.lazy[node] == 0 or left == right:
            return

        mid = left + (right - left) // 2
        delta = self.lazy[node]

        self.tree[node * 2] += delta * (mid - left + 1)
        self.tree[node * 2 + 1] += delta * (right - mid)
        self.lazy[node * 2] += delta
        self.lazy[node * 2 + 1] += delta
        self.lazy[node] = 0

    def _pull(self, node: int) -> None:
        self.tree[node] = self.tree[node * 2] + self.tree[node * 2 + 1]
