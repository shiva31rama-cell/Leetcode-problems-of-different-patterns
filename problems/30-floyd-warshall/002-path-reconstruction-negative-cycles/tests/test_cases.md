# Tests

1. Edges `0→1(2), 1→2(3), 0→2(10)`; path `0→2` → `[0,1,2]`, distance `5`.
2. Cycle `0→1(1),1→0(-2)` → negative cycle detected.
3. Disconnected vertices → empty path between components.
