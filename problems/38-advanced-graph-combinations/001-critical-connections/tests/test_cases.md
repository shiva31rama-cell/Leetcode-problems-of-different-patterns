# Advanced Graph Tests

| # | Graph | Expected bridges |
|---|---|---|
| 1 | `n=4, [[0,1],[1,2],[2,0],[1,3]]` | `[[1,3]]` |
| 2 | chain `0-1-2-3` | all 3 edges are bridges |
| 3 | triangle `0-1-2-0` | `[]` |
| 4 | disconnected graph | bridges are found in every component |
| 5 | single vertex | `[]` |

For unordered edges, compare normalized pairs or sets rather than relying on DFS output order.
