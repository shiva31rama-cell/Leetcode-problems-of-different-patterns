# Strongly Connected Components — Tarjan's Algorithm

**Pattern:** DFS + Low-Link / SCC
**Level:** Advanced
**Source:** General graph algorithm

## What is the topic?
A **strongly connected component (SCC)** of a directed graph is a maximal group of vertices where every vertex can reach every other vertex.

## Recognition
Think SCC when:
- the graph is directed;
- reachability works in both directions inside a group;
- the problem asks for mutually reachable groups, condensation DAGs, or cycle structure.

## Core idea
Tarjan's algorithm performs one DFS and gives every vertex:
- `disc[u]`: when it was discovered;
- `low[u]`: the smallest discovery time reachable from `u` through DFS-tree edges and at most one back edge.

When `low[u] == disc[u]`, `u` is the root of an SCC. Pop the DFS stack until `u` appears.

## Invariant
For every active vertex `u`, `low[u]` is the earliest discovery time reachable without leaving the active DFS structure in a way that would break the SCC boundary.

## Syntax template
### Java
```java
List<List<Integer>> findSCCs(int n, List<List<Integer>> graph) { }
```
### Python
```python
def strongly_connected_components(n, graph):
    pass
```

## Complexity
- Time: `O(V + E)`
- Space: `O(V + E)` for graph and DFS state

## 👁️ Visualize Mode
```mermaid
flowchart TD
    A[DFS vertex] --> B[Assign disc and low]
    B --> C{Neighbor visited?}
    C -->|No| D[DFS neighbor]
    D --> E[low = min(low, child low)]
    C -->|Active stack| F[low = min(low, neighbor disc)]
    E --> G{low equals disc?}
    F --> G
    G -->|Yes| H[Pop one SCC]
    G -->|No| I[Keep component open]
```

Example graph:
```text
0 → 1 → 2
↑   ↓   ↓
└── 3 ← 4
```
The exact SCC grouping depends on all directed edges; the algorithm discovers a component when its root's `low` value closes the DFS region.

## Sample
Input edges:
```text
0->1, 1->2, 2->0, 2->3, 3->4, 4->3
```
Output SCCs:
```text
[0,2,1] and [3,4]
```
(Component order may differ.)

## Edge cases
- no edges -> each vertex is its own SCC;
- one large cycle -> one SCC;
- self-loop;
- disconnected directed graph;
- long DFS chain.

## Platform transfer
This is a reusable advanced-graph implementation. For CodeChef/HackerEarth stdin tasks, parse edges into adjacency lists. For CodeSignal/Codility/CoderPad, expose the method and keep the repository test cases unchanged.

## Files
- Java: `java/Solution.java`
- Python: `python/solution.py`
- Tests: `tests/test_cases.md`
