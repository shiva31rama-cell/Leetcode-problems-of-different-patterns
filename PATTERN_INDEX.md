# 🧠 Master Pattern Index

This is the taxonomy used to organize problems. A single problem can belong to more than one pattern, but it should have one **primary pattern** explaining the main idea.

## Tier 1 — Foundations

| Pattern | Recognition signal | Core move |
|---|---|---|
| Hashing | "Have I seen this?", counting, grouping | Store information for fast lookup |
| Two Pointers | Sorted array, pair/triple, opposite ends | Move two indices strategically |
| Sliding Window | Contiguous subarray/substring with a condition | Expand right, shrink left |
| Prefix Sum | Repeated range sums / cumulative information | Precompute cumulative values |
| Binary Search | Ordered search space or monotonic condition | Cut search space in half |
| Fast & Slow Pointers | Cycle, middle, repeated movement | Move pointers at different speeds |
| Stack | Last-in-first-out relationship | Process most recent unresolved item |
| Monotonic Stack | Next greater/smaller / unresolved elements | Maintain increasing/decreasing stack |
| Heap | Repeated min/max or top-K requirement | Keep best candidate accessible |
| Intervals | Ranges overlap, merge, schedule | Sort endpoints and scan |

## Tier 2 — Core traversal patterns

| Pattern | Main idea |
|---|---|
| Tree DFS | Recursively/iteratively explore branches |
| Tree BFS | Explore level by level |
| Graph DFS | Explore connected regions deeply |
| Graph BFS | Explore by distance/frontier |
| Matrix/Grid traversal | Treat cells as graph nodes |
| Union-Find | Maintain dynamic connectivity |
| Topological Sort | Order nodes under prerequisites |

## Tier 3 — Search and construction

- Backtracking
- Subsets
- Permutations
- Combinations
- Divide and Conquer
- Modified Binary Search
- Trie / Prefix Tree
- K-way Merge
- Quickselect / Top-K

## Tier 4 — Optimization

- Greedy
- Dynamic Programming — 1D
- Dynamic Programming — 2D/Grid
- Knapsack
- Subsequence DP
- Interval DP
- State-machine DP
- Tree DP
- Bitmask DP

## Tier 5 — Advanced

- Dijkstra
- Bellman-Ford
- Floyd-Warshall
- Minimum Spanning Tree
- Fenwick Tree
- Segment Tree
- Advanced Trie
- Bit Manipulation
- Advanced graph patterns

## Pattern recognition rule

Never decide a pattern from one keyword alone. Check:

1. Input structure
2. Required output
3. Constraints
4. Whether order matters
5. Whether the target is contiguous
6. Whether the input is sorted or can be sorted
7. Whether repeated lookup is needed
8. Whether the problem asks for a best/min/max/count possibility
9. Whether the state depends on previous decisions

## Multi-pattern problems

Some problems intentionally combine techniques. They should be tagged with all relevant patterns, for example:

```text
Sliding Window + Hash Map
Binary Search + Greedy
DFS + Memoization
Heap + Hash Map
Sorting + Two Pointers
BFS + State Tracking
DP + Binary Search
```

The purpose of the taxonomy is **transferable thinking**, not rigid classification.
