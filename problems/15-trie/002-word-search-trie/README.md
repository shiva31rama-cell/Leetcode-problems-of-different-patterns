# Trie + Word Search II

**Pattern:** Trie + DFS / Backtracking

## What is the topic?

A **Trie** stores words by shared prefixes. In a grid word-search problem, DFS explores possible paths while the Trie tells us whether the current path can still become a word.

This is a combination pattern:

```text
Trie = prefix checking
DFS = explore the grid
Backtracking = choose a cell, explore, then undo
```

## Recognition clues

Use this combination when:

- You have many words.
- Many words share prefixes.
- A board/grid must generate candidate words.
- You want to stop a path as soon as it cannot match any known word.

## Core syntax — Java

```java
class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    String word;
}

void insert(TrieNode root, String word) {
    TrieNode node = root;

    for (char ch : word.toCharArray()) {
        node = node.children.computeIfAbsent(ch, key -> new TrieNode());
    }

    node.word = word;
}
```

DFS state:

```java
if (next.word != null) {
    answer.add(next.word);
    next.word = null;
}

board[r][c] = '#';
// explore 4 directions
board[r][c] = originalChar;
```

## Core syntax — Python

```python
class TrieNode:
    def __init__(self):
        self.children = {}
        self.word = None
```

Insertion:

```python
node = root
for ch in word:
    node = node.children.setdefault(ch, TrieNode())
node.word = word
```

DFS uses the same choose → explore → undo structure.

## Sample input

```text
board = [
    ["o","a","a","n"],
    ["e","t","a","e"],
    ["i","h","k","r"],
    ["i","f","l","v"]
]
words = ["oath","pea","eat","rain"]
```

## Sample output

```text
["eat", "oath"]
```

Order may differ depending on traversal order; the important result is the set of found words.

## Test cases

### Test 1 — standard

```text
Input: board above, words = [oath, pea, eat, rain]
Expected: {oath, eat}
```

### Test 2 — no word

```text
board = [[a,b],[c,d]]
words = ["xyz"]
Expected: []
```

### Test 3 — duplicate word in input

The implementation should avoid returning the same discovered word more than once.

## Complexity

The exact runtime depends on the grid size, number of words, and word lengths. The Trie reduces repeated prefix work, while DFS explores valid character paths only.

## Pattern lesson

This module is important because real DSA questions often combine patterns. Do not memorize Trie, DFS, and Backtracking independently only; learn to recognize when they should work together.
