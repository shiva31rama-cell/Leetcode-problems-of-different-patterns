# Test Cases — Maximum XOR Pair

## Case 1 — sample
```text
[3,10,5,25,2,8] -> 28
```

## Case 2 — duplicates
```text
[7,7,7] -> 0
```

## Case 3 — two values
```text
[1,2] -> 3
```

## Case 4 — all zero
```text
[0,0,0] -> 0
```

## Case 5 — one value
```text
[42] -> 0
```

## Regression focus
- prefer the opposite bit whenever possible;
- process bits from most significant to least significant;
- avoid accidentally allowing the same input value to be paired with itself when only one item exists;
- keep the fixed-width bit range consistent in Java and Python.
