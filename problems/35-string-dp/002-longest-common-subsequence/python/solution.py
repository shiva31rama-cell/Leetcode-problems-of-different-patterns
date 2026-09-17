class Solution:
    def longest_common_subsequence(self, text1: str, text2: str) -> int:
        # Keep the DP array tied to the shorter string for lower memory use.
        if len(text1) < len(text2):
            shorter, longer = text1, text2
        else:
            shorter, longer = text2, text1

        previous = [0] * (len(shorter) + 1)

        for char in longer:
            current = [0] * (len(shorter) + 1)

            for j, other in enumerate(shorter, start=1):
                if char == other:
                    current[j] = previous[j - 1] + 1
                else:
                    current[j] = max(previous[j], current[j - 1])

            previous = current

        return previous[-1]
