# Reverse Linked List

**Pattern:** Linked List Pointer Manipulation

## Simple idea
Walk through the list and reverse one `next` link at a time.

## Recognition
The problem asks you to reverse, reconnect, or rearrange links in a singly linked list.

## Brute-force alternative
Copy values into another structure and rebuild the list. This uses extra memory and misses the pointer-learning goal.

## Optimized idea
Use three references: `previous`, `current`, and `next`. Save `current.next`, reverse the link, then move forward.

## Complexity
- Time: `O(n)`
- Extra space: `O(1)`

## Pattern lesson
Never change a linked-list pointer before saving the next node.
