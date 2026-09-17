# Digit DP: Restriction + Modulo State

## Topic
Count integers in `[0,N]` satisfying digit rules while carrying a modulo condition.

## State
`dp(pos, tight, started, mod)`; `tight` says the prefix equals N, `started` handles leading zeros.

## Recognize it
Huge numeric range where checking every number is impossible and validity depends on digits.

## Complexity
Usually `O(digits * 2 * 2 * modulus * transitions)`.

## 👁️ Visualize Mode
```text
pos → tight → started → mod
 |      |        |        |
next digit constrained by N
```

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
