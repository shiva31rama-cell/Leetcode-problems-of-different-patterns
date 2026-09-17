# Fenwick Tree Tests

| # | Operations | Expected |
|---|---|---|
| 1 | `[1,3,5]`, sum(0,2) | `9` |
| 2 | update(1,2), sum(0,2) | `8` |
| 3 | `[5]`, sum(0,0) | `5` |
| 4 | `[0,0,0]`, update(2,4), sum(0,2) | `4` |
| 5 | `[-1,2,3]`, sum(0,1) | `1` |

Check both prefix queries and the conversion `rangeSum(left,right) = prefix(right+1) - prefix(left)`.
