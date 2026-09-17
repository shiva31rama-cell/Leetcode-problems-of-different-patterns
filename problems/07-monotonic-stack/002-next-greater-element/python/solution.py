class Solution:
    def nextGreaterElements(self, nums: list[int]) -> list[int]:
        n = len(nums)
        answer = [-1] * n
        stack = []

        # Traverse twice to simulate a circular array.
        for i in range(2 * n - 1, -1, -1):
            index = i % n

            while stack and stack[-1] <= nums[index]:
                stack.pop()

            if i < n and stack:
                answer[index] = stack[-1]

            stack.append(nums[index])

        return answer
