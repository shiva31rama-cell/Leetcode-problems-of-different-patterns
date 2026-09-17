# Range Minimum / Maximum Segment Tree

## What is the topic?
A segment tree answers range queries in `O(log n)` while supporting point updates.

## Recognize it
You need many range min/max queries and updates on an array.

## Java template
`tree[node] = min/max(tree[left], tree[right])`; update the affected leaf and rebuild ancestors.

## Python template
Use recursive `build`, `query`, and `update` with a `tree` array.

## Brute force
Scan every element in each range: `O(nq)`.

## Optimized
Build once in `O(n)`, then query/update in `O(log n)`.

## Invariant
Each node stores the min and max of exactly its represented interval.

## Complexity
Build `O(n)`, each query/update `O(log n)`, space `O(n)`.

## Sample
`[5,2,7,1,6]`, query `[1,3]` → min `1`, max `7`.

## 👁️ Visualize Mode
```text
             [0..4]
           /         \
       [0..2]       [3..4]
      /     \       /    \
   [0..1]   [2]   [3]    [4]
```
Query `[1,3]` combines only nodes fully/partially covered by that interval.

## Platform transfer
Use method-only code for LeetCode/CodeSignal/Codility; add stdin/stdout wrapper for HackerRank/CodeChef/HackerEarth.

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
