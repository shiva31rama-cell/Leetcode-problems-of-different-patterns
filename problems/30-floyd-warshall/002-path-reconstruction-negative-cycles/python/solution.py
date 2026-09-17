class FloydWarshall:
    INF = 10**30

    def build(self, n, edges):
        self.dist = [[self.INF] * n for _ in range(n)]
        self.next = [[None] * n for _ in range(n)]
        for i in range(n):
            self.dist[i][i] = 0
            self.next[i][i] = i
        for u, v, w in edges:
            if w < self.dist[u][v]:
                self.dist[u][v] = w
                self.next[u][v] = v
        for k in range(n):
            for i in range(n):
                for j in range(n):
                    if self.dist[i][k] < self.INF and self.dist[k][j] < self.INF:
                        cand = self.dist[i][k] + self.dist[k][j]
                        if cand < self.dist[i][j]:
                            self.dist[i][j] = cand
                            self.next[i][j] = self.next[i][k]

    def has_negative_cycle(self):
        return any(self.dist[i][i] < 0 for i in range(len(self.dist)))

    def path(self, u, v):
        if self.next[u][v] is None:
            return []
        result = [u]
        while u != v:
            u = self.next[u][v]
            result.append(u)
            if len(result) > len(self.dist) + 1:
                return []
        return result
