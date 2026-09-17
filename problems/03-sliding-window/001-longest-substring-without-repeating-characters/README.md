# Longest Substring Without Repeating Characters

## Pattern
**Sliding Window + Hash Set**

## Recognition clues
Think sliding window when the problem asks for:
- a contiguous substring or subarray
- the longest/shortest valid segment
- a condition that must remain true inside the current segment

Here the window must contain no duplicate characters.

## Core idea
Maintain a window `[left, right]` containing unique characters.

When `s[right]` is already inside the window, move `left` forward until the duplicate is removed. Every valid window ending at `right` is then considered.

## Brute force
Generate every substring and check whether it has duplicate characters. This is much slower because the same characters are checked repeatedly.

## Optimized algorithm
1. Keep a set of characters in the current window.
2. Expand the window with `right`.
3. If the new character already exists, remove characters from the left until it is unique.
4. Update the maximum window length.

## Complexity
- Time: `O(n)` — each character enters and leaves the set at most once.
- Extra space: `O(min(n, alphabet size))`.

## Dry run
For `abcabcbb`:

`abc` is valid → length `3`.

Next `a` repeats → remove from the left until the window is `bca`.

The maximum remains `3`.

## Common mistakes
- Resetting the whole window whenever a duplicate appears.
- Forgetting to move `left`.
- Measuring the window before restoring validity.

## Pattern takeaway
**Contiguous segment + longest/shortest valid window → try sliding window.**
