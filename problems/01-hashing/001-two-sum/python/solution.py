class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        # Store number -> index for values we have already seen.
        seen = {}

        for i, value in enumerate(nums):
            # This is the value needed to reach the target.
            complement = target - value

            # If we saw the complement earlier, the pair is complete.
            if complement in seen:
                return [seen[complement], i]

            # Save the current value for future elements.
            seen[value] = i

        # Safe fallback when no pair exists.
        return []
