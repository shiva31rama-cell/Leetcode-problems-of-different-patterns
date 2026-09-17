# Binary Tree Level Order Traversal — Tree BFS

## Goal
Return tree values level by level, from top to bottom.

## Pattern recognition
If the question says **level by level**, **minimum levels**, or **nearest by distance in an unweighted tree**, think BFS with a queue.

## Simple idea
Put the root in a queue. For each level, process exactly the nodes currently in the queue and add their children for the next level.

## Example
Tree `[3,9,20,null,null,15,7]` → `[[3],[9,20],[15,7]]`.

## Brute-force alternative
Recursive DFS can collect nodes by depth, but BFS matches the requested level order directly.

## Complexity
Time O(n), space O(n) in the widest level.

## Common mistakes
- Mixing nodes from different levels.
- Removing from the wrong end of the queue.
