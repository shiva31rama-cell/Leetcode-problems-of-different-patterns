class Solution:
    def shortest_paths(self, n, edges, source):
        inf = 10**30
        dist = [inf] * n
        dist[source] = 0
        for _ in range(n - 1):
            changed = False
            for u, v, w in edges:
                if dist[u] < inf and dist[v] > dist[u] + w:
                    dist[v] = dist[u] + w
                    changed = True
            if not changed:
                break
        for u, v, w in edges:
            if dist[u] < inf and dist[v] > dist[u] + w:
                raise ValueError('Reachable negative cycle')
        return dist
