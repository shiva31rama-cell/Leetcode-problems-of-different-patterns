# 🐍 Python DSA Course

A separate Python-first path for learning problem solving and DSA through reusable patterns.

## Module 1 — Python foundations for DSA

- Variables and dynamic typing
- Numbers and booleans
- Conditions
- `for` and `while` loops
- Functions
- Lists and tuples
- Strings
- Slicing
- Dictionaries
- Sets
- Input/output
- Basic complexity
- Recursion basics

## Module 2 — Python tools used in DSA

- `list`
- `dict`
- `set`
- `tuple`
- `collections.Counter`
- `collections.defaultdict`
- `collections.deque`
- `heapq`
- `bisect`
- Sorting with `key=`

For every tool we explain:

```text
What it stores
Important operations
Typical complexity
Why it is useful in DSA
Java equivalent
Common mistakes
```

## Module 3 — Pattern foundations

- Hashing
- Two pointers
- Sliding window
- Prefix sum
- Binary search
- Fast/slow pointers
- Stack and monotonic stack
- Heap / priority queue
- Intervals

## Module 4 — Trees and graphs

- Tree traversals
- BST
- BFS
- DFS
- Grid traversal
- Graph representation
- Union-Find
- Topological sort
- Shortest paths

## Module 5 — Backtracking and DP

- Recursion
- Subsets
- Permutations
- Combinations
- N-Queens
- 1D DP
- 2D/grid DP
- Knapsack
- Subsequence DP
- Advanced DP families

## Python explanation standard

We will not simply translate Java code into Python. Python has its own clean idioms and data structures, and those will be taught separately.

Example:

```python
frequency = {}

for num in nums:
    frequency[num] = frequency.get(num, 0) + 1
```

Meaning:

- `frequency = {}` creates an empty dictionary
- `num` is the current value
- `.get(num, 0)` returns the current count or `0` if absent
- `+ 1` increments the count

The Java course teaches the equivalent idea using Java collections, rather than treating Python as a translation exercise.
