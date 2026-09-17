# Three-Way Quickselect

## What is the topic?
Quickselect finds the element at a target rank without fully sorting. Three-way partition separates `< pivot`, `= pivot`, and `> pivot`.

## Recognize it
Need kth smallest/largest and the array may contain many duplicate values.

## Invariant
After partition: `[less | equal | greater]`; the target must lie in only one region.

## Complexity
Average `O(n)`, worst-case `O(n²)`, expected in-place space `O(1)` apart from recursion/iteration.

## 👁️ Visualize Mode
```text
[ < pivot ][ = pivot ][ > pivot ]
     L          M          R
```
Move the search interval to the region containing `k`.

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
