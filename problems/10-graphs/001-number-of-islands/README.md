# Number of Islands — Graph/Grid DFS

## Goal
Count connected groups of land cells in a grid.

## Pattern recognition
A grid where cells connect up/down/left/right is a graph in disguise. Connectivity questions suggest DFS or BFS.

## Simple idea
When an unvisited land cell is found, count one island and traverse all connected land cells, marking them visited.

## Example
`[[1,1,0],[0,1,0],[1,0,1]]` contains 3 islands.

## Brute force
Repeatedly search the whole grid for each candidate region. Marking cells during traversal avoids repeated work.

## Complexity
Time O(rows × columns), space O(rows × columns) worst case for recursion/visited state.

## Common mistakes
- Forgetting boundary checks.
- Visiting diagonals when only four directions are allowed.
- Counting the same island more than once.
