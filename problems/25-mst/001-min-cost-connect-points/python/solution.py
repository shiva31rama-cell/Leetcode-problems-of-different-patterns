class Solution:
    def minCostConnectPoints(self, points: list[list[int]]) -> int:
        n = len(points)
        min_distance = [float("inf")] * n
        used = [False] * n
        min_distance[0] = 0
        total = 0

        for _ in range(n):
            current = -1
            for i in range(n):
                if not used[i] and (current == -1 or min_distance[i] < min_distance[current]):
                    current = i

            used[current] = True
            total += min_distance[current]

            for next_node in range(n):
                if not used[next_node]:
                    distance = abs(points[current][0] - points[next_node][0]) + abs(
                        points[current][1] - points[next_node][1]
                    )
                    min_distance[next_node] = min(min_distance[next_node], distance)

        return total
