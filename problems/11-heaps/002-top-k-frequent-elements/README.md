# Top K Frequent Elements

**Pattern:** Hashing + Heap

## Simple idea
Count how often every value appears, then keep only the K most frequent values.

## Recognition
- The problem asks for the largest/smallest/top K items.
- A frequency or score must be calculated first.
- You do not need the complete ordering.

## Brute-force thinking
Sort all candidates after counting: roughly `O(n log n)`.

## Optimized idea
Use a min-heap of size K. When the heap grows beyond K, remove the least useful candidate.

## Complexity
Typical heap solution: `O(n log k)` after counting, with `O(n)` auxiliary storage.

## Pattern lesson
When only K best elements matter, a heap of size K avoids fully sorting every candidate.
