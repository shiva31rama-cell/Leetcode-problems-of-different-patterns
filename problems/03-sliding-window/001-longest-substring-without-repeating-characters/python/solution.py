class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        window = set()
        left = 0
        best = 0

        for right, current in enumerate(s):
            while current in window:
                # Remove the leftmost character until the window is valid.
                window.remove(s[left])
                left += 1

            window.add(current)
            best = max(best, right - left + 1)

        return best
