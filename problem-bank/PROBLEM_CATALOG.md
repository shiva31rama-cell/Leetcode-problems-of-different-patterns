# Curated Problem Catalog

This is the curated inventory, not a dump of every platform problem. Problems are selected because they teach a reusable pattern, a meaningful variation, a combination, or an assessment skill.

## Initial Core Set

| # | Source | Problem | Difficulty | Pattern | Role | Status |
|---:|---|---|---|---|---|---|
| 1 | LeetCode | Two Sum | Easy | Hashing | Foundation | Planned |
| 2 | LeetCode | Group Anagrams | Medium | Hashing / Frequency | Core | Planned |
| 3 | LeetCode | Longest Consecutive Sequence | Medium | Hashing | Core | Planned |
| 4 | LeetCode | Valid Anagram | Easy | Frequency | Foundation | Planned |
| 5 | LeetCode | Two Sum II - Input Array Is Sorted | Medium | Two Pointers | Foundation | Planned |
| 6 | LeetCode | 3Sum | Medium | Two Pointers | Core | Planned |
| 7 | LeetCode | Container With Most Water | Medium | Two Pointers | Core | Planned |
| 8 | LeetCode | Best Time to Buy and Sell Stock | Easy | Sliding Window | Foundation | Planned |
| 9 | LeetCode | Longest Substring Without Repeating Characters | Medium | Sliding Window | Core | Planned |
| 10 | LeetCode | Minimum Size Subarray Sum | Medium | Sliding Window | Core | Planned |
| 11 | LeetCode | Subarray Sum Equals K | Medium | Prefix Sum + Hashing | Bridge | Planned |
| 12 | LeetCode | Binary Search | Easy | Binary Search | Foundation | Planned |
| 13 | LeetCode | Search in Rotated Sorted Array | Medium | Binary Search | Variation | Planned |
| 14 | LeetCode | Valid Parentheses | Easy | Stack | Foundation | Planned |
| 15 | LeetCode | Daily Temperatures | Medium | Monotonic Stack | Foundation | Planned |
| 16 | LeetCode | Linked List Cycle | Easy | Fast & Slow Pointers | Foundation | Planned |
| 17 | LeetCode | Reverse Linked List | Easy | Linked List Reversal | Foundation | Planned |
| 18 | LeetCode | Binary Tree Level Order Traversal | Medium | Tree BFS | Foundation | Planned |
| 19 | LeetCode | Maximum Depth of Binary Tree | Easy | Tree DFS | Foundation | Planned |
| 20 | LeetCode | Lowest Common Ancestor of a Binary Tree | Medium | Tree DFS | Core | Planned |
| 21 | LeetCode | Number of Islands | Medium | Graph DFS/BFS | Foundation | Planned |
| 22 | LeetCode | Rotting Oranges | Medium | Multi-source BFS | Foundation | Planned |
| 23 | LeetCode | Course Schedule | Medium | Topological Sort | Core | Planned |
| 24 | LeetCode | Number of Provinces | Medium | Union-Find / Graph | Core | Planned |
| 25 | LeetCode | Kth Largest Element in an Array | Medium | Heap / Selection | Foundation | Planned |
| 26 | LeetCode | Merge Intervals | Medium | Intervals | Foundation | Planned |
| 27 | LeetCode | Jump Game | Medium | Greedy | Foundation | Planned |
| 28 | LeetCode | Subsets | Medium | Backtracking | Foundation | Planned |
| 29 | LeetCode | Permutations | Medium | Backtracking | Core | Planned |
| 30 | LeetCode | House Robber | Medium | 1D DP | Foundation | Planned |
| 31 | LeetCode | Coin Change | Medium | Knapsack-style DP | Core | Planned |
| 32 | LeetCode | Longest Increasing Subsequence | Medium | Subsequence DP | Core | Planned |
| 33 | LeetCode | Word Break | Medium | DP + Hashing | Bridge | Planned |
| 34 | LeetCode | Implement Trie (Prefix Tree) | Medium | Trie | Foundation | Planned |
| 35 | LeetCode | Single Number | Easy | XOR / Bit Manipulation | Foundation | Planned |
| 36 | LeetCode | Counting Bits | Easy | Bit Manipulation / DP | Bridge | Planned |

## Advanced Variation Set

| # | Source | Problem | Difficulty | Pattern | Repository |
|---:|---|---|---|---|---|
| 123 | General DSA | Lazy Segment Tree — Range Add + Range Sum | Advanced | Segment Tree + Lazy Propagation | `problems/27-segment-tree/002-lazy-propagation-range-sum/` |
| 124 | General DSA | Inversion Count + Coordinate Compression | Advanced | Fenwick Tree + Compression | `problems/28-fenwick-tree/002-inversion-count-coordinate-compression/` |
| 125 | LeetCode 421 | Maximum XOR Pair | Advanced | Binary Trie | `problems/29-advanced-trie/002-maximum-xor-pair/` |
| 126 | General DSA | Strongly Connected Components | Advanced | Tarjan Low-Link DFS | `problems/38-advanced-graph-combinations/002-strongly-connected-components/` |
| 127 | General DSA | 0-1 BFS | Advanced | Deque Shortest Path | `problems/38-advanced-graph-combinations/003-zero-one-bfs/` |
| 128 | LeetCode 1143 | Longest Common Subsequence | Medium/Advanced | String DP | `problems/35-string-dp/002-longest-common-subsequence/` |
| 129 | General DSA | Traveling Salesperson Problem | Advanced | Bitmask DP | `problems/37-bitmask-dp/002-traveling-salesperson/` |
| 130 | General DSA | Weighted Interval Scheduling | Advanced | Interval DP + Binary Search | `problems/34-interval-scheduling/002-weighted-interval-scheduling/` |

## Selection Status

This catalog intentionally grows by **pattern coverage and variation**, not raw problem count. The advanced variation set is backed by source files with Java, Python, tests, and Visualize sections.

## Cross-Platform Sources

Problems are mapped across:

- LeetCode
- HackerRank
- CodeChef
- MentorPick / Being Zero
- HackerEarth
- CodeSignal
- CoderPad
- Codility
- Kiwi TCMS
- OpenRank Alpha
- Exercism

See [`PLATFORM-PROBLEM-MAP.md`](PLATFORM-PROBLEM-MAP.md) and [`PLATFORM-INTEGRATION.md`](PLATFORM-INTEGRATION.md) for the transfer and test-management layer.

`AlphaExercism` is not treated as a verified external platform because no authoritative current source for that exact name was found; it remains a user-supplied label only.
