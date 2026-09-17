# Meeting Rooms II

## What is the topic?
Find the minimum number of rooms needed so overlapping meetings can coexist.

## Recognize it
Intervals + resource counting. Sort starts/ends or use a min-heap of active end times.

## Optimized
Sort by start time and keep the earliest ending active meeting in a min-heap.

## Invariant
Heap contains end times of meetings currently occupying rooms.

## Complexity
`O(n log n)` time, `O(n)` space.

## 👁️ Visualize Mode
```text
meetings: [1,4] [2,5] [5,7]
rooms:     A     B     A
```
When the smallest end time is `<= start`, reuse that room.

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
