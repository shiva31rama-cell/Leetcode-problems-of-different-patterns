# Longest Common Subsequence (LCS)

**Pattern:** String DP / Subsequence DP
**Level:** Medium/Advanced
**Source:** LeetCode 1143

## What is the topic?
A subsequence keeps order but may skip characters.

For strings `text1` and `text2`, LCS asks for the maximum number of characters that appear in both strings in the same relative order.

## Recognition
Think LCS when:
- two strings/sequences must be compared;
- order matters but characters/elements may be skipped;
- the state can be described by prefixes of both inputs.

## State
`dp[i][j]` = LCS length of the first `i` characters of `text1` and the first `j` characters of `text2`.

Transition:
- same last character → `dp[i][j] = dp[i-1][j-1] + 1`;
- otherwise → `max(dp[i-1][j], dp[i][j-1])`.

## Syntax template
### Java
```java
int longestCommonSubsequence(String text1, String text2) { }
```
### Python
```python
def longest_common_subsequence(text1: str, text2: str) -> int:
    pass
```

## Brute force vs optimized
Brute force explores subsequences and is exponential.

Dynamic programming stores each prefix pair once: `O(mn)`.

## Complexity
- Time: `O(mn)`
- Space: `O(mn)` for the full table

The space can be reduced to `O(min(m,n))` when only the length is needed.

## 👁️ Visualize Mode
```mermaid
flowchart TD
    A[Compare text1[i-1] and text2[j-1]] --> B{Same?}
    B -->|Yes| C[dp[i][j] = dp[i-1][j-1] + 1]
    B -->|No| D[Take max of top and left]
    C --> E[Next cell]
    D --> E
```

Example:
```text
text1 = "abcde"
text2 = "ace"
```
The DP table gradually grows from smaller prefix pairs. The final value is `3`, representing the subsequence `ace`.

## Sample
Input:
```text
"abcde", "ace"
```
Output:
```text
3
```

## Edge cases
- one string is empty;
- strings are identical;
- no common characters;
- repeated characters;
- one string is much longer than the other.

## Platform transfer
This method maps directly to function-based interview/assessment platforms. For stdin/stdout platforms, parse two strings and print the returned length.

## Files
- Java: `java/Solution.java`
- Python: `python/solution.py`
- Tests: `tests/test_cases.md`
