class Solution:
    def canPartition(self, nums: list[int]) -> bool:
        total = sum(nums)
        if total % 2:
            return False

        target = total // 2
        reachable = {0}

        for value in nums:
            reachable |= {current + value for current in reachable if current + value <= target}

        return target in reachable
