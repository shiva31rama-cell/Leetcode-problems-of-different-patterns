# Longest Palindromic Subsequence

## Topic
DP finds the longest subsequence that reads the same forward and backward.

## State
`dp[i][j]` = best answer inside substring `i..j`.
If `s[i]==s[j]`, use `2+dp[i+1][j-1]`; otherwise take the larger side.

## Complexity
`O(n²)` time and `O(n²)` space.

## 👁️ Visualize Mode
```text
 i →       ← j
 a b c b a
 └── inner ─┘
```
Expand from short intervals to longer intervals.

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
