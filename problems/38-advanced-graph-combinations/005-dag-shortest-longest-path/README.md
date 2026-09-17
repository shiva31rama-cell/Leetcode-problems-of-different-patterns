# DAG Shortest / Longest Paths

## Topic
A DAG allows linear-time path DP after topological sorting.

## Recognize it
Directed acyclic graph with shortest/longest path queries.

## Invariant
When a vertex is processed in topological order, all predecessor contributions are already final.

## Complexity
`O(V+E)` after/including topological sorting.

## 👁️ Visualize Mode
```text
A → B → D
 \→ C →/
order: A, B, C, D
```
Relax edges in topological order. For longest paths use `max`; for shortest use `min`.

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
