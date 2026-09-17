# Binary Search

## Pattern
**Binary Search**

## Recognition clues
Think binary search when:
- the data is sorted, or
- the answer space is monotonic, meaning once a condition becomes true it stays true (or vice versa).

For this foundation problem, the array is sorted and we search for an exact value.

## Core idea
Instead of checking every element, inspect the middle.

- If `nums[mid]` is too small, discard the left half.
- If `nums[mid]` is too large, discard the right half.
- Otherwise, the target is found.

Each step cuts the search space roughly in half.

## Brute force
Linear search takes `O(n)` time.

## Optimized algorithm
1. Set `left = 0` and `right = n - 1`.
2. Calculate `mid`.
3. Compare `nums[mid]` with `target`.
4. Keep only the half that can still contain the target.
5. Continue while `left <= right`.

## Complexity
- Time: `O(log n)`
- Extra space: `O(1)`

## Common mistakes
- Using the wrong loop condition.
- Moving the wrong boundary.
- Writing `mid = (left + right) / 2` in languages/settings where integer overflow matters. A safer form is `left + (right - left) / 2`.

## Pattern takeaway
**Sorted or monotonic search space → ask whether half of the candidates can be discarded after one comparison.**
