# Critical Connections in a Network

**Pattern:** Graph DFS + Low-Link / Tarjan
**Level:** Advanced
**Source:** LeetCode 1192

## What is the topic?
A critical connection (bridge) is an edge whose removal disconnects the graph.

## Recognition
Use low-link DFS when the question asks for bridges, articulation structure, or whether an edge/vertex is essential for connectivity.

## Core idea
For each node store:
- `disc[u]`: discovery time
- `low[u]`: earliest discovery time reachable from `u` using tree edges plus at most one back edge

For DFS edge `u-v`, if `low[v] > disc[u]`, then `u-v` is a bridge.

## Syntax template
### Java
```java
if (low[v] > disc[u]) bridges.add(Arrays.asList(u, v));
low[u] = Math.min(low[u], low[v]);
```
### Python
```python
if low[v] > disc[u]:
    bridges.append([u, v])
low[u] = min(low[u], low[v])
```

## Complexity
- Time: `O(V + E)`
- Space: `O(V + E)` for graph plus DFS state/output

## 👁️ Visualize Mode
```mermaid
flowchart TD
    A[DFS u -> v] --> B[Assign discovery time]
    B --> C[DFS child v]
    C --> D[Update low u]
    D --> E{low[v] > disc[u]?}
    E -->|Yes| F[Edge u-v is a bridge]
    E -->|No| G[Back edge exists]
```

Example chain `0-1-2` has two bridges. A triangle has no bridge because every edge has an alternate route.

## Sample
Input: `n=4`, edges `[[0,1],[1,2],[2,0],[1,3]]`

Output: `[[1,3]]`

## Tests
See `tests/test_cases.md`.

## Files
- Java: `java/Solution.java`
- Python: `python/solution.py`
- Tests: `tests/test_cases.md`
