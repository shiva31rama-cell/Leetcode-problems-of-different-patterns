class Solution:
    def twoSum(self, numbers: list[int], target: int) -> list[int]:
        left = 0
        right = len(numbers) - 1

        while left < right:
            total = numbers[left] + numbers[right]

            if total == target:
                # The problem expects 1-based indices.
                return [left + 1, right + 1]

            if total < target:
                # Need a larger sum, so move left to a larger value.
                left += 1
            else:
                # Need a smaller sum, so move right to a smaller value.
                right -= 1

        return []
