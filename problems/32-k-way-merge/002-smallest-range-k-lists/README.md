# Smallest Range Covering K Sorted Lists

## What is the topic?
Find the smallest numeric interval containing at least one value from every sorted list.

## Recognize it
K sorted streams/lists must be covered by one range.

## Optimized
Keep one current value from each list in a min-heap. Advance the list containing the current minimum; track the current maximum.

## Invariant
The heap contains exactly one candidate from each list.

## Complexity
`O(N log K)` time, `O(K)` space.

## 👁️ Visualize Mode
```text
heap: min ───────── max
 A: 1  8  15
 B: 4 10
 C: 2  6
```
Pop minimum, record `[min,max]`, then advance that list.

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
