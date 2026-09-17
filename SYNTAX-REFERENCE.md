# DSA Pattern Syntax Reference — Java + Python

This file is the **syntax handbook** for the entire pattern-first course.

The goal is not to memorize hundreds of solutions. The goal is to learn the small number of coding structures that repeatedly appear in DSA problems.

## How to use this file

For every topic, study in this order:

1. **What is it?**
2. **When do I recognize it?**
3. **Java syntax**
4. **Python syntax**
5. **Small example**
6. **Time and space complexity**
7. **Test cases**
8. **Then solve representative problems**

---

# 0. Basic Programming Syntax

## Variables

### Java
```java
int age = 20;
long population = 10000000000L;
double price = 99.50;
char grade = 'A';
boolean found = true;
String name = "Rama";
```

### Python
```python
age = 20
population = 10_000_000_000
price = 99.50
grade = 'A'
found = True
name = "Rama"
```

## Input

### Java
```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
String s = sc.next();
```

For fast competitive-programming input, use a buffered reader/custom fast scanner when constraints are large.

### Python
```python
n = int(input())
s = input().strip()
a = list(map(int, input().split()))
```

For multiple test cases:

### Java
```java
int t = sc.nextInt();
while (t-- > 0) {
    // solve one test case
}
```

### Python
```python
t = int(input())
for _ in range(t):
    # solve one test case
    pass
```

## Loops

### Java
```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}

while (left < right) {
    left++;
}
```

### Python
```python
for i in range(n):
    print(i)

while left < right:
    left += 1
```

## Function / Method

### Java
```java
static int add(int a, int b) {
    return a + b;
}
```

### Python
```python
def add(a, b):
    return a + b
```

## Array / List

### Java
```java
int[] a = {10, 20, 30};
int n = a.length;
System.out.println(a[0]);
```

### Python
```python
a = [10, 20, 30]
n = len(a)
print(a[0])
```

---

# 1. Hashing / Frequency Map

## What is it?

Hashing stores a value so that we can usually **find, insert, or count it quickly**.

Common Java structures:
- `HashMap<K,V>` → key/value
- `HashSet<T>` → unique values

Common Python structures:
- `dict` → key/value
- `set` → unique values

## Recognize it when

- "Have I seen this before?"
- Count frequencies.
- Find a complement.
- Group equal/similar items.

### Java syntax
```java
Map<Integer, Integer> map = new HashMap<>();
map.put(5, 1);
map.put(5, map.getOrDefault(5, 0) + 1);

if (map.containsKey(5)) {
    int value = map.get(5);
}
```

### Python syntax
```python
freq = {}
freq[5] = freq.get(5, 0) + 1

if 5 in freq:
    value = freq[5]
```

### Typical complexity
Average `O(1)` lookup/insert; `O(n)` total for one pass.

### Mini example
Input: `[2, 7, 11, 15]`, target `9`
Output: `[0, 1]`

---

# 2. Two Pointers

## What is it?

Keep two positions and move them intelligently instead of checking every pair.

Typical forms:
- left/right on a sorted array
- slow/fast
- left/right around a center

### Java syntax
```java
int left = 0;
int right = a.length - 1;

while (left < right) {
    int sum = a[left] + a[right];

    if (sum == target) {
        break;
    } else if (sum < target) {
        left++;
    } else {
        right--;
    }
}
```

### Python syntax
```python
left = 0
right = len(a) - 1

while left < right:
    total = a[left] + a[right]

    if total == target:
        break
    elif total < target:
        left += 1
    else:
        right -= 1
```

### Main condition
Two pointers work especially well when **sorting gives movement information**.

---

# 3. Sliding Window

## What is it?

Maintain a moving contiguous range `[left ... right]` instead of recalculating every subarray/substring.

### Fixed window

### Java
```java
long sum = 0;
for (int i = 0; i < k; i++) {
    sum += a[i];
}

for (int right = k; right < a.length; right++) {
    sum += a[right];
    sum -= a[right - k];
}
```

### Python
```python
window_sum = sum(a[:k])

for right in range(k, len(a)):
    window_sum += a[right]
    window_sum -= a[right - k]
```

### Variable window

### Java
```java
int left = 0;
for (int right = 0; right < n; right++) {
    // add a[right]

    while (/* window is invalid */) {
        // remove a[left]
        left++;
    }

    // current window is valid
}
```

### Python
```python
left = 0
for right in range(len(a)):
    # add a[right]

    while False:  # replace with invalid-window condition
        # remove a[left]
        left += 1

    # current window is valid
```

### Recognize it
Look for: **contiguous substring/subarray + a condition on the current window**.

---

# 4. Prefix Sum

## What is it?

Precompute cumulative sums so a range sum can be answered quickly.

### Java
```java
int[] prefix = new int[n + 1];

for (int i = 0; i < n; i++) {
    prefix[i + 1] = prefix[i] + a[i];
}

// Sum from l to r inclusive
int rangeSum = prefix[r + 1] - prefix[l];
```

### Python
```python
prefix = [0] * (len(a) + 1)

for i, value in enumerate(a):
    prefix[i + 1] = prefix[i] + value

range_sum = prefix[r + 1] - prefix[l]
```

## Prefix Sum + Hash Map

Important equation:

`currentPrefix - oldPrefix = k`

Therefore:

`oldPrefix = currentPrefix - k`

This is the key idea behind **Subarray Sum Equals K**.

---

# 5. Binary Search

## What is it?

Repeatedly remove half of the search space.

### Standard Java template
```java
int left = 0;
int right = a.length - 1;

while (left <= right) {
    int mid = left + (right - left) / 2;

    if (a[mid] == target) {
        return mid;
    } else if (a[mid] < target) {
        left = mid + 1;
    } else {
        right = mid - 1;
    }
}

return -1;
```

### Standard Python template
```python
left = 0
right = len(a) - 1

while left <= right:
    mid = left + (right - left) // 2

    if a[mid] == target:
        return mid
    elif a[mid] < target:
        left = mid + 1
    else:
        right = mid - 1

return -1
```

## Binary search on answer

Use when the answer range is monotonic: **if X works, all larger/smaller values also work**.

Template:
```text
low = smallest possible answer
high = largest possible answer
while low <= high:
    mid = middle answer
    if feasible(mid):
        save mid
        move toward better answer
    else:
        move opposite direction
```

---

# 6. Stack

## What is it?

LIFO: **Last In, First Out**.

Use it for nested structures, undo-like behavior, matching pairs, expression processing.

### Java — preferred modern syntax
```java
Deque<Integer> stack = new ArrayDeque<>();
stack.push(10);
stack.push(20);
int top = stack.peek();
int value = stack.pop();
boolean empty = stack.isEmpty();
```

### Python
```python
stack = []
stack.append(10)
stack.append(20)
top = stack[-1]
value = stack.pop()
empty = len(stack) == 0
```

### Typical complexity
Push, pop, peek: `O(1)`.

---

# 7. Monotonic Stack

## What is it?

A stack kept in increasing or decreasing order.

Use it when the question asks for:
- next greater element
- next smaller element
- previous greater/smaller
- nearest element satisfying an inequality

### Java template
```java
Deque<Integer> stack = new ArrayDeque<>();

for (int i = 0; i < n; i++) {
    while (!stack.isEmpty() && a[stack.peek()] < a[i]) {
        int index = stack.pop();
        // a[i] is the next greater element for index
    }
    stack.push(i);
}
```

### Python template
```python
stack = []

for i, value in enumerate(a):
    while stack and a[stack[-1]] < value:
        index = stack.pop()
        # value is the next greater element for index
    stack.append(i)
```

---

# 8. Linked List Pointers

## What is it?

A linked list node points to another node.

### Java node
```java
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
```

### Python node
```python
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
```

## Reverse a linked list — core syntax

### Java
```java
ListNode prev = null;
ListNode curr = head;

while (curr != null) {
    ListNode next = curr.next;
    curr.next = prev;
    prev = curr;
    curr = next;
}

return prev;
```

### Python
```python
prev = None
curr = head

while curr:
    next_node = curr.next
    curr.next = prev
    prev = curr
    curr = next_node

return prev
```

## Fast and slow pointers

```text
slow moves 1 step
fast moves 2 steps
```

Useful for middle node and cycle detection.

---

# 9. Tree DFS

## What is it?

Depth First Search explores a branch before moving to another branch.

### Java node
```java
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}
```

### Recursive DFS
```java
int dfs(TreeNode root) {
    if (root == null) {
        return 0;
    }

    int left = dfs(root.left);
    int right = dfs(root.right);

    return 1 + Math.max(left, right);
}
```

### Python
```python
def dfs(root):
    if root is None:
        return 0

    left = dfs(root.left)
    right = dfs(root.right)

    return 1 + max(left, right)
```

---

# 10. Tree BFS / Level Order

## What is it?

Breadth First Search visits nodes level by level.

### Java
```java
Queue<TreeNode> queue = new ArrayDeque<>();
queue.offer(root);

while (!queue.isEmpty()) {
    int size = queue.size();

    for (int i = 0; i < size; i++) {
        TreeNode node = queue.poll();

        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
    }
}
```

### Python
```python
from collections import deque

queue = deque([root])

while queue:
    size = len(queue)

    for _ in range(size):
        node = queue.popleft()

        if node.left:
            queue.append(node.left)
        if node.right:
            queue.append(node.right)
```

---

# 11. Graph DFS / BFS

## What is a graph?

A set of vertices and edges.

Common representation: adjacency list.

### Java adjacency list
```java
List<List<Integer>> graph = new ArrayList<>();
for (int i = 0; i < n; i++) {
    graph.add(new ArrayList<>());
}

graph.get(u).add(v);
graph.get(v).add(u); // for undirected graph
```

### Python adjacency list
```python
graph = [[] for _ in range(n)]
graph[u].append(v)
graph[v].append(u)
```

### Java DFS
```java
void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
    visited[node] = true;

    for (int next : graph.get(node)) {
        if (!visited[next]) {
            dfs(next, graph, visited);
        }
    }
}
```

### Python DFS
```python
def dfs(node, graph, visited):
    visited[node] = True

    for nxt in graph[node]:
        if not visited[nxt]:
            dfs(nxt, graph, visited)
```

### BFS
Use a queue and mark nodes when they are added to the queue.

---

# 12. Multi-source BFS

## What is it?

Start BFS from **many sources at the same time**.

Typical clues:
- spreading fire/infection
- rotten oranges
- nearest source
- distance from any source

### Java
```java
Queue<int[]> queue = new ArrayDeque<>();

for (int r = 0; r < rows; r++) {
    for (int c = 0; c < cols; c++) {
        if (grid[r][c] == 2) {
            queue.offer(new int[]{r, c});
        }
    }
}
```

Then process the entire current queue level as one minute/step.

### Python
```python
from collections import deque

queue = deque()

for r in range(rows):
    for c in range(cols):
        if grid[r][c] == 2:
            queue.append((r, c))
```

---

# 13. Union-Find / DSU

## What is it?

Disjoint Set Union maintains groups and efficiently answers:
**Are these two nodes already connected?**

### Java core syntax
```java
int[] parent;
int[] size;

int find(int x) {
    if (parent[x] != x) {
        parent[x] = find(parent[x]);
    }
    return parent[x];
}

void union(int a, int b) {
    int pa = find(a);
    int pb = find(b);

    if (pa == pb) return;

    if (size[pa] < size[pb]) {
        int temp = pa;
        pa = pb;
        pb = temp;
    }

    parent[pb] = pa;
    size[pa] += size[pb];
}
```

### Python
```python
parent = list(range(n))
size = [1] * n

def find(x):
    if parent[x] != x:
        parent[x] = find(parent[x])
    return parent[x]

def union(a, b):
    pa = find(a)
    pb = find(b)

    if pa == pb:
        return

    if size[pa] < size[pb]:
        pa, pb = pb, pa

    parent[pb] = pa
    size[pa] += size[pb]
```

Key optimizations: **path compression + union by size/rank**.

---

# 14. Topological Sort

## What is it?

An ordering of vertices so that every directed edge `u -> v` places `u` before `v`.

Used for prerequisite/dependency problems.

### Kahn's algorithm — Java idea
```java
int[] indegree = new int[n];
Queue<Integer> queue = new ArrayDeque<>();

for (int i = 0; i < n; i++) {
    if (indegree[i] == 0) {
        queue.offer(i);
    }
}
```

Remove zero-indegree nodes and reduce their neighbors' indegrees.

### Python
```python
from collections import deque

indegree = [0] * n
queue = deque(i for i in range(n) if indegree[i] == 0)
```

If processed node count is less than `n`, a cycle exists.

---

# 15. Heap / Priority Queue

## What is it?

A heap gives quick access to the smallest or largest element.

### Java min-heap
```java
PriorityQueue<Integer> pq = new PriorityQueue<>();
pq.offer(5);
pq.offer(2);
pq.offer(8);
int smallest = pq.poll();
```

### Java max-heap
```java
PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
```

### Python min-heap
```python
import heapq

heap = []
heapq.heappush(heap, 5)
heapq.heappush(heap, 2)
smallest = heapq.heappop(heap)
```

Python's `heapq` is a min-heap. For a max-heap, often push negative values.

---

# 16. Intervals

## What is it?

Problems involving `[start, end]` ranges.

Common first step: **sort by start time**.

### Java
```java
Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
```

### Python
```python
intervals.sort(key=lambda x: x[0])
```

Then compare current interval with previous merged interval.

### Recognition
Words such as:
- merge
- overlap
- meeting
- schedule
- interval
- range

---

# 17. Greedy

## What is it?

Make the best-looking local choice while maintaining a reason that it preserves global optimality.

### Common syntax
```text
sort
initialize answer/state
scan from left to right
make the best safe local choice
update state
```

### Java example pattern
```java
Arrays.sort(a);
int answer = 0;

for (int value : a) {
    if (/* choice is safe */) {
        answer++;
    }
}
```

### Python
```python
a.sort()
answer = 0

for value in a:
    if condition:
        answer += 1
```

Always ask: **Why is this local choice safe?**

---

# 18. Backtracking

## What is it?

Build a partial answer, explore it, then undo the choice.

Core pattern:

`choose → explore → undo`

### Java
```java
void backtrack(List<Integer> path) {
    if (/* complete */) {
        answer.add(new ArrayList<>(path));
        return;
    }

    for (int choice : choices) {
        if (/* invalid */) continue;

        path.add(choice);          // choose
        backtrack(path);           // explore
        path.remove(path.size()-1); // undo
    }
}
```

### Python
```python
def backtrack(path):
    if complete(path):
        answer.append(path.copy())
        return

    for choice in choices:
        if invalid(choice):
            continue

        path.append(choice)
        backtrack(path)
        path.pop()
```

---

# 19. 1D Dynamic Programming

## What is it?

Store answers to smaller states so they do not need to be recomputed.

Typical process:
1. Define state.
2. Define base case.
3. Write transition.
4. Decide iteration order.

### Java
```java
int[] dp = new int[n + 1];
dp[0] = 0;

for (int i = 1; i <= n; i++) {
    dp[i] = /* use previous states */;
}
```

### Python
```python
dp = [0] * (n + 1)
dp[0] = 0

for i in range(1, n + 1):
    dp[i] = ...
```

---

# 20. Grid / 2D DP

## What is it?

Each cell depends on previous cells or neighboring states.

### Java
```java
int[][] dp = new int[rows][cols];

dp[0][0] = grid[0][0];

for (int r = 0; r < rows; r++) {
    for (int c = 0; c < cols; c++) {
        // update dp[r][c]
    }
}
```

### Python
```python
dp = [[0] * cols for _ in range(rows)]
dp[0][0] = grid[0][0]
```

---

# 21. Knapsack / Subset DP

## 0/1 idea

Each item is usually taken once or skipped.

### Java descending loop for 1D 0/1 DP
```java
for (int weight : weights) {
    for (int capacity = W; capacity >= weight; capacity--) {
        dp[capacity] = Math.max(
            dp[capacity],
            dp[capacity - weight] + value
        );
    }
}
```

### Python
```python
for weight, value in items:
    for capacity in range(W, weight - 1, -1):
        dp[capacity] = max(
            dp[capacity],
            dp[capacity - weight] + value
        )
```

The descending loop prevents using the same 0/1 item multiple times.

---

# 22. Subsequence DP

## What is it?

A subsequence does **not** need to be contiguous.

Common examples:
- LIS
- LCS
- Longest Palindromic Subsequence
- Edit Distance

Typical state:
`dp[i]` = best answer ending at / using index `i`.

Or two-string DP:
`dp[i][j]` = answer using prefixes of lengths `i` and `j`.

---

# 23. Trie

## What is it?

A tree specialized for strings, where each edge represents a character.

Use it for:
- prefix search
- autocomplete
- dictionary lookup
- word search

### Java skeleton
```java
class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isWord;
}

class Trie {
    private final TrieNode root = new TrieNode();
}
```

### Python skeleton
```python
class TrieNode:
    def __init__(self):
        self.children = {}
        self.is_word = False
```

Insertion repeatedly moves through child nodes, creating missing nodes.

---

# 24. Bit Manipulation

## Common operators

```text
AND  &
OR   |
XOR  ^
NOT  ~
LEFT SHIFT  <<
RIGHT SHIFT >>
```

### Java
```java
int x = 5;
int bit = x & 1;       // last bit
int withoutLowBit = x & (x - 1);
```

### Python
```python
x = 5
bit = x & 1
without_low_bit = x & (x - 1)
```

Useful identities:

`x ^ x = 0`

`x ^ 0 = x`

`x & (x - 1)` removes the lowest set bit.

---

# 25. Math / Number Theory

## GCD

### Java
```java
static int gcd(int a, int b) {
    while (b != 0) {
        int temp = a % b;
        a = b;
        b = temp;
    }
    return a;
}
```

### Python
```python
from math import gcd
answer = gcd(a, b)
```

## LCM

```text
LCM(a,b) = abs(a / gcd(a,b) * b)
```

## Prime check

Test divisors up to `sqrt(n)`.

### Java
```java
boolean isPrime(int n) {
    if (n < 2) return false;

    for (int d = 2; d * d <= n; d++) {
        if (n % d == 0) return false;
    }

    return true;
}
```

### Python
```python
def is_prime(n):
    if n < 2:
        return False

    d = 2
    while d * d <= n:
        if n % d == 0:
            return False
        d += 1
    return True
```

## Sieve

Use a boolean array to mark multiples when many prime queries are needed.

---

# 26. Advanced Structures

This course will later include:

- Fenwick Tree / Binary Indexed Tree
- Segment Tree
- Dijkstra
- Bellman-Ford
- Floyd-Warshall
- Minimum Spanning Tree
- Kruskal
- Prim
- K-way merge
- Quickselect / Top-K
- Advanced Trie
- Bitmask DP

The important rule is: **do not learn an advanced structure before the simpler pattern that motivates it.**

---

# Java Collection Syntax Cheat Sheet

| Need | Java | Python |
|---|---|---|
| Dynamic array | `ArrayList<Integer>` | `list` |
| Unique values | `HashSet<Integer>` | `set` |
| Key/value | `HashMap<K,V>` | `dict` |
| Stack | `Deque<Integer>` | `list` |
| Queue | `Queue<Integer>` / `ArrayDeque` | `collections.deque` |
| Min heap | `PriorityQueue<Integer>` | `heapq` |
| Sorting | `Arrays.sort(a)` | `a.sort()` |
| Reverse sort | `Collections.reverseOrder()` | `sort(reverse=True)` |

---

# Sample Input / Output Convention

Every executable problem module in this repository should document at least:

```text
Sample Input:
...

Sample Output:
...
```

And at least these test categories:

1. Normal case
2. Smallest valid case
3. Edge case
4. Duplicate/negative values when relevant
5. Stress case when complexity matters

---

# Complexity Cheat Sheet

| Pattern | Typical time | Extra space |
|---|---:|---:|
| Hash map lookup | O(1) average | O(n) |
| Two pointers | O(n) after sorting if input already sorted | O(1) |
| Sliding window | O(n) | O(k) / O(n) |
| Prefix sum | O(n) preprocessing | O(n) |
| Binary search | O(log n) | O(1) |
| Stack | O(n) overall | O(n) |
| Monotonic stack | O(n) overall | O(n) |
| Linked list traversal | O(n) | O(1) |
| Tree DFS/BFS | O(n) | O(h) / O(n) |
| Graph DFS/BFS | O(V + E) | O(V) |
| DSU | Nearly O(1) amortized | O(V) |
| Heap operation | O(log n) | O(n) |
| Sorting | O(n log n) typical | depends |
| Backtracking | Often exponential | recursion/output dependent |
| 1D DP | Usually O(n) or O(nA) | O(n) / O(A) |
| 2D DP | Usually O(rows*cols) | O(rows*cols) |
| Trie | O(length of word) per operation | O(total characters) |

---

# Golden Recognition Rules

```text
Need fast lookup/count?        -> Hashing
Sorted pair/range?             -> Two Pointers
Contiguous + changing window?  -> Sliding Window
Repeated range sums?           -> Prefix Sum
Sorted / monotonic answer?     -> Binary Search
Nested matching?               -> Stack
Next greater/smaller?          -> Monotonic Stack
Cycle / middle in linked list? -> Fast + Slow pointers
Hierarchy?                     -> Tree DFS/BFS
Connectivity?                  -> Graph DFS/BFS / DSU
Spread from many sources?      -> Multi-source BFS
Dependencies/prerequisites?    -> Topological Sort
Repeated min/max choice?       -> Heap
Intervals/meetings?            -> Sort + Interval scan
Local optimal decisions?       -> Greedy
Generate all possibilities?    -> Backtracking
Repeated subproblems?          -> DP
Prefix word queries?            -> Trie
XOR/bit state?                  -> Bit Manipulation
```
