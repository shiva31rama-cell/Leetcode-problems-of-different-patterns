# 3Sum

**Pattern:** Two Pointers + Sorting

## Simple idea
Choose one number. Then use two pointers on the remaining sorted part to find two numbers that complete the target sum.

## When to recognize it
- Find three values that satisfy a sum.
- The input can be sorted.
- You need to avoid duplicate triplets.

## Brute force
Try every combination of three indices: `O(n^3)`.

## Optimized idea
Sort the array. Fix the first value, then solve a two-sum problem with `left` and `right` pointers.

## Example
`[-1, 0, 1, 2, -1, -4]` produces `[-1,-1,2]` and `[-1,0,1]`.

## Complexity
- Time: `O(n^2)` after sorting.
- Extra space: `O(1)` apart from the output, depending on sorting implementation.

## Pattern lesson
Sorting gives an order that tells us which pointer to move. Duplicate skipping is part of the pattern.
