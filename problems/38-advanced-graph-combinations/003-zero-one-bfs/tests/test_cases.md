# Test Cases — 0-1 BFS

## Case 1 — sample
```text
n = 4
edges = [[0,1,0],[0,2,1],[1,2,1],[2,3,0]]
source = 0
Expected: [0,0,1,1]
```

## Case 2 — unreachable vertex
```text
n = 3
edges = [[0,1,1]]
source = 0
Expected: [0,1,-1]
```

## Case 3 — all zero edges
```text
n = 3
edges = [[0,1,0],[1,2,0]]
source = 0
Expected: [0,0,0]
```

## Case 4 — all one edges
```text
n = 4
edges = [[0,1,1],[1,2,1],[2,3,1]]
source = 0
Expected: [0,1,2,3]
```

## Regression focus
- weight `0` goes to deque front;
- weight `1` goes to deque back;
- relaxation, not a one-time visited flag, determines the shortest distance;
- unreachable nodes are returned as `-1`.
