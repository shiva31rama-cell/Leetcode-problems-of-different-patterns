# String DP Tests

| # | Input | Expected |
|---|---|---|
| 1 | `horse, ros` | `3` |
| 2 | `intention, execution` | `5` |
| 3 | `, abc` | `3` |
| 4 | `abc, ` | `3` |
| 5 | `abc, abc` | `0` |
| 6 | `a, b` | `1` |

Trace a small table by hand to verify the meaning of `dp[i][j]` before optimizing space.
