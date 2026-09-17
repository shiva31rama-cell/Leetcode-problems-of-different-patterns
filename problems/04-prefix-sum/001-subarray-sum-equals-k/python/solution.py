class Solution:
    def subarraySum(self, nums: list[int], k: int) -> int:
        frequency = {0: 1}
        prefix = 0
        count = 0

        for value in nums:
            prefix += value

            needed = prefix - k
            count += frequency.get(needed, 0)

            frequency[prefix] = frequency.get(prefix, 0) + 1

        return count
