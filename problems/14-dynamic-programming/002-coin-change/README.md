# Coin Change

**Pattern:** Dynamic Programming

## Simple idea
For every amount, remember the smallest number of coins needed to make it.

## Recognition
- There are repeated subproblems.
- You make choices and want the best result.
- The same smaller amounts appear again and again.

## Brute force
Try every possible coin choice recursively. This repeats the same subproblems.

## Optimized idea
Let `dp[amount]` mean the minimum coins needed for that amount. Build answers from smaller amounts.

## Complexity
For `n` coin types and target amount `A`: `O(nA)` time and `O(A)` space.

## Pattern lesson
DP starts with a precise state definition. Once you know what `dp[x]` means, the transition becomes much easier to derive.
