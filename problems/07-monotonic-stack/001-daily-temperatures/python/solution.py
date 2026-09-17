class Solution:
    def dailyTemperatures(self, temperatures: list[int]) -> list[int]:
        answer = [0] * len(temperatures)
        stack = []  # indices with no warmer day found yet

        for i, temperature in enumerate(temperatures):
            while stack and temperature > temperatures[stack[-1]]:
                previous = stack.pop()
                answer[previous] = i - previous
            stack.append(i)

        return answer
