# Distinct Subsequences

## Topic
Count how many subsequences of `s` equal `t`.

## State
`dp[i][j]` = ways to form first `j` target characters from first `i` source characters.
If characters match: use/skip; otherwise skip source character.

## Complexity
`O(mn)` time, `O(n)` optimized space.

## 👁️ Visualize Mode
```text
source prefix →  s s h
                 ↘ use / skip
target prefix →  s h
```
Each source character either participates or is skipped.

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
