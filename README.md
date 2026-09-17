# Pattern-First DSA Course — Java + Python

This repository is a **pattern-first DSA learning system**.

The goal is not to collect thousands of repetitive questions. The goal is to learn reusable problem-solving patterns, recognize them quickly, implement them clearly in **Java and Python**, and transfer the same idea across multiple coding-practice, assessment, interview, contest, and test-management platforms.

## What every module contains

- **What is the topic?** — simple meaning and intuition
- **When do I use it?** — recognition clues
- **Core syntax** — Java + Python templates
- **Clear structured implementation** — readable variable names and comments
- **Sample input/output**
- **Test cases** — normal, edge, and variation cases
- **Complexity** — time and space
- **Common mistakes / invariants**
- **Visualize Mode** — state, action, invariant, next state
- **Variations and combinations**
- **Cross-platform transfer notes**

## Start here

1. Read [`SYNTAX-REFERENCE.md`](SYNTAX-REFERENCE.md)
2. Read [`problem-bank/PATTERN-RECOGNITION-GUIDE.md`](problem-bank/PATTERN-RECOGNITION-GUIDE.md)
3. Follow [`PATTERN-MASTERY-TRACK.md`](PATTERN-MASTERY-TRACK.md)
4. Use [`problem-bank/TEST-CASES-AND-OUTPUTS.md`](problem-bank/TEST-CASES-AND-OUTPUTS.md)
5. Use [`problem-bank/PLATFORM-PROBLEM-MAP.md`](problem-bank/PLATFORM-PROBLEM-MAP.md)
6. Use [`problem-bank/PLATFORM-INTEGRATION.md`](problem-bank/PLATFORM-INTEGRATION.md)
7. Use [`problem-bank/ADVANCED-FAMILIES-SOLUTION-MAP.md`](problem-bank/ADVANCED-FAMILIES-SOLUTION-MAP.md)
8. Open [`visualize/index.html`](visualize/index.html) for the repository Visualize Mode demo

## Pattern coverage

The course currently organizes DSA into these major families:

1. Hashing / Frequency
2. Two Pointers
3. Sliding Window
4. Prefix Sum
5. Binary Search
6. Stack
7. Monotonic Stack
8. Linked List Pointers
9. Tree DFS
10. Tree BFS
11. Graph DFS/BFS
12. Multi-source BFS
13. Union-Find / DSU
14. Topological Sort
15. Heap / Priority Queue
16. Intervals
17. Greedy
18. Backtracking
19. 1D Dynamic Programming
20. Grid / 2D Dynamic Programming
21. Knapsack / Subset DP
22. Subsequence DP
23. Trie
24. Bit Manipulation
25. Math / Number Theory
26. Segment Tree
27. Fenwick Tree
28. Advanced Trie
29. Floyd-Warshall
30. Bellman-Ford
31. K-way Merge
32. Quickselect
33. Interval Scheduling
34. String DP
35. Digit DP
36. Bitmask DP
37. Advanced Graph Combinations

## Java and Python are separate learning tracks

The algorithms are conceptually shared, but the implementations intentionally use language-native structures and syntax.

### Java

Use the `courses/java/` material and Java solution files.

Typical structures:

- `HashMap`
- `HashSet`
- `ArrayList`
- `ArrayDeque`
- `PriorityQueue`
- arrays and recursive methods

### Python

Use the `courses/python/` material and Python solution files.

Typical structures:

- `dict`
- `set`
- `list`
- `collections.deque`
- `heapq`
- functions and recursion

## Problem progression

```text
Programming Basics
        ↓
Core Data Structures
        ↓
Pattern Recognition
        ↓
Simple Problems
        ↓
Medium Problems
        ↓
Variations
        ↓
Cross-Pattern Combinations
        ↓
Mixed Platform Practice
        ↓
Advanced DSA
```

## Advanced implementation expansion

### Original advanced representatives

- Segment Tree — Range Sum Query - Mutable
- Fenwick Tree — mutable prefix/range sums
- Advanced Trie — Design Add and Search Words
- Floyd-Warshall — all-pairs shortest path
- Bellman-Ford — Cheapest Flights Within K Stops
- K-way Merge — Merge K Sorted Lists
- Quickselect — Kth Largest Element
- Interval Scheduling — Non-overlapping Intervals
- String DP — Edit Distance
- Digit DP — Numbers With Repeated Digits
- Bitmask DP — Partition to K Equal Sum Subsets
- Advanced Graph — Critical Connections

### Newly implemented advanced variations

- **Lazy Segment Tree** — range add + range sum
- **Fenwick + Coordinate Compression** — inversion count
- **Binary Trie** — maximum XOR pair
- **Tarjan SCC** — strongly connected components
- **0-1 BFS** — deque-based shortest paths with weights `0/1`
- **String DP** — Longest Common Subsequence
- **Bitmask DP** — Traveling Salesperson Problem
- **Interval DP** — Weighted Interval Scheduling

Every one of these follows the repository contract:

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

## Visualize standard

Every problem README should contain `## 👁️ Visualize Mode` and explain the algorithm as:

`Input → State → Action → Invariant → Next State → Output`

See [`VISUALIZE-MODE.md`](VISUALIZE-MODE.md), [`templates/VISUALIZE-SECTION.md`](templates/VISUALIZE-SECTION.md), and [`visualize/index.html`](visualize/index.html).

## Testing standard

Every new problem should include:

- normal test;
- boundary test;
- edge case;
- duplicate/negative case when relevant;
- no-solution case when relevant;
- sample output;
- Java/Python parity;
- regression notes.

GitHub Actions now validates Python syntax, Java compilation, advanced-module structure, and Visualize sections through [`.github/workflows/validate-dsa.yml`](.github/workflows/validate-dsa.yml).

## Cross-platform support

The repository now maintains transfer guidance for:

- **LeetCode** — interview-style pattern variations
- **HackerRank** — algorithm and implementation practice
- **CodeChef** — competitive programming and DSA practice
- **MentorPick / Being Zero** — syntax-first Java/DSA curriculum
- **HackerEarth** — coding challenges and assessments
- **CodeSignal** — coding assessments and interview practice
- **CoderPad** — collaborative interview coding
- **Codility** — technical screening and deterministic task tests
- **Kiwi TCMS** — test management, case organization and regression tracking
- **OpenRank Alpha** — open-source coding-challenge/contest workflow
- **Exercism** — language fluency, automated tests, and mentoring
- **AlphaExercism** — retained only as a user-supplied label; no authoritative current platform/source for that exact name was verified

See [`problem-bank/PLATFORM-INTEGRATION.md`](problem-bank/PLATFORM-INTEGRATION.md) for the detailed adaptation matrix.

## Existing representative implementations

Earlier modules include:

- 3Sum
- Minimum Size Subarray Sum
- Search in Rotated Sorted Array
- Min Stack
- Circular Next Greater Element
- Reverse Linked List
- Maximum Depth of Binary Tree
- Number of Provinces
- Top K Frequent Elements
- Assign Cookies
- Permutations
- Coin Change
- Trie + DFS word search
- Counting Bits

Foundational modules also cover Two Sum, Two Sum II, Longest Substring Without Repeating Characters, Subarray Sum Equals K, and Valid Parentheses.

## Main course documents

- [`COURSE-ARCHITECTURE.md`](COURSE-ARCHITECTURE.md)
- [`PATTERN_CATALOG.md`](PATTERN_CATALOG.md)
- [`PATTERN_INDEX.md`](PATTERN_INDEX.md)
- [`PATTERN-MASTERY-TRACK.md`](PATTERN-MASTERY-TRACK.md)
- [`ROADMAP.md`](ROADMAP.md)
- [`SYNTAX-REFERENCE.md`](SYNTAX-REFERENCE.md)
- [`VISUALIZE-MODE.md`](VISUALIZE-MODE.md)
- [`problem-bank/PROBLEM_CATALOG.md`](problem-bank/PROBLEM_CATALOG.md)
- [`problem-bank/PATTERN-RECOGNITION-GUIDE.md`](problem-bank/PATTERN-RECOGNITION-GUIDE.md)
- [`problem-bank/TEST-CASES-AND-OUTPUTS.md`](problem-bank/TEST-CASES-AND-OUTPUTS.md)
- [`problem-bank/PLATFORM-PROBLEM-MAP.md`](problem-bank/PLATFORM-PROBLEM-MAP.md)
- [`problem-bank/PLATFORM-INTEGRATION.md`](problem-bank/PLATFORM-INTEGRATION.md)
- [`problem-bank/ADVANCED-FAMILIES-SOLUTION-MAP.md`](problem-bank/ADVANCED-FAMILIES-SOLUTION-MAP.md)
