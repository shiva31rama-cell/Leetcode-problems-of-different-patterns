# House Robber — 1D Dynamic Programming

## Goal
Find the maximum money that can be collected without choosing adjacent houses.

## Pattern recognition
If the answer depends on the best answer from earlier positions and choices overlap, think DP.

## State
`dp[i]` = maximum money we can collect from the first i houses.

## Transition
For the current house: either skip it (`dp[i-1]`) or rob it plus the best before the previous house (`dp[i-2] + value`).

## Example
`[2,7,9,3,1]` → 12 by choosing 2, 9, 1.

## Brute force
Try rob/skip choices recursively; exponential without memoization.

## Optimized
Only the previous two states are needed, so space can be reduced to O(1). Time is O(n).

## Common mistakes
- Using `dp[i-1] + nums[i]`, which illegally robs adjacent houses.
- Confusing an index state with a prefix-length state.
