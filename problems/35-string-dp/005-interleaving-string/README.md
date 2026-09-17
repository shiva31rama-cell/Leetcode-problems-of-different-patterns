# Interleaving String

## Topic
Determine whether `s3` can be formed by preserving the character order of `s1` and `s2`.

## State
`dp[i][j]` means first `i` chars of `s1` and first `j` chars of `s2` form the first `i+j` chars of `s3`.

## Complexity
`O(mn)` time, `O(n)` space.

## 👁️ Visualize Mode
```text
(i,j) → (i+1,j)  use s1
  |
  └──────→ (i,j+1) use s2
```
Each state branches only when the next character matches.

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
