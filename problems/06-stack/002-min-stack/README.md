# Min Stack

**Pattern:** Stack + Auxiliary State

## Simple idea
A normal stack gives the latest item. We also keep the minimum value seen so far at each stack level.

## Recognition
- Operations happen at the top.
- You need `push`, `pop`, and minimum lookup.
- Minimum lookup should be constant time.

## Brute-force idea
Search the whole stack whenever the minimum is requested: `O(n)` per query.

## Optimized idea
Store the current minimum alongside each pushed value, or maintain a second stack of minimums.

## Complexity
- `push`: `O(1)`
- `pop`: `O(1)`
- `getMin`: `O(1)`

## Pattern lesson
An auxiliary data structure can store exactly the information needed to make an expensive query constant time.
