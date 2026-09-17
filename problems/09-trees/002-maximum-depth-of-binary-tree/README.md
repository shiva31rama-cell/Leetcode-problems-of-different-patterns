# Maximum Depth of Binary Tree

**Pattern:** Tree DFS

## Simple idea
The depth of a node is one plus the larger depth of its two children.

## Recognition
A tree problem asks for height, depth, maximum/minimum path length, or information from child subtrees.

## Brute-force thinking
You could repeatedly walk paths, but that duplicates work.

## Optimized idea
Use recursive DFS. Solve the left subtree, solve the right subtree, then combine their answers.

## Complexity
- Time: `O(n)`
- Extra space: `O(h)` for recursion, where `h` is tree height.

## Pattern lesson
Many tree problems follow: **solve children -> combine child answers -> return to parent**.
