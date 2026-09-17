# Permutations

**Pattern:** Backtracking

## Simple idea
Build the answer one choice at a time. At each level choose an unused value, recurse, then undo the choice.

## Recognition
- Generate all valid arrangements or choices.
- A decision is made, explored, then undone.
- The number of possibilities grows rapidly.

## Brute-force thinking
Generate every arrangement without a clear state-management strategy.

## Optimized idea
Use a `used` array/set, add a choice to the current path, recurse, remove it, and mark it unused again.

## Complexity
There are `n!` permutations, and copying each answer costs `O(n)`, so output itself is `O(n · n!)`.

## Pattern lesson
Backtracking is simply **choose -> explore -> undo**.
