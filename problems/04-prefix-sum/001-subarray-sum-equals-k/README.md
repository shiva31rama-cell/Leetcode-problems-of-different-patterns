# Subarray Sum Equals K

## Pattern
**Prefix Sum + Hash Map**

## Recognition clues
Look for:
- contiguous subarray
- exact target sum
- negative numbers may appear
- need to count how many valid subarrays exist

A normal sliding window is not reliable when negative numbers are allowed.

## Core idea
Let `prefix` be the sum from the beginning up to the current position.

If an earlier prefix sum was `prefix - k`, then the elements between that earlier position and the current position sum to `k`.

So we store how many times each prefix sum has appeared.

## Brute force
Check every possible subarray and calculate its sum. This takes `O(n²)` time with a running sum.

## Optimized algorithm
1. Start with `prefix = 0`.
2. Store `frequency[0] = 1` because an empty prefix exists.
3. Add the current value to `prefix`.
4. Look for `prefix - k` in the frequency map.
5. Add that frequency to the answer.
6. Store the current prefix sum.

## Complexity
- Time: `O(n)` average.
- Extra space: `O(n)`.

## Dry run
For `[1, 1, 1]`, `k = 2`:

Prefixes are `1, 2, 3`.

At prefix `2`, we need `0` → one subarray.

At prefix `3`, we need `1` → one earlier prefix, giving another subarray.

Answer: `2`.

## Common mistakes
- Forgetting `frequency[0] = 1`.
- Storing the current prefix before checking `prefix - k`.
- Using sliding window when negative values can occur.

## Pattern takeaway
**Subarray target sum + possible negative values → think prefix sum + frequency map.**
