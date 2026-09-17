def critical_connections(n: int, connections: list[list[int]]) -> list[list[int]]:
    graph = [[] for _ in range(n)]
    for u, v in connections:
        graph[u].append(v)
        graph[v].append(u)

    discovery = [-1] * n
    low = [-1] * n
    bridges = []
    time = 0

    def dfs(u: int, parent: int) -> None:
        nonlocal time
        discovery[u] = low[u] = time
        time += 1

        for v in graph[u]:
            if v == parent:
                continue
            if discovery[v] == -1:
                dfs(v, u)
                low[u] = min(low[u], low[v])
                if low[v] > discovery[u]:
                    bridges.append([u, v])
            else:
                low[u] = min(low[u], discovery[v])

    for node in range(n):
        if discovery[node] == -1:
            dfs(node, -1)

    return bridges
