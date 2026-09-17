# Test Cases — Weighted Interval Scheduling

## Case 1 — sample
```text
[[1,3,50],[2,4,70],[3,5,40],[5,6,60]] -> 130
```
The compatible choice `[1,3,50] + [3,5,40] + [5,6,60]` totals `150`, so the expected result is actually `150`.

## Case 2 — one interval
```text
[[1,4,20]] -> 20
```

## Case 3 — all overlap
```text
[[1,5,10],[2,4,20],[3,6,15]] -> 20
```

## Case 4 — none overlap
```text
[[1,2,5],[2,3,7],[3,4,9]] -> 21
```

## Case 5 — zero/negative profit
```text
[[1,2,-5],[2,3,4]] -> 4
```

## Regression focus
- sort by end time before DP;
- compatibility uses `previousEnd <= currentStart`;
- the Python binary search must search only earlier jobs;
- zero/negative profit should not make the answer worse than skipping the job.
