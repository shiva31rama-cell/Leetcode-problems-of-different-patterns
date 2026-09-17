# Minimum Size Subarray Sum

**Pattern:** Sliding Window

## Simple idea
Keep a window from `left` to `right`. Expand it until its sum is large enough, then shrink it from the left while it remains valid.

## Recognition
Look for a contiguous subarray and a condition such as sum >= target. With positive numbers, shrinking the window makes the sum smaller, which makes the window controllable.

## Brute force
Try every starting point and extend the ending point: `O(n^2)`.

## Optimized idea
Maintain one moving window. Every element enters once and leaves once.

## Complexity
- Time: `O(n)`
- Extra space: `O(1)`

## Pattern lesson
A sliding window is useful when the validity of a contiguous range can be maintained while the two boundaries move forward.
