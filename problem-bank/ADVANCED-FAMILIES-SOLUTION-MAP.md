# Advanced Families — Solution Map

This file is the implementation layer for the advanced topics named in `PLATFORM-PROBLEM-MAP.md`. Every implemented problem follows the repository contract: topic meaning, recognition clues, syntax templates, algorithm idea, complexity, sample, tests, and `👁️ Visualize Mode`.

## Implemented now

| Family | Problem | Platform | Java | Python | Tests | Visualize |
|---|---|---|---|---|---|---|
| Segment Tree | Range Sum Query - Mutable | LeetCode 307 | ✅ | ✅ | ✅ | ✅ |
| Segment Tree | Lazy Propagation — Range Add + Range Sum | General DSA | ✅ | ✅ | ✅ | ✅ |
| Fenwick Tree | Range Sum Query with BIT | Related to LeetCode 307 pattern | ✅ | ✅ | ✅ | ✅ |
| Fenwick Tree | Inversion Count + Coordinate Compression | General DSA | ✅ | ✅ | ✅ | ✅ |
| Advanced Trie | Design Add and Search Words | LeetCode 211 | ✅ | ✅ | ✅ | ✅ |
| Advanced Trie | Maximum XOR Pair | LeetCode 421 | ✅ | ✅ | ✅ | ✅ |
| Floyd-Warshall | All Pairs Shortest Path | General DSA | ✅ | ✅ | ✅ | ✅ |
| Bellman-Ford | Cheapest Flights Within K Stops | LeetCode 787 | ✅ | ✅ | ✅ | ✅ |
| K-way Merge | Merge K Sorted Lists | LeetCode 23 | ✅ | ✅ | ✅ | ✅ |
| Quickselect | Kth Largest Element | LeetCode 215 | ✅ | ✅ | ✅ | ✅ |
| Interval Scheduling | Non-overlapping Intervals | LeetCode 435 | ✅ | ✅ | ✅ | ✅ |
| Interval Scheduling | Weighted Interval Scheduling | General DSA | ✅ | ✅ | ✅ | ✅ |
| String DP | Edit Distance | LeetCode 72 | ✅ | ✅ | ✅ | ✅ |
| String DP | Longest Common Subsequence | LeetCode 1143 | ✅ | ✅ | ✅ | ✅ |
| Digit DP | Numbers With Repeated Digits | LeetCode 1012 | ✅ | ✅ | ✅ | ✅ |
| Bitmask DP | Partition to K Equal Sum Subsets | LeetCode 698 | ✅ | ✅ | ✅ | ✅ |
| Bitmask DP | Traveling Salesperson Problem | General DSA | ✅ | ✅ | ✅ | ✅ |
| Advanced Graph | Critical Connections | LeetCode 1192 | ✅ | ✅ | ✅ | ✅ |
| Advanced Graph | Strongly Connected Components | General DSA | ✅ | ✅ | ✅ | ✅ |
| Advanced Graph | 0-1 BFS | General DSA | ✅ | ✅ | ✅ | ✅ |

## Related problem expansion queue

These are the next variations to add under the same folders. They are deliberately selected to teach a new state or invariant rather than duplicate the first solution.

### 1. Segment Tree
- Range Minimum Query
- Lazy Propagation: range update + range sum
- Maximum subarray segment tree
- Count of values in a range

**Skill progression:** point update/query → range update → custom node merge.

### 2. Fenwick Tree
- Point update + prefix sum
- Range update + point query
- Coordinate compression + inversion count
- Two-dimensional Fenwick tree

**Skill progression:** understand `lowbit` → transform range queries → combine with compression.

### 3. Advanced Trie
- Prefix frequency queries
- Maximum XOR pair using a binary trie
- Word Search II with trie + DFS
- Trie with deletion / frequency counts

**Skill progression:** exact word → wildcard branching → prefix metadata → bitwise trie.

### 4. Floyd-Warshall
- Transitive closure
- Detecting negative cycles
- Reconstructing paths
- Minimum route through a small dense graph

**Skill progression:** distance matrix → intermediate-state DP → path reconstruction.

### 5. Bellman-Ford
- Negative-edge shortest path
- Negative cycle detection
- K-edge bounded shortest path
- Cheapest Flights Within K Stops

**Skill progression:** unrestricted relaxation → bounded rounds → cycle detection.

### 6. K-way Merge
- Merge K sorted arrays
- Smallest range covering elements from K lists
- Kth smallest element in a sorted matrix
- External-style multiway merge

**Skill progression:** one heap entry per list → heap with coordinates → window/range reasoning.

### 7. Quickselect
- Kth smallest element
- Top K frequent elements with partitioning
- Closest K elements
- Three-way partition for many duplicates

**Skill progression:** partition invariant → target index → duplicate-aware partition.

### 8. Interval Scheduling
- Meeting Rooms
- Meeting Rooms II
- Minimum arrows to burst balloons
- Maximum number of non-overlapping intervals
- Weighted interval scheduling (DP)

**Skill progression:** earliest finish greedy → resource counting → greedy + DP.

### 9. String DP
- Longest Common Subsequence
- Longest Palindromic Subsequence
- Distinct Subsequences
- Interleaving String
- Wildcard Matching

**Skill progression:** prefix-prefix state → subsequence state → matching state.

### 10. Digit DP
- Count numbers with a digit restriction
- Sum of digits over `[0,n]`
- Count occurrences of a digit
- No consecutive equal digits
- Digit DP + modulo state

**Skill progression:** `pos` → `tight` → `started` → `mask`/modulo constraints.

### 11. Bitmask DP
- Assignment problem
- Traveling Salesperson Problem for small `n`
- Minimum cost to visit all nodes
- Subset sum variants
- DP over subsets of features/tasks

**Skill progression:** subset representation → subset transition → `(mask,last)` state.

### 12. Advanced Graph Combinations
- Articulation points
- Strongly connected components
- Bridges + DSU preprocessing
- DAG shortest/longest paths
- 0-1 BFS
- Dijkstra + state expansion
- MST + DSU + offline queries

**Skill progression:** basic traversal → graph invariant → specialized shortest-path/connectivity state.

## Newly implemented variation index

| # | Variation | Repository path |
|---|---|---|
| 123 | Lazy Segment Tree — Range Add + Range Sum | `problems/27-segment-tree/002-lazy-propagation-range-sum/` |
| 124 | Inversion Count + Coordinate Compression | `problems/28-fenwick-tree/002-inversion-count-coordinate-compression/` |
| 125 | Maximum XOR Pair — Binary Trie | `problems/29-advanced-trie/002-maximum-xor-pair/` |
| 126 | Strongly Connected Components — Tarjan | `problems/38-advanced-graph-combinations/002-strongly-connected-components/` |
| 127 | 0-1 BFS | `problems/38-advanced-graph-combinations/003-zero-one-bfs/` |
| 128 | Longest Common Subsequence | `problems/35-string-dp/002-longest-common-subsequence/` |
| 129 | Traveling Salesperson — Bitmask DP | `problems/37-bitmask-dp/002-traveling-salesperson/` |
| 130 | Weighted Interval Scheduling | `problems/34-interval-scheduling/002-weighted-interval-scheduling/` |

## Standard implementation contract

Every new advanced problem must contain:

```text
problem/
├── README.md
├── java/
│   └── Solution.java
├── python/
│   └── solution.py
└── tests/
    └── test_cases.md
```

README must include:
1. What is the topic?
2. When to recognize it
3. Syntax/template in Java
4. Syntax/template in Python
5. Brute-force idea when educationally useful
6. Optimized idea
7. Invariant/state
8. Complexity
9. Sample input/output
10. Edge cases
11. `## 👁️ Visualize Mode`
12. Java/Python file links
13. Platform transfer notes

## Platform integration

See [`PLATFORM-INTEGRATION.md`](PLATFORM-INTEGRATION.md) for the adaptation contract across LeetCode, HackerRank, CodeChef, MentorPick/Being Zero, HackerEarth, CodeSignal, CoderPad, Codility, Kiwi TCMS, OpenRank Alpha, and Exercism.

`AlphaExercism` is retained only as a user-supplied label because no authoritative current platform/source for that exact name was verified. The repository deliberately does not invent an API or catalog for it.

## Pattern transfer rule

Do not memorize a problem name. First identify the constraint and invariant:

`constraints → data structure/state → invariant → transition → complexity → implementation`.

That is the common learning path across online judges, interview IDEs, assessment platforms, test-management systems, and language-learning exercise platforms.
