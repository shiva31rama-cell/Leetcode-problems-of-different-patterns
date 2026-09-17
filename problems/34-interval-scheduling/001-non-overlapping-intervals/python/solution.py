def erase_overlap_intervals(intervals: list[list[int]]) -> int:
    if len(intervals) <= 1:
        return 0

    intervals.sort(key=lambda x: x[1])
    kept = 1
    last_end = intervals[0][1]

    for start, end in intervals[1:]:
        if start >= last_end:
            kept += 1
            last_end = end

    return len(intervals) - kept
