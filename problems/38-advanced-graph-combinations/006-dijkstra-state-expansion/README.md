# Dijkstra + State Expansion

## Topic
Extend Dijkstra by making the state `(node, extra-state)` instead of only `node`.

## Example
Shortest path when one edge may be taken at half cost.

## Recognize it
A path problem has a small reusable resource: coupons, fuel mode, number of special moves, parity, etc.

## Invariant
The heap stores the smallest known distance for each expanded state.

## Complexity
For `K` states per node: `O((V K + E K) log(VK))`.

## 👁️ Visualize Mode
```text
(node, coupon unused) ── normal ──> (next, coupon unused)
        │
        └──────── discount ──────> (next, coupon used)
```

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
