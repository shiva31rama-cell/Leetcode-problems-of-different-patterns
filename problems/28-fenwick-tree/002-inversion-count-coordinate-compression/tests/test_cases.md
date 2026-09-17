# Test Cases — Inversion Count

## Case 1 — descending
```text
[8,4,2,1] -> 6
```

## Case 2 — already sorted
```text
[1,2,3,4] -> 0
```

## Case 3 — duplicates
```text
[2,2,1] -> 2
```

## Case 4 — negative values
```text
[-1,-2,-3] -> 3
```

## Case 5 — mixed values
```text
[3,1,2] -> 2
```

## Regression focus
- equal values are not inversions;
- coordinate compression must preserve relative order;
- Fenwick indices are 1-based;
- use `long` in Java for the result because the inversion count can exceed `int`.
