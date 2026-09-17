# Jump Game — Greedy Pattern

## Goal
Decide whether the last index is reachable when each value tells the maximum jump length.

## Pattern recognition
If choices can be summarized by the **best reachable boundary so far**, try greedy.

## Simple idea
Scan left to right and keep `farthest`, the furthest index reachable from everything seen so far. If the current index is beyond it, we are stuck.

## Example
`[2,3,1,1,4]` → true because the reachable boundary keeps extending to the end.

## Brute force
Try every possible jump recursively; this can become exponential.

## Optimized
One scan, O(n) time and O(1) space.

## Invariant
After processing index i, `farthest` is the greatest index reachable using positions up to i.
