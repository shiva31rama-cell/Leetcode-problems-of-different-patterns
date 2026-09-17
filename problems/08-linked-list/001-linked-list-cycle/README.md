# Linked List Cycle — Fast & Slow Pointer Pattern

## Goal
Determine whether a linked list contains a cycle.

## Pattern recognition
When a linked-list problem asks about a cycle, meeting point, or middle position, consider two pointers moving at different speeds.

## Simple idea
`slow` moves one node and `fast` moves two. If there is a cycle, the faster pointer eventually catches the slower pointer.

## Brute force
Store every visited node in a set. This is correct but uses O(n) extra memory.

## Optimized
Use two pointers and no visited set: O(n) time, O(1) extra space.

## Common mistakes
- Comparing node values instead of node references.
- Accessing `fast.next.next` without first checking `fast` and `fast.next`.
