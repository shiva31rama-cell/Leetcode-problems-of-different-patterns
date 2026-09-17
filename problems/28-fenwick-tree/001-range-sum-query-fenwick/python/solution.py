class NumArray:
    def __init__(self, nums: list[int]):
        self.values = nums[:]
        self.bit = [0] * (len(nums) + 1)
        for i, value in enumerate(nums, 1):
            self._add(i, value)

    def _add(self, index: int, delta: int) -> None:
        while index < len(self.bit):
            self.bit[index] += delta
            index += index & -index

    def _prefix_sum(self, index: int) -> int:
        total = 0
        while index > 0:
            total += self.bit[index]
            index -= index & -index
        return total

    def update(self, index: int, val: int) -> None:
        delta = val - self.values[index]
        self.values[index] = val
        self._add(index + 1, delta)

    def sumRange(self, left: int, right: int) -> int:
        return self._prefix_sum(right + 1) - self._prefix_sum(left)
