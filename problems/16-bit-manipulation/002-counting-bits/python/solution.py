class Solution:
    def countBits(self, n: int) -> list[int]:
        dp = [0] * (n + 1)

        for i in range(1, n + 1):
            # Remove the lowest set bit and reuse its answer.
            dp[i] = dp[i & (i - 1)] + 1

        return dp
