# Two Sum — Pattern Foundation

- Source: LeetCode
- Problem: Two Sum
- Difficulty: Easy
- Primary pattern: Hash Map / Complement Lookup
- Role: Foundation

## What are we learning?

Given an array and a target, find two different positions whose values add to the target.

The important lesson is not memorizing this problem. It is recognizing the pattern:

> **For each value, ask whether the value needed to complete the target has already been seen.**

## Recognition clues

- Need to find a pair.
- Need fast lookup.
- The complement is `target - currentValue`.
- The array does not need to be sorted.

## Brute force

Check every pair. This takes O(n²) time.

## Optimized idea

Store each number's index in a HashMap while scanning once.
For `x`, calculate `target - x` and check whether that complement already exists.

## Algorithm

1. Create an empty map from value → index.
2. Scan the array from left to right.
3. Calculate `complement = target - nums[i]`.
4. If the complement exists, return its stored index and `i`.
5. Otherwise store `nums[i] → i`.

## Complexity

Time: O(n) average
Space: O(n)

## Important mistake

Check the complement **before** inserting the current value. This prevents accidentally using the same element twice.

## Pattern takeaway

Whenever a problem asks for a pair and repeatedly asks "have I already seen the value I need?", think **HashMap / Set**.

See `java/Solution.java` and `python/solution.py`.
