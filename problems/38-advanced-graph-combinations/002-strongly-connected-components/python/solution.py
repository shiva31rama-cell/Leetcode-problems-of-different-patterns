def strongly_connected_components(n: int, edges: list[list[int]]) -> list[list[int]]:
    graph = [[] for _ in range(n)]
    for source, target in edges:
        graph[source].append(target)

    discovery = [0] * n
    low = [0] * n
    on_stack = [False] * n
    stack: list[int] = []
    components: list[list[int]] = []
    time = 0

    def dfs(node: int) -> None:
        nonlocal time
        time += 1
        discovery[node] = time
        low[node] = time
        stack.append(node)
        on_stack[node] = True

        for next_node in graph[node]:
            if discovery[next_node] == 0:
                dfs(next_node)
                low[node] = min(low[node], low[next_node])
            elif on_stack[next_node]:
                low[node] = min(low[node], discovery[next_node])

        if low[node] == discovery[node]:
            component = []
            while True:
                current = stack.pop()
                on_stack[current] = False
                component.append(current)
                if current == node:
                    break
            components.append(component)

    for node in range(n):
        if discovery[node] == 0:
            dfs(node)

    return components
