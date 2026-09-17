class Solution:
    def permute(self, nums: list[int]) -> list[list[int]]:
        answer = []
        used = [False] * len(nums)

        def backtrack(path):
            if len(path) == len(nums):
                answer.append(path.copy())
                return

            for i, value in enumerate(nums):
                if used[i]:
                    continue

                used[i] = True          # choose
                path.append(value)

                backtrack(path)         # explore

                path.pop()              # undo
                used[i] = False

        backtrack([])
        return answer
