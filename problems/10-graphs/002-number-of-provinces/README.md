# Number of Provinces

**Pattern:** Graph DFS / Connected Components

## Simple idea
Each city is a node. A connection tells us which cities belong to the same group. Start a traversal from every unvisited city; each new traversal discovers one province.

## Recognition
- Count connected groups.
- Input is an adjacency matrix or graph.
- You must avoid visiting the same node repeatedly.

## Brute-force thinking
Repeatedly inspect relationships without tracking visited nodes causes repeated work.

## Optimized idea
Keep a `visited` array. Run DFS/BFS from each unvisited node and increment the province count.

## Complexity
- Time: `O(n^2)` for an `n x n` adjacency matrix.
- Extra space: `O(n)` excluding recursion details.

## Pattern lesson
Connected-components problems usually have the same outer loop: **for every unvisited node, start one traversal**.
