# Floyd-Warshall Tests

Use `INF = 10^9` for unreachable pairs.

| # | Graph | Expected key result |
|---|---|---|
| 1 | `0->1=5, 1->2=2, 0->2=10` | `dist[0][2]=7` |
| 2 | diagonal-only graph | all diagonal values remain `0` |
| 3 | disconnected vertices | unreachable values remain `INF` |
| 4 | negative edge, no negative cycle | negative edge is incorporated |
| 5 | negative cycle | after the algorithm, some `dist[i][i] < 0` identifies a negative cycle |
