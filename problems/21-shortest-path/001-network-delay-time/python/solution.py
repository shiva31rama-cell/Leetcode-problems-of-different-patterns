import heapq


class Solution:
    def networkDelayTime(self, times: list[list[int]], n: int, k: int) -> int:
        graph = [[] for _ in range(n + 1)]
        for source, target, weight in times:
            graph[source].append((target, weight))

        distance = [float("inf")] * (n + 1)
        distance[k] = 0
        heap = [(0, k)]

        while heap:
            dist, node = heapq.heappop(heap)
            if dist != distance[node]:
                continue

            for next_node, weight in graph[node]:
                new_dist = dist + weight
                if new_dist < distance[next_node]:
                    distance[next_node] = new_dist
                    heapq.heappush(heap, (new_dist, next_node))

        answer = max(distance[1:])
        return -1 if answer == float("inf") else answer
