# Single Number — XOR Pattern

## Goal
Find the value that appears once when every other value appears exactly twice.

## Pattern recognition
When values occur in pairs and one value is unmatched, XOR is a strong clue.

## Key XOR facts
- `x ^ x = 0`
- `x ^ 0 = x`
- XOR is associative and commutative.

So paired values cancel and the remaining value stays.

## Example
`[4,1,2,1,2]` → `4`.

## Complexity
Time O(n), extra space O(1).

## Common mistakes
The cancellation property depends on the stated frequency condition. XOR is not a general replacement for counting.
