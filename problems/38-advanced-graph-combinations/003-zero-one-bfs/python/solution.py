from collections import deque


def shortest_path(n: int, edges: list[list[int]], source: int) -> list[int]:
    graph = [[] for _ in range(n)]
    for start, end, weight in edges:
        graph[start].append((end, weight))

    distance = [10**18] * n
    distance[source] = 0
    queue = deque([source])

    while queue:
        node = queue.popleft()

        for next_node, weight in graph[node]:
            new_distance = distance[node] + weight
            if new_distance < distance[next_node]:
                distance[next_node] = new_distance
                if weight == 0:
                    queue.appendleft(next_node)
                else:
                    queue.append(next_node)

    return [-1 if value == 10**18 else value for value in distance]
