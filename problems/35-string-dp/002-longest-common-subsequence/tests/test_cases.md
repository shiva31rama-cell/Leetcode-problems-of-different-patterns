# Test Cases — Longest Common Subsequence

## Case 1 — sample
```text
"abcde", "ace" -> 3
```

## Case 2 — no common characters
```text
"abc", "def" -> 0
```

## Case 3 — identical strings
```text
"abc", "abc" -> 3
```

## Case 4 — empty string
```text
"", "abc" -> 0
```

## Case 5 — repeated characters
```text
"aaa", "aa" -> 2
```

## Regression focus
- only matching characters use the diagonal state;
- mismatch uses the better of top and left states;
- Python's rolling arrays must preserve the previous row while computing the current row.
