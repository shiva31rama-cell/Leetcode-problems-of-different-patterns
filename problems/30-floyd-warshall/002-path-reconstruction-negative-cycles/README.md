# Floyd-Warshall: Path Reconstruction + Negative Cycles

## What is the topic?
All-pairs shortest paths using intermediate vertices as a DP state.

## Recognize it
Dense graph, small `n`, need distances between every pair, and possibly route reconstruction.

## State
`dist[i][j]` is the best known cost; `next[i][j]` stores the next vertex on the route.

## Negative cycle
After processing all vertices, `dist[v][v] < 0` means a negative cycle is reachable from `v`.

## Complexity
`O(n^3)` time and `O(n^2)` space.

## 👁️ Visualize Mode
```text
k = intermediate
 i ───── j
  \     /
   \ k /
```
Try `i → k → j` and keep it when cheaper.

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
