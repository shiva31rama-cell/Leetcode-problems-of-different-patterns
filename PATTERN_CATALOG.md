# Pattern Catalog

> A curated pattern-first roadmap. The goal is not to solve every repetitive problem; it is to master reusable problem-solving techniques.

## Core Pattern Map

| ID | Pattern | Recognition Clues | Core Idea | Planned Core Set |
|---|---|---|---|---:|
| P01 | Hashing / Frequency | lookup, duplicates, counts, complements | trade memory for O(1)-average lookup | 6 |
| P02 | Two Pointers | sorted array, pair/triplet, opposite ends | move pointers using an invariant | 7 |
| P03 | Sliding Window | contiguous subarray/substring, changing window | maintain a valid window incrementally | 8 |
| P04 | Prefix Sum | repeated range sums, subarray sum | convert ranges into differences of prefixes | 6 |
| P05 | Binary Search | sorted/monotonic search space | repeatedly eliminate half the candidates | 8 |
| P06 | Stack | nested structure, previous/next relation | maintain unresolved elements in LIFO order | 6 |
| P07 | Monotonic Stack | next greater/smaller, contribution | keep stack ordered while scanning | 7 |
| P08 | Linked-List Pointers | cycles, middle, kth node | coordinate fast/slow or multiple pointers | 6 |
| P09 | Tree DFS | hierarchy, paths, subtree state | solve child subproblems and combine | 8 |
| P10 | Tree BFS | levels, distance from root | process nodes level by level | 5 |
| P11 | Graph DFS/BFS | connectivity, reachability, components | traverse a graph while tracking visited state | 8 |
| P12 | Multi-source BFS | many starting points spreading simultaneously | initialize queue with all sources | 4 |
| P13 | Union-Find | dynamic connectivity, merging groups | maintain disjoint connected components | 5 |
| P14 | Topological Sort | prerequisites/dependencies in DAG | order nodes after dependencies | 5 |
| P15 | Heap / Priority Queue | top-k, repeatedly choose min/max, scheduling | keep best candidate accessible | 8 |
| P16 | Intervals | ranges, overlap, scheduling | sort endpoints and maintain active range state | 7 |
| P17 | Greedy | local decision with proof/invariant | commit to a choice that preserves optimality | 8 |
| P18 | Backtracking | choices + constraints + combinations | choose, explore, undo; prune invalid branches | 8 |
| P19 | 1D DP | optimal answer depends on earlier states | define state and transition | 8 |
| P20 | Grid / 2D DP | matrix paths, local state transitions | compute states across rows/columns | 7 |
| P21 | Knapsack / Subset DP | choose/not choose, capacity/target | state represents selected resources | 7 |
| P22 | Subsequence DP | LIS/LCS/edit-style relationships | compare prefixes or sequence endings | 7 |
| P23 | Trie | prefix/word queries | store characters along paths | 4 |
| P24 | Bit Manipulation | XOR, masks, powers of two | represent state compactly with bits | 6 |
| P25 | Math / Number Theory | arithmetic invariant, divisibility, primes | derive mathematical shortcut | 6 |
| P26 | Advanced Structures | range updates/queries, ordered state | Fenwick/segment tree and related structures | 6 |

## Pattern Combination Layer

After the core patterns, problems are classified by combinations such as:

- Hashing + Prefix Sum
- Sliding Window + Frequency Map
- Binary Search + Greedy
- Heap + Greedy
- DFS + Backtracking
- BFS + Hashing
- Graph + Union-Find
- DP + Binary Search
- DP + Bitmask
- Tree + DP
- Monotonic Stack + Prefix/Suffix information

A problem is not duplicated merely because it uses two patterns. Its primary pattern is the main directory; combinations are recorded as metadata.

## Mastery Rule

A pattern is considered learned only when the learner can:

1. Recognize its clues without seeing the solution.
2. State the invariant or state definition.
3. Explain why the optimization works.
4. Implement it independently in Java and Python.
5. Handle at least one meaningful variation.
6. Solve an unseen assessment problem.
