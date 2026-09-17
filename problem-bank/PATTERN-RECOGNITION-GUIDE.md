# Pattern Recognition Guide

The first question is not "What code do I write?". Ask "What structure does this problem have?"

## Quick Decision Tree

### 1. Need fast lookup, duplicate detection, counting, or complement lookup?
→ Try **Hashing / Frequency Map**.

### 2. Is the input sorted, or can sorting expose pair/range structure?
→ Consider **Two Pointers** or **Binary Search**.

### 3. Is the question about a contiguous subarray or substring?
→ Consider **Sliding Window** or **Prefix Sum**.

### 4. Are repeated range sums involved?
→ Consider **Prefix Sum**.

### 5. Is the search space sorted or monotonic?
→ Consider **Binary Search**.

### 6. Is there nesting or a next/previous greater/smaller relationship?
→ Consider **Stack / Monotonic Stack**.

### 7. Does a linked list ask about a cycle, middle, or relative positions?
→ Consider **Fast & Slow Pointers**.

### 8. Is the input hierarchical?
→ Consider **Tree DFS/BFS**.

### 9. Is the problem about connectivity or reachability?
→ Consider **Graph DFS/BFS**.

### 10. Are many sources spreading simultaneously by distance?
→ Consider **Multi-source BFS**.

### 11. Are groups repeatedly merged or queried for connectivity?
→ Consider **Union-Find**.

### 12. Are there prerequisites/dependencies?
→ Consider **Topological Sort**.

### 13. Does the problem repeatedly need the smallest/largest candidate?
→ Consider a **Heap / Priority Queue**.

### 14. Are ranges overlapping or being scheduled?
→ Consider **Intervals**.

### 15. Can a locally optimal choice be committed without breaking future optimality?
→ Investigate **Greedy**, but identify the invariant/proof before coding.

### 16. Are there choices, constraints, and a need to explore alternatives?
→ Consider **Backtracking**.

### 17. Does the optimal answer depend on previously solved states?
→ Consider **Dynamic Programming**.

### 18. Are queries based on prefixes of words?
→ Consider a **Trie**.

### 19. Does XOR or compact state representation simplify the problem?
→ Consider **Bit Manipulation**.

## Important

These are recognition clues, not automatic answers. A problem can satisfy multiple clues. Choose the pattern whose invariant/state most directly represents the required answer, then record other techniques as combinations.
