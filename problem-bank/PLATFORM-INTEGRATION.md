# Cross-Platform Integration Layer

This repository is the source of truth for learning, code, tests, and visual explanations. External platforms are treated as **practice, assessment, interview, contest, or test-management surfaces** rather than as copies of one another.

## Supported platform roles

| Platform | Repository integration | Primary use | Recommended package style |
|---|---|---|---|
| LeetCode | Problem mapping + `class Solution` implementations | Interview-style problem practice | Method-only Java/Python solution |
| HackerRank | Topic/problem mapping + stdin/stdout adaptation notes | Algorithms and timed practice | Function or stdin/stdout wrapper |
| CodeChef | Topic mapping + stdin/stdout adaptation notes | Competitive programming | `main` + fast input/output |
| MentorPick / Being Zero | Syntax-first curriculum mapping | Guided DSA learning | Java/Python lesson + exercise |
| HackerEarth | Problem mapping + assessment adaptation notes | Coding challenges and assessments | Stdin/stdout + hidden-test friendly code |
| CodeSignal | Assessment/interview adaptation notes | Coding assessments and IDE practice | Function signature + local tests |
| CoderPad | Interview adaptation notes | Live collaborative coding | Runnable file + explanation prompts |
| Codility | Assessment adaptation notes | Technical screening and task tests | Function signature + deterministic tests |
| Kiwi TCMS | Test-case catalog and test-plan references | Test management | Structured test cases, expected results, run evidence |
| OpenRank Alpha | Self-hosted coding-challenge adaptation notes | Contests and code evaluation | Problem statement + sample/custom tests |
| Exercism | Language-fluency adaptation notes | Practice, tests, mentoring | Idiomatic Java/Python exercise + tests |
| AlphaExercism | **Name not independently verified as a current official platform** | Keep as a user-supplied label until an authoritative URL is provided | Do not invent a platform-specific API or problem catalog |

## Important boundary

The repository **does not claim direct API integration** with third-party platforms unless credentials/API contracts are actually configured. The integration here means:

1. map problems and skills;
2. keep Java and Python source in reusable form;
3. keep deterministic tests and expected outputs;
4. document how to adapt a solution to the platform's normal submission style;
5. keep Visualize Mode independent of external platform tooling.

This prevents platform-specific assumptions from breaking the core course.

## Common adaptation contract

Every advanced problem should be convertible between these layers:

```text
README explanation
      ↓
Java Solution.java
      ↓
Python solution.py
      ↓
Deterministic test_cases.md
      ↓
Platform adapter
      ↓
External judge / IDE / interview / test plan
```

### Online judge style

Use the repository `Solution.java` / `solution.py` as the clean algorithm source. For stdin/stdout platforms, add a thin input/output wrapper instead of rewriting the algorithm.

### Interview style

For CoderPad or similar environments, keep the algorithm in a small method, narrate the invariant, and use the repository test cases as the live test plan.

### Assessment style

For CodeSignal, HackerEarth, and Codility, preserve the core method and convert the repository tests into deterministic visible/hidden test groups. Do not depend on platform-specific UI behavior.

### Test-management style

For Kiwi TCMS, each `tests/test_cases.md` file is the human-readable source. A future test-management export can use the same case IDs, inputs, expected outputs, edge-case tags, and regression tags.

## Platform skill matrix for the new advanced variations

| Problem | LeetCode | HackerRank | CodeChef | MentorPick | HackerEarth | CodeSignal | CoderPad | Codility | Kiwi TCMS | OpenRank | Exercism |
|---|---|---|---|---|---|---|---|---|---|---|---|
| Lazy Segment Tree | Pattern | Advanced DS | Advanced DS | Segment tree lesson | Coding challenge | Function assessment | Live interview | Function task | Range-query test plan | Contest problem | Algorithm exercise |
| Inversion Count + Compression | Pattern | Search/sort | BIT/sort | Fenwick + maps | DSA task | Function assessment | Live interview | Function task | Counting test plan | Contest problem | Algorithm exercise |
| Maximum XOR Trie | Pattern | Bit manipulation | Trie/bit | Trie + bit lesson | DSA task | Function assessment | Live interview | Function task | Bitwise test plan | Contest problem | Algorithm exercise |
| SCC | Graph pattern | Graph theory | Advanced graph | Graph lesson | DSA task | Function assessment | Graph interview | Function task | Connectivity test plan | Contest problem | Algorithm exercise |
| 0-1 BFS | Advanced graph | Graph theory | Shortest path | Graph lesson | DSA task | Function assessment | Graph interview | Function task | Path test plan | Contest problem | Algorithm exercise |
| LCS | DP pattern | Dynamic programming | DP | String DP lesson | DP task | Function assessment | DP interview | Function task | Sequence test plan | Contest problem | String/DP exercise |
| TSP Bitmask DP | Advanced DP | Advanced algorithms | DP/graphs | Bitmask DP lesson | Advanced DSA task | Function assessment | Algorithm interview | Function task | Optimization test plan | Contest problem | Algorithm exercise |
| Weighted Interval Scheduling | Greedy + DP | Dynamic programming | DP/greedy | Interval DP lesson | Optimization task | Function assessment | Algorithm interview | Function task | Scheduling test plan | Contest problem | Algorithm exercise |

## Submission preparation checklist

Before copying any solution to another platform:

- remove repository-only comments that refer to file paths;
- keep the algorithm unchanged;
- match the platform's expected function/class name;
- use the platform's required input/output contract;
- run the repository test cases locally;
- check integer width (`int` vs `long`) for large constraints;
- verify empty input and boundary cases;
- preserve the invariant used in the README;
- never copy hidden tests or platform-private content.

## Source references

- LeetCode: https://leetcode.com/problemset/
- HackerRank Algorithms: https://www.hackerrank.com/domains/algorithms
- CodeChef Practice: https://www.codechef.com/practice
- CoderPad: https://coderpad.io/platform/
- HackerEarth: https://www.hackerearth.com/challenges/
- CodeSignal: https://support.codesignal.com/
- Codility: https://www.codility.com/platform/
- Kiwi TCMS: https://kiwitcms.readthedocs.io/en/latest/about.html
- OpenRank Alpha (open-source coding-challenge project): https://github.com/onkea/OpenRank
- Exercism: https://exercism.org/
- MentorPick: https://mentorpick.com/problemset

Platform catalogs and product features change over time. Re-verify external mappings before publishing a platform-specific contest or assessment.
