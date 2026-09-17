# Segment Tree Tests

| # | Input / operations | Expected |
|---|---|---|
| 1 | `[1,3,5]`, sum(0,2) | `9` |
| 2 | update(1,2), sum(0,2) | `8` |
| 3 | `[5]`, sum(0,0) | `5` |
| 4 | `[0,0,0]`, update(1,7), sum(0,2) | `7` |
| 5 | `[-2,3,1]`, sum(0,1) | `1` |

## Edge checks

- Single element.
- Empty array should return `0` for a range query in these implementations.
- Repeated updates to the same index.
- Queries covering the full range and a single position.
