# 2D Fenwick Tree

## What is the topic?
A two-dimensional Binary Indexed Tree supports point updates and rectangle-sum queries in `O(log R log C)`.

## Recognize it
A matrix has many point changes and rectangular sum queries.

## Syntax
Java: `add(row,col,delta)` and `rangeSum(r1,c1,r2,c2)`.
Python: same operations on a nested BIT.

## Brute force
Scan every cell in the rectangle: `O(RC)` per query.

## Optimized
Use nested `lowbit` jumps for update and prefix sum.

## Invariant
`bit[i][j]` stores a rectangular partial sum ending at `(i,j)` in Fenwick coordinates.

## Complexity
Update/query `O(log R log C)`, space `O(RC)`.

## Sample
Matrix updates: `(1,1)+=5`, `(2,2)+=3`; rectangle `(1,1)-(2,2)` → `8`.

## 👁️ Visualize Mode
```text
rectangle query
┌─────────────┐
│ 5  0  0     │
│ 0  3  0  ← sum partial cells
└─────────────┘
```

## Edge cases
Empty-sized dimensions are invalid; test single cells and boundary rows/columns.

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
