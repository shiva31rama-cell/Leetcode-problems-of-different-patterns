# Valid Parentheses — Stack Pattern

## Goal
Check whether every opening bracket is closed by the correct bracket in the correct order.

## Pattern recognition
Use a **stack** when the latest unfinished item must be handled first (LIFO). Nested brackets are the classic signal.

## Simple idea
- Opening bracket → push it.
- Closing bracket → the top must be its matching opening bracket.
- At the end the stack must be empty.

## Brute force
Repeatedly remove matching adjacent pairs. This is easy to imagine but can require repeated scans, so it is less clean and can become O(n²).

## Optimized approach
One left-to-right stack scan.

Example: `([{}])`

`(` push → `[` push → `{` push → `}` matches → `]` matches → `)` matches → empty.

## Complexity
Time: O(n)  |  Space: O(n)

## Common mistakes
- Checking only whether brackets exist, not their order.
- Forgetting to reject a closing bracket when the stack is empty.
- Returning true while unmatched openings remain.

## Medium extension
Once this pattern is clear, it can be combined with stacks for expression evaluation, removing adjacent pairs, and nested structure validation.
