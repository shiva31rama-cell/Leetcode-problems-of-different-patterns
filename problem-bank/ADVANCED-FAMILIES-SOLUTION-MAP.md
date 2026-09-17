# Advanced Families — Solution Map

Every implemented advanced problem follows the repository contract: topic meaning, recognition clues, Java/Python syntax, algorithm, invariant/state, complexity, sample, tests, and `👁️ Visualize Mode`.

## Implemented advanced set

| Family | Variation | Java | Python | Tests | Visualize |
|---|---|---:|---:|---:|---:|
| Segment Tree | Range Sum Query - Mutable | ✅ | ✅ | ✅ | ✅ |
| Segment Tree | Lazy Range Add + Range Sum | ✅ | ✅ | ✅ | ✅ |
| Segment Tree | Range Minimum + Maximum | ✅ | ✅ | ✅ | ✅ |
| Fenwick Tree | Range Sum / BIT | ✅ | ✅ | ✅ | ✅ |
| Fenwick Tree | Inversion Count + Compression | ✅ | ✅ | ✅ | ✅ |
| Fenwick Tree | Two-Dimensional BIT | ✅ | ✅ | ✅ | ✅ |
| Advanced Trie | Add/Search Words | ✅ | ✅ | ✅ | ✅ |
| Advanced Trie | Maximum XOR Pair | ✅ | ✅ | ✅ | ✅ |
| Advanced Trie | Prefix Frequency + Deletion | ✅ | ✅ | ✅ | ✅ |
| Floyd-Warshall | Path Reconstruction + Negative Cycles | ✅ | ✅ | ✅ | ✅ |
| Bellman-Ford | Negative Cycle Variants | ✅ | ✅ | ✅ | ✅ |
| K-way Merge | Smallest Range Covering K Lists | ✅ | ✅ | ✅ | ✅ |
| Quickselect | Three-Way Partition | ✅ | ✅ | ✅ | ✅ |
| Interval Scheduling | Meeting Rooms II | ✅ | ✅ | ✅ | ✅ |
| Interval Scheduling | Weighted Interval Scheduling | ✅ | ✅ | ✅ | ✅ |
| String DP | Edit Distance | ✅ | ✅ | ✅ | ✅ |
| String DP | Longest Common Subsequence | ✅ | ✅ | ✅ | ✅ |
| String DP | Longest Palindromic Subsequence | ✅ | ✅ | ✅ | ✅ |
| String DP | Distinct Subsequences | ✅ | ✅ | ✅ | ✅ |
| String DP | Interleaving String | ✅ | ✅ | ✅ | ✅ |
| Digit DP | Repeated Digits | ✅ | ✅ | ✅ | ✅ |
| Digit DP | Restriction + Modulo State | ✅ | ✅ | ✅ | ✅ |
| Bitmask DP | Assignment Problem | ✅ | ✅ | ✅ | ✅ |
| Bitmask DP | TSP | ✅ | ✅ | ✅ | ✅ |
| Advanced Graph | Critical Connections / Bridges | ✅ | ✅ | ✅ | ✅ |
| Advanced Graph | Articulation Points | ✅ | ✅ | ✅ | ✅ |
| Advanced Graph | SCC / Tarjan | ✅ | ✅ | ✅ | ✅ |
| Advanced Graph | 0-1 BFS | ✅ | ✅ | ✅ | ✅ |
| Advanced Graph | DAG Shortest / Longest Paths | ✅ | ✅ | ✅ | ✅ |
| Advanced Graph | Dijkstra + State Expansion | ✅ | ✅ | ✅ | ✅ |

## New variation index

| # | Variation | Repository path |
|---|---|---|
| 131 | Range Minimum + Maximum Segment Tree | `problems/27-segment-tree/003-range-min-max-query/` |
| 132 | Two-Dimensional Fenwick Tree | `problems/28-fenwick-tree/003-2d-fenwick/` |
| 133 | Trie Prefix Frequency + Deletion | `problems/29-advanced-trie/003-prefix-frequency-deletion/` |
| 134 | Floyd-Warshall Path Reconstruction + Negative Cycles | `problems/30-floyd-warshall/002-path-reconstruction-negative-cycles/` |
| 135 | Bellman-Ford Negative Cycle Variants | `problems/31-bellman-ford/002-negative-cycle-variants/` |
| 136 | K-way Smallest Range | `problems/32-k-way-merge/002-smallest-range-k-lists/` |
| 137 | Three-Way Quickselect | `problems/33-quickselect/003-three-way-partition/` |
| 138 | Meeting Rooms II | `problems/34-interval-scheduling/003-meeting-rooms-ii/` |
| 139 | Longest Palindromic Subsequence | `problems/35-string-dp/003-longest-palindromic-subsequence/` |
| 140 | Distinct Subsequences | `problems/35-string-dp/004-distinct-subsequences/` |
| 141 | Interleaving String | `problems/35-string-dp/005-interleaving-string/` |
| 142 | Digit Restrictions + Modulo DP | `problems/36-digit-dp/003-digit-restrictions-and-modulo/` |
| 143 | Assignment Problem | `problems/37-bitmask-dp/003-assignment-problem/` |
| 144 | Articulation Points | `problems/38-advanced-graph-combinations/004-articulation-points/` |
| 145 | DAG Shortest / Longest Paths | `problems/38-advanced-graph-combinations/005-dag-shortest-longest-path/` |
| 146 | Dijkstra + State Expansion | `problems/38-advanced-graph-combinations/006-dijkstra-state-expansion/` |

## Standard implementation contract

```text
problem/
├── README.md
├── java/Solution.java
├── python/solution.py
└── tests/test_cases.md
```

README sections cover: topic, recognition, Java/Python syntax, brute force where useful, optimized approach, invariant/state, complexity, sample, edge cases, `👁️ Visualize Mode`, file links, and platform transfer notes.

## Platform integration

See `PLATFORM-INTEGRATION.md` for LeetCode, HackerRank, CodeChef, MentorPick/Being Zero, HackerEarth, CodeSignal, CoderPad, Codility, Kiwi TCMS, OpenRank Alpha, and Exercism adaptation. `AlphaExercism` remains an unverified user-supplied label rather than an invented external API.

## Pattern transfer rule

`constraints → data structure/state → invariant → transition → complexity → implementation`.
