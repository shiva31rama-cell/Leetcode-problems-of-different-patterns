class FenwickTree:
    def __init__(self, size: int):
        self.tree = [0] * (size + 1)

    def add(self, index: int, value: int) -> None:
        while index < len(self.tree):
            self.tree[index] += value
            index += index & -index

    def prefix_sum(self, index: int) -> int:
        result = 0
        while index > 0:
            result += self.tree[index]
            index -= index & -index
        return result


class Solution:
    def count_inversions(self, nums: list[int]) -> int:
        if len(nums) < 2:
            return 0

        sorted_values = sorted(set(nums))
        rank = {value: index for index, value in enumerate(sorted_values, start=1)}
        bit = FenwickTree(len(sorted_values))

        inversions = 0
        processed = 0

        for value in nums:
            current_rank = rank[value]

            # Earlier values greater than the current value.
            less_or_equal = bit.prefix_sum(current_rank)
            inversions += processed - less_or_equal

            bit.add(current_rank, 1)
            processed += 1

        return inversions
