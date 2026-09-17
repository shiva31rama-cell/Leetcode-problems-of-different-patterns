# Test Cases and Sample Outputs

Every core module should be tested against normal, edge, and variation inputs.

## 1. Two Sum — Hashing

| Test | Input | Expected |
|---|---|---|
| Normal | `nums=[2,7,11,15], target=9` | `[0,1]` |
| Duplicate values | `nums=[3,3], target=6` | `[0,1]` |
| Middle pair | `nums=[3,2,4], target=6` | `[1,2]` |
| Negative values | `nums=[-3,4,3,90], target=0` | `[0,2]` |

Sample output:
```text
[0, 1]
```

## 2. Two Sum II — Two Pointers

| Test | Input | Expected |
|---|---|---|
| Normal | `[2,7,11,15], 9` | `[1,2]` |
| Middle pair | `[2,3,4], 6` | `[1,3]` |
| Negative | `[-1,0], -1` | `[1,2]` |

## 3. 3Sum — Two Pointers + Sorting

| Test | Input | Expected |
|---|---|---|
| Standard | `[-1,0,1,2,-1,-4]` | `[[-1,-1,2],[-1,0,1]]` |
| No answer | `[0,1,1]` | `[]` |
| All zero | `[0,0,0,0]` | `[[0,0,0]]` |

Sample output:
```text
[[-1, -1, 2], [-1, 0, 1]]
```

## 4. Longest Substring Without Repeating Characters — Sliding Window

| Test | Input | Expected |
|---|---|---|
| Repeating | `"abcabcbb"` | `3` |
| All same | `"bbbbb"` | `1` |
| Empty | `""` | `0` |
| Mixed repeat | `"pwwkew"` | `3` |

## 5. Minimum Size Subarray Sum — Sliding Window

| Test | Input | Expected |
|---|---|---|
| Standard | `target=7, [2,3,1,2,4,3]` | `2` |
| No window | `target=4, [1,1,1,1]` | `0` |
| Single item | `target=4, [1,4,4]` | `1` |

Sample output:
```text
2
```

Important: this variable-window solution relies on **positive numbers**, so increasing the right side does not decrease the sum.

## 6. Subarray Sum Equals K — Prefix Sum + Hash Map

| Test | Input | Expected |
|---|---|---|
| Standard | `[1,1,1], k=2` | `2` |
| Negative numbers | `[1,-1,0], k=0` | `3` |
| Single match | `[3,4,7,2,-3,1,4,2], k=7` | `4` |

## 7. Binary Search

| Test | Input | Expected |
|---|---|---|
| Found | `[1,2,3,4,5], target=4` | `3` |
| Missing | `[1,2,3,4,5], target=9` | `-1` |
| One element found | `[7], target=7` | `0` |

## 8. Search in Rotated Sorted Array — Modified Binary Search

| Test | Input | Expected |
|---|---|---|
| Left target | `[4,5,6,7,0,1,2], target=5` | `1` |
| Right target | `[4,5,6,7,0,1,2], target=0` | `4` |
| Missing | `[4,5,6,7,0,1,2], target=3` | `-1` |
| Two values | `[3,1], target=1` | `1` |

## 9. Valid Parentheses — Stack

| Test | Input | Expected |
|---|---|---|
| Valid | `"()[]{}"` | `true` |
| Invalid order | `"([)]"` | `false` |
| Nested | `"{[]}"` | `true` |
| Closing first | `"]"` | `false` |

## 10. Min Stack — Stack + Auxiliary State

Operations:
```text
push(-2)
push(0)
push(-3)
getMin()
pop()
top()
getMin()
```
Expected results:
```text
getMin() -> -3
top()    -> 0
getMin() -> -2
```

Extra tests:
```text
push(2)
push(2)
pop()
getMin() -> 2
```

## 11. Daily Temperatures / Next Greater — Monotonic Stack

Input:
```text
[73,74,75,71,69,72,76,73]
```
Output:
```text
[1,1,4,2,1,1,0,0]
```

Circular next-greater variation:
```text
Input:  [1,2,1]
Output: [2,-1,2]
```

## 12. Reverse Linked List

| Test | Input list | Expected |
|---|---|---|
| Standard | `1 -> 2 -> 3 -> 4 -> 5` | `5 -> 4 -> 3 -> 2 -> 1` |
| Two nodes | `1 -> 2` | `2 -> 1` |
| One node | `1` | `1` |
| Empty | `null` | `null` |

## 13. Maximum Depth of Binary Tree

Tree:
```text
        3
       / \
      9  20
         / \
        15  7
```

Output:
```text
3
```

Edge cases:
```text
root = null -> 0
root = [1]   -> 1
```

## 14. Number of Provinces — Graph DFS / DSU

Input:
```text
[[1,1,0],
 [1,1,0],
 [0,0,1]]
```
Output:
```text
2
```

Disconnected example:
```text
[[1,0,0],
 [0,1,0],
 [0,0,1]]
```
Output:
```text
3
```

## 15. Number of Islands — Grid DFS/BFS

Input:
```text
11110
11010
11000
00000
```
Output:
```text
1
```

Second example:
```text
11000
11000
00100
00011
```
Output:
```text
3
```

## 16. Rotting Oranges — Multi-source BFS

Input:
```text
[[2,1,1],
 [1,1,0],
 [0,1,1]]
```
Output:
```text
4
```

Impossible case:
```text
[[2,1,1],
 [0,1,1],
 [1,0,1]]
```
Output:
```text
-1
```

## 17. Top K Frequent Elements — Hashing + Heap

Input:
```text
nums = [1,1,1,2,2,3], k = 2
```
Expected:
```text
[1,2]
```
Order can vary when multiple valid outputs are accepted by the platform.

## 18. Assign Cookies — Greedy + Two Pointers

| Test | Input | Expected |
|---|---|---|
| Standard | `g=[1,2,3], s=[1,1]` | `1` |
| Enough cookies | `g=[1,2], s=[1,2,3]` | `2` |
| No cookies | `g=[1,2], s=[]` | `0` |

## 19. Permutations — Backtracking

Input:
```text
[1,2,3]
```
Number of outputs:
```text
6
```
Representative outputs:
```text
[1,2,3]
[1,3,2]
[2,1,3]
[2,3,1]
[3,1,2]
[3,2,1]
```

## 20. Coin Change — 1D DP

| Test | Input | Expected |
|---|---|---|
| Standard | `coins=[1,2,5], amount=11` | `3` |
| Impossible | `coins=[2], amount=3` | `-1` |
| Zero amount | `coins=[1], amount=0` | `0` |

## 21. Trie

Operations:
```text
insert("apple")
search("apple") -> true
search("app")   -> false
startsWith("app") -> true
insert("app")
search("app")   -> true
```

## 22. Counting Bits

Input:
```text
n = 5
```
Output:
```text
[0,1,1,2,1,2]
```

## 23. Test-case quality checklist

Every new problem module must include:

- one normal case
- one boundary/minimum case
- one maximum/large-pattern case when practical
- duplicate values where relevant
- negative values where relevant
- empty/null input where allowed
- already sorted input where relevant
- reverse-sorted input where relevant
- impossible/no-solution case where applicable
- expected output
- one-line reason the case is important

## 24. Java + Python parity

The Java and Python implementation of a problem should solve the **same logical test cases**. Syntax can differ; the algorithm and expected output must agree.
