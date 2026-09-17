from functools import lru_cache


def can_partition_k_subsets(nums: list[int], k: int) -> bool:
    total = sum(nums)
    if k <= 0 or total % k != 0:
        return False

    nums = sorted(nums, reverse=True)
    target = total // k
    n = len(nums)

    @lru_cache(maxsize=None)
    def dfs(mask: int, current_sum: int) -> bool:
        if mask == (1 << n) - 1:
            return current_sum == 0

        for i, value in enumerate(nums):
            if mask & (1 << i):
                continue
            if current_sum + value > target:
                continue

            next_sum = current_sum + value
            if next_sum == target:
                next_sum = 0

            if dfs(mask | (1 << i), next_sum):
                return True

            if current_sum == 0:
                break

        return False

    return dfs(0, 0)
