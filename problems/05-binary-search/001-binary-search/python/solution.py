class Solution:
    def search(self, nums: list[int], target: int) -> int:
        left = 0
        right = len(nums) - 1

        while left <= right:
            mid = left + (right - left) // 2

            if nums[mid] == target:
                return mid

            if nums[mid] < target:
                # Target must be in the right half.
                left = mid + 1
            else:
                # Target must be in the left half.
                right = mid - 1

        return -1
