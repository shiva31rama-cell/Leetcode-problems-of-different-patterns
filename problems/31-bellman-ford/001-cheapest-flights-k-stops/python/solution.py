def find_cheapest_price(n: int, flights: list[list[int]], src: int, dst: int, k: int) -> int:
    inf = 10**9
    dist = [inf] * n
    dist[src] = 0

    for _ in range(k + 1):
        next_dist = dist[:]
        for source, target, price in flights:
            if dist[source] != inf:
                next_dist[target] = min(next_dist[target], dist[source] + price)
        dist = next_dist

    return -1 if dist[dst] == inf else dist[dst]
