# Interval Scheduling Tests

| # | Input | Expected removals |
|---|---|---|
| 1 | `[[1,2],[2,3],[3,4],[1,3]]` | `1` |
| 2 | `[[1,2],[1,2],[1,2]]` | `2` |
| 3 | `[[1,2],[2,3]]` | `0` |
| 4 | `[[1,100]]` | `0` |
| 5 | `[]` | `0` |

The important invariant is: among compatible choices, retain the interval with the smallest finishing time.
