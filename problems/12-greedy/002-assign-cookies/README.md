# Assign Cookies

**Pattern:** Greedy + Sorting + Two Pointers

## Simple idea
Give the smallest cookie that can satisfy the current least-demanding child. This saves larger cookies for children who need them.

## Recognition
- You repeatedly make a local choice.
- A sorted order makes the local choice safe.
- The goal is to maximize the number of satisfied choices.

## Brute-force thinking
Try many cookie-child assignments, which creates unnecessary combinations.

## Optimized idea
Sort both arrays and use two pointers. If a cookie satisfies the current child, use it; otherwise try a larger cookie.

## Complexity
- Time: `O(n log n + m log m)` because of sorting.
- Extra space: depends on sorting implementation.

## Pattern lesson
Greedy becomes easier to prove when the local choice preserves the resources needed by future choices.
