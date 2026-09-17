# Assignment Problem — Bitmask DP

## Topic
Assign each worker exactly one job with minimum total cost.

## State
`dp[mask]` = minimum cost after assigning the first `popcount(mask)` workers to jobs in `mask`.

## Recognize it
Small `n`, one-to-one assignment, exponential subset space is acceptable.

## Complexity
`O(n·2^n)` time, `O(2^n)` space.

## 👁️ Visualize Mode
```text
mask 0101
workers 0,1 assigned to jobs 0,2
next worker → choose an unused job
```

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
