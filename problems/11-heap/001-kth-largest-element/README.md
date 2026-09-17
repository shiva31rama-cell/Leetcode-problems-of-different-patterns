# Kth Largest Element — Heap Pattern

## Goal
Find the kth largest value without fully sorting the array.

## Pattern recognition
Repeatedly asking for the smallest/largest item, or keeping the top K items, suggests a heap.

## Simple idea
Maintain a **min-heap of size k**. Add each value. If the heap grows beyond k, remove the smallest. The root is then the kth largest.

## Example
`[3,2,1,5,6,4], k=2` → `5`.

## Brute force
Sort the entire array and take the kth largest: O(n log n).

## Optimized
Heap approach: O(n log k) time and O(k) extra space.

## Common mistakes
- Using a max-heap of all n elements when only k items are needed.
- Removing the wrong heap end.
