# Subsets — Backtracking Pattern

## Goal
Generate every subset of an array of distinct values.

## Pattern recognition
Use backtracking when a problem asks for **all possible choices**, combinations, arrangements, or paths under constraints.

## Simple idea
At each index we have two choices: include the value or skip it. Add the current subset to the answer, then explore both choices.

## Example
`[1,2,3]` has `2³ = 8` subsets.

## Brute force
Generate all binary choice strings of length n. Backtracking is a clean way to generate them recursively.

## Complexity
There are 2^n subsets and each may take O(n) to copy, so O(n·2^n) output work.

## Common mistakes
- Forgetting to remove the last choice before returning from recursion.
- Adding the same mutable list reference instead of a copy.
