# Counting Bits

**Pattern:** Bit Manipulation + Dynamic Programming

## Simple idea
For each number, count how many `1` bits appear in its binary representation.

## Recognition
- The problem is about binary representation or set bits.
- Adjacent numbers have related binary states.
- A compact recurrence can reuse an earlier result.

## Simple method
Repeatedly remove the lowest set bit with `x & (x - 1)`.

## Optimized DP idea
For each `i`, remove its lowest set bit and reuse the answer for the remaining value: `dp[i] = dp[i & (i - 1)] + 1`.

## Complexity
- Time: `O(n)` for the DP approach.
- Extra space: `O(n)` for the answer array.

## Pattern lesson
Bit tricks become much easier when you understand the exact binary change caused by an operation such as `x & (x - 1)`.
