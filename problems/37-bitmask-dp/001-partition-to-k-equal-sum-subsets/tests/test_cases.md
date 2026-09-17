# Bitmask DP Tests

| # | Input | Expected |
|---|---|---|
| 1 | `[4,3,2,3,5,2,1], k=4` | `true` |
| 2 | `[1,2,3,4], k=3` | `false` |
| 3 | `[2,2,2,2,3,4,5], k=4` | `false` |
| 4 | `[1,1,1,1], k=2` | `true` |
| 5 | `[5], k=1` | `true` |

Trace the mask in binary. Each set bit means that element has already been used.
