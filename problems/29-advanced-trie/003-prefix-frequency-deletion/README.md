# Trie Prefix Frequency + Deletion

## What is the topic?
A Trie stores strings by characters; each node can track how many inserted words pass through it.

## Recognize it
Need fast prefix counts, insertions, and deletions.

## Optimized
Store `pass` and `end` counts. Insert increments both along the path; delete decrements them.

## Invariant
`pass` at a node equals the number of active words having that prefix.

## Complexity
Insert/delete/prefix query `O(L)` where `L` is word length; space `O(total characters)`.

## Sample
Insert `apple`, `app`, `ape`; prefix `ap` → `3`; delete `app`; prefix `ap` → `2`.

## 👁️ Visualize Mode
```text
root → a → p → p
          ↘ e
pass counts flow down the prefix path.
```

## Java/Python
Both implementations use explicit node counts and safe deletion.

- [Java](java/Solution.java)
- [Python](python/solution.py)
- [Tests](tests/test_cases.md)
