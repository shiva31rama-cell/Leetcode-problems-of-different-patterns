# Inversion Count — Fenwick Tree + Coordinate Compression

**Pattern:** Fenwick Tree + Coordinate Compression
**Level:** Advanced
**Source:** General DSA / competitive-programming pattern

## What is the topic?
An inversion is a pair of indices `i < j` where `nums[i] > nums[j]`.

Example:
```text
[8, 4, 2, 1]
```
contains `6` inversions.

A Fenwick tree lets us count how many processed values are smaller than the current value.

## Why coordinate compression?
The numbers may be very large, negative, or sparse. We map their sorted unique values to compact ranks `1..m`, which are perfect for a Fenwick tree.

## Recognition
Think **Fenwick + compression** when:
- you need inversion/order statistics;
- values are too large to use directly as array indices;
- updates are point-based and queries are prefix-based.

## State / invariant
After processing a prefix, `bit[r]` stores enough information to answer:

`how many processed values have rank <= r?`

For each new value of rank `r`, the number of earlier values greater than it is:

`processed - prefixSum(r)`.

## Syntax template
### Java
```java
long countInversions(int[] nums) { }
```

### Python
```python
def count_inversions(nums: list[int]) -> int:
    pass
```

## Complexity
- Compression: `O(n log n)`
- Fenwick processing: `O(n log n)`
- Total: `O(n log n)`
- Space: `O(n)`

## 👁️ Visualize Mode
```mermaid
flowchart LR
    A[Original values] --> B[Sort unique values]
    B --> C[Assign compact ranks]
    C --> D[Scan left to right]
    D --> E[Query smaller ranks]
    E --> F[Add current rank]
    F --> D
```

Example `[8,4,2,1]`:

| Current | Rank | Processed before | Earlier greater values |
|---|---:|---:|---:|
| 8 | 4 | 0 | 0 |
| 4 | 3 | 1 | 1 |
| 2 | 2 | 2 | 2 |
| 1 | 1 | 3 | 3 |

Total = `6`.

## Sample
Input:
```text
[8,4,2,1]
```
Output:
```text
6
```

## Edge cases
- already sorted ascending -> `0`;
- descending -> `n(n-1)/2`;
- duplicates do not create inversions unless the left value is strictly larger;
- negative values;
- large values outside normal array-index range.

## Platform transfer
This is especially useful for CodeChef/HackerEarth-style stdin/stdout tasks, but the core method also works in function-based judges and interview IDEs.

## Files
- Java: `java/Solution.java`
- Python: `python/solution.py`
- Tests: `tests/test_cases.md`
