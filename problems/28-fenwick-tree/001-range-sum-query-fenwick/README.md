# Fenwick Tree (Binary Indexed Tree)

**Pattern:** Fenwick Tree / BIT
**Level:** Medium
**Related problem:** LeetCode 307 style mutable range sums

## What is the topic?
A **Fenwick tree** stores prefix information in a compact array. It is especially useful for point updates and prefix/range sums.

## Recognition
Use it when you need many point updates and prefix/range sum queries, usually with an associative operation such as sum.

## Core idea
For index `i`, the Fenwick tree stores the sum of a block whose size is controlled by the lowest set bit: `i & -i`. Prefix sum repeatedly moves `i` backward by that block size. Update repeatedly moves forward.

## Syntax template
### Java
```java
int lowbit = index & -index;
while (index <= n) { bit[index] += delta; index += lowbit; }
while (index > 0) { sum += bit[index]; index -= index & -index; }
```
### Python
```python
while index <= n:
    bit[index] += delta
    index += index & -index
```

## Complexity
- Build: `O(n log n)` in this simple implementation
- Point update: `O(log n)`
- Prefix sum: `O(log n)`
- Range sum: `O(log n)`
- Space: `O(n)`

## 👁️ Visualize Mode
```mermaid
flowchart LR
    A[Update index] --> B[Add delta]
    B --> C[Move index += i & -i]
    C --> D{Inside tree?}
    D -->|Yes| B
    E[Prefix query] --> F[Add bit[index]]
    F --> G[Move index -= i & -i]
    G --> H{index > 0?}
    H -->|Yes| F
```

For `n=8`, an index does not represent one element only; it represents a block. The `lowbit` determines the block size.

## Sample
Array `[1,3,5,7]`: prefix sum through index `3` is `16`. After changing index `1` from `3` to `2`, the prefix sum becomes `15`.

## Tests
See `tests/test_cases.md`.

## Files
- Java: `java/Solution.java`
- Python: `python/solution.py`
- Tests: `tests/test_cases.md`
