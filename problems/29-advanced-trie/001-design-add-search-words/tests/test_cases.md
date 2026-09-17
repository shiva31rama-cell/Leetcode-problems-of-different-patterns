# Advanced Trie Tests

| # | Operations | Expected |
|---|---|---|
| 1 | add `bad,dad,mad`; search `pad` | `false` |
| 2 | same words; search `bad` | `true` |
| 3 | same words; search `.ad` | `true` |
| 4 | same words; search `b..` | `true` |
| 5 | add `a`; search `.` | `true` |
| 6 | add `a`; search `..` | `false` |

Check both exact traversal and wildcard branching.
