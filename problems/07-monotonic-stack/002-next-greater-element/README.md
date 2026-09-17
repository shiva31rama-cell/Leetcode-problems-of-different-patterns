# Next Greater Element

**Pattern:** Monotonic Stack

## Simple idea
For every value, find the first value to its right that is greater. Keep unresolved values in a decreasing stack.

## Recognition
The question asks for the next greater or next smaller value while scanning an array.

## Brute force
For every index, scan right until a greater value is found: `O(n^2)`.

## Optimized idea
When the current value is greater than the stack top, the current value answers the pending index. Pop until the stack is valid again.

## Complexity
- Time: `O(n)` because each index is pushed and popped at most once.
- Extra space: `O(n)`.

## Pattern lesson
A monotonic stack is a way to remember unresolved candidates while removing candidates that can no longer be useful.
