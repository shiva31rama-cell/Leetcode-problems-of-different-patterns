# Traveling Salesperson Problem — Bitmask DP

**Pattern:** Bitmask DP / `(mask, last)` state
**Level:** Advanced
**Source:** General DSA

## What is the topic?
Given a small number of cities and travel costs between every pair, find the minimum-cost tour that starts at city `0`, visits every city exactly once, and returns to city `0`.

## Recognition
Think bitmask DP when:
- `n` is small, usually around 20 or less depending on constraints;
- the state is a **subset of visited items**;
- you also need one final position such as the current city.

## State
`dp[mask][last]` = minimum cost to start at city `0`, visit exactly the cities in `mask`, and finish at `last`.

Transition:
```text
nextMask = mask | (1 << next)
dp[nextMask][next] = min(dp[nextMask][next], dp[mask][last] + cost[last][next])
```

## Syntax template
### Java
```java
int tsp(int[][] cost) { }
```
### Python
```python
def tsp(cost: list[list[int]]) -> int:
    pass
```

## Brute force vs optimized
Brute force checks `(n-1)!` tours.

Bitmask DP keeps only `2^n * n` states and transitions between cities, giving `O(n² 2^n)` time.

## Complexity
- Time: `O(n² 2^n)`
- Space: `O(n 2^n)`

## 👁️ Visualize Mode
```mermaid
flowchart TD
    A[mask,last] --> B[Choose unvisited city]
    B --> C[Compute nextMask]
    C --> D[Relax dp[nextMask][next]]
    D --> A
    A --> E[All cities visited]
    E --> F[Add return cost to city 0]
```

Example with 4 cities:
```text
mask = 0101 means cities 0 and 2 have been visited.
last = 2 means the current city is 2.
```
A next city changes the mask by setting one previously zero bit.

## Sample
```text
cost =
[[0,10,15,20],
 [10,0,35,25],
 [15,35,0,30],
 [20,25,30,0]]
```
Output:
```text
80
```

## Edge cases
- one city -> `0`;
- two cities;
- zero-cost edges;
- asymmetric cost matrix;
- very large costs where overflow must be avoided.

## Platform transfer
This is best suited to advanced DSA/algorithm tasks with small `n`. Keep the core function unchanged when adapting to assessment IDEs or stdin/stdout contests.

## Files
- Java: `java/Solution.java`
- Python: `python/solution.py`
- Tests: `tests/test_cases.md`
