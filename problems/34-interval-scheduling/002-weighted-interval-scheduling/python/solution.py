from bisect import bisect_right


def max_weight(intervals: list[list[int]]) -> int:
    if not intervals:
        return 0

    jobs = sorted(intervals, key=lambda item: item[1])
    ends = [job[1] for job in jobs]
    dp = [0] * (len(jobs) + 1)

    for i, (start, _end, profit) in enumerate(jobs, start=1):
        # Number of earlier jobs ending at or before this start time.
        previous_count = bisect_right(ends, start, 0, i - 1)
        take = profit + dp[previous_count]
        skip = dp[i - 1]
        dp[i] = max(skip, take)

    return dp[-1]
