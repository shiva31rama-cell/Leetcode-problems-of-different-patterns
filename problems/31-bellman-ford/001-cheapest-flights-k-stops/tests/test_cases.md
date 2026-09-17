# Bellman-Ford Tests

| # | Input | Expected |
|---|---|---|
| 1 | `3, [[0,1,100],[1,2,100],[0,2,500]], 0,2,1` | `200` |
| 2 | same graph, `k=0` | `500` |
| 3 | destination unreachable | `-1` |
| 4 | several routes with different stop counts | only routes within `k` stops are considered |
| 5 | repeated relaxation needed | final bounded shortest distance |

Important: use a fresh distance copy on every round.
