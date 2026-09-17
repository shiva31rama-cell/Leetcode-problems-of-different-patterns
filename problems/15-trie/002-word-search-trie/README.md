# Trie + Word Search

**Pattern:** Trie + DFS / Backtracking

## Simple idea
Store words in a Trie so that DFS can quickly tell whether the current character path can still form a word.

## Recognition
- Many words share prefixes.
- You repeatedly ask whether a character sequence is a prefix of a known word.
- A grid traversal must generate candidate words.

## Brute force
Build strings during DFS and search the word list repeatedly.

## Optimized idea
Build the Trie once. During DFS, stop immediately when the current path is not a Trie prefix.

## Complexity
The exact complexity depends on the grid, word count, and word lengths; the Trie mainly reduces repeated prefix checking.

## Pattern lesson
Patterns can combine. Here, **Trie handles prefix state** while **DFS/backtracking explores paths**.
