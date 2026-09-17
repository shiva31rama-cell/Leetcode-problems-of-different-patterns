# Test Cases — Lazy Propagation Range Sum

## Case 1 — sample
Input:
```text
nums = [1,3,5,7]
rangeAdd(1,3,2)
rangeSum(0,3)
rangeSum(1,2)
```
Expected:
```text
22
12
```

## Case 2 — whole range update
```text
nums = [1,2,3]
rangeAdd(0,2,5)
rangeSum(0,2) -> 21
```

## Case 3 — single element
```text
nums = [10]
rangeAdd(0,0,-3)
rangeSum(0,0) -> 7
```

## Case 4 — overlapping updates
```text
nums = [1,1,1,1,1]
rangeAdd(0,3,2)
rangeAdd(2,4,3)
rangeSum(0,4) -> 21
rangeSum(2,3) -> 12
```

## Case 5 — no update
```text
nums = [4,8,2]
rangeSum(1,2) -> 10
```

## Regression focus
- full-cover update should record a lazy value;
- a later partial query must push the pending value before descending;
- parent sums must be pulled after child updates;
- negative updates must work;
- empty arrays must not crash.
