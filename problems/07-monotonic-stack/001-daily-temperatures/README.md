# Daily Temperatures — Monotonic Stack Pattern

## Goal
For each day, find how many days we wait until a warmer temperature appears.

## Pattern recognition
If the question asks for the **next greater/smaller element**, think about a monotonic stack.

## Simple idea
Keep indices whose warmer day has not been found yet. When the current temperature is warmer than the temperature at the stack top, resolve that older index.

Example: `[73, 74, 75, 71, 69, 72]` → `[1, 1, 3, 2, 1, 0]`.

## Brute force
For every day, scan all following days until a warmer one is found: O(n²).

## Optimized
Each index enters and leaves the stack at most once: O(n) time and O(n) space.

## Invariant
The stack contains indices whose answer is still unknown, with temperatures kept in decreasing order.

## Common mistakes
- Storing temperatures instead of indices when the distance is required.
- Popping when the current value is not strictly warmer.
