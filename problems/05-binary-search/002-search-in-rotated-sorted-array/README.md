# Search in Rotated Sorted Array

**Pattern:** Modified Binary Search

## Simple idea
At every step, at least one half of the current range is sorted. Check which half is sorted, then decide whether the target belongs there.

## Recognition
- The array is sorted but rotated.
- Search must be faster than scanning.
- A sorted half remains visible after rotation.

## Brute force
Scan from left to right: `O(n)`.

## Optimized idea
Use `left`, `mid`, and `right`. Identify the sorted half and discard the half that cannot contain the target.

## Complexity
- Time: `O(log n)` for the standard distinct-value version.
- Extra space: `O(1)`.

## Pattern lesson
Binary search is not only for perfectly sorted arrays. The key is finding an invariant that lets you safely discard part of the search space.
