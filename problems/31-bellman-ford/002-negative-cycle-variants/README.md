# Bellman-Ford: Negative Cycle Variants

## What is the topic?
Repeated edge relaxation finds shortest paths with negative edges and detects reachable negative cycles.

## Recognize it
Negative edge weights or a requirement to detect negative cycles.

## State/invariant
After `i` rounds, shortest paths using at most `i` edges are settled.

## Complexity
`O(VE)` time, `O(V)` space.

## 👁️ Visualize Mode
```text
u --w--> v
\___________/
relax: dist[v] = min(dist[v], dist[u] + w)
```
After `V-1` rounds, another improvement means a reachable negative cycle.

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
