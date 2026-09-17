def tsp(cost: list[list[int]]) -> int:
    n = len(cost)
    if n <= 1:
        return 0

    total_masks = 1 << n
    inf = 10**30
    dp = [[inf] * n for _ in range(total_masks)]
    dp[1][0] = 0

    for mask in range(1, total_masks):
        for last in range(n):
            if not (mask & (1 << last)) or dp[mask][last] == inf:
                continue

            for nxt in range(n):
                if mask & (1 << nxt):
                    continue

                next_mask = mask | (1 << nxt)
                candidate = dp[mask][last] + cost[last][nxt]
                dp[next_mask][nxt] = min(dp[next_mask][nxt], candidate)

    full_mask = total_masks - 1
    return min(dp[full_mask][last] + cost[last][0] for last in range(1, n))
