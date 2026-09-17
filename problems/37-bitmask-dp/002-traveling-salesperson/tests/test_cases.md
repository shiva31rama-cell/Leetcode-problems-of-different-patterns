# Test Cases — Traveling Salesperson Problem

## Case 1 — sample
```text
[[0,10,15,20],
 [10,0,35,25],
 [15,35,0,30],
 [20,25,30,0]] -> 80
```

## Case 2 — one city
```text
[[0]] -> 0
```

## Case 3 — two cities
```text
[[0,5],[7,0]] -> 12
```

## Case 4 — symmetric small graph
```text
[[0,1,2],
 [1,0,4],
 [2,4,0]] -> 7
```

## Regression focus
- city `0` must be included in the initial mask;
- each city can be added only once;
- the final answer must add the return edge to city `0`;
- state count is `n * 2^n`, so this algorithm is intentionally for small `n`.
