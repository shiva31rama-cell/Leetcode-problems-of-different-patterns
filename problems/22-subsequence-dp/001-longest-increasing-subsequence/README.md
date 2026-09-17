# Longest Increasing Subsequence

**Pattern:** Subsequence DP + Binary Search variation
**Level:** Medium
**Source:** LeetCode 300

## What is the topic?

A subsequence keeps order but may skip elements. LIS asks for the longest strictly increasing subsequence.

## Recognition

Think subsequence DP when the problem asks for the longest or best sequence while preserving order.

## Two approaches

1. DP: `dp[i]` = LIS ending at `i`, `O(n²)`.
2. Tails + binary search: maintain the smallest possible tail for every length, `O(n log n)`.

## 👁️ Visualize Mode

For `[10,9,2,5,3,7,101,18]`, tails evolves approximately as:

`[] -> [10] -> [9] -> [2] -> [2,5] -> [2,3] -> [2,3,7] -> [2,3,7,101] -> [2,3,7,18]`

The length is `4`.

## Sample

Input: `[10,9,2,5,3,7,101,18]`

Output: `4`

## Test cases

- `[10,9,2,5,3,7,101,18] -> 4`
- `[0,1,0,3,2,3] -> 4`
- `[7,7,7,7] -> 1`

## Files

- Java: `java/Solution.java`
- Python: `python/solution.py`
