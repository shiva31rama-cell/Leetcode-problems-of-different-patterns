# Two Sum II — Input Array Is Sorted

## Pattern
**Two Pointers**

## Why this problem belongs here
The array is sorted. We need two values whose sum equals the target. That combination is a strong signal for two pointers.

## Recognition clues
Look for:
- sorted array
- pair of elements
- target sum / target difference
- need to move from both sides

## Core idea
Keep one pointer at the left end and one at the right end.

- If the sum is too small, move `left` rightward to increase the sum.
- If the sum is too large, move `right` leftward to decrease the sum.
- If the sum equals the target, return the pair.

The sorted order makes these pointer moves safe.

## Brute force
Try every pair: `O(n²)` time and `O(1)` extra space.

## Optimized algorithm
1. Set `left = 0` and `right = n - 1`.
2. Calculate `nums[left] + nums[right]`.
3. Move the appropriate pointer based on the comparison with `target`.
4. Stop when the target is found.

## Complexity
- Time: `O(n)`
- Extra space: `O(1)`

## Dry run
For `[2, 7, 11, 15]`, target `9`:

`2 + 15 = 17` → too large → move `right`.

`2 + 11 = 13` → too large → move `right`.

`2 + 7 = 9` → found.

## Common mistakes
- Using this exact method on an unsorted array.
- Moving the wrong pointer.
- Forgetting that the problem uses 1-based answer indices.

## Pattern takeaway
**Sorted + pair condition → check whether opposite-end pointers can shrink the search space.**
