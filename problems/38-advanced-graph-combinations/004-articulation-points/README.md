# Articulation Points

## Topic
An articulation point is a vertex whose removal increases the number of connected components.

## Recognize it
Undirected connectivity where you must identify critical vertices.

## State
DFS timestamps `tin[v]` and `low[v]`; a child cannot reach an ancestor of `v` when `low[child] >= tin[v]`.

## Complexity
`O(V+E)` time and `O(V+E)` space.

## 👁️ Visualize Mode
```text
ancestor
   |
   v
 child subtree
   |
no back edge above v → v is critical
```

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
