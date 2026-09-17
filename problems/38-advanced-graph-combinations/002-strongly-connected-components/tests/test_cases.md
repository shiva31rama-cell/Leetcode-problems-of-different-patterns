# Test Cases — Strongly Connected Components

## Case 1 — two SCCs
```text
n = 5
edges = [[0,1],[1,2],[2,0],[2,3],[3,4],[4,3]]
Expected components: {0,1,2}, {3,4}
```

## Case 2 — no edges
```text
n = 4
edges = []
Expected components: four singleton components
```

## Case 3 — one directed cycle
```text
n = 3
edges = [[0,1],[1,2],[2,0]]
Expected: one component {0,1,2}
```

## Case 4 — chain
```text
n = 4
edges = [[0,1],[1,2],[2,3]]
Expected: four singleton components
```

## Regression focus
- only edges to vertices still on the DFS stack should use `discovery[next]` for low-link updates;
- an SCC closes when `low[node] == discovery[node]`;
- component ordering is not part of the result contract.
