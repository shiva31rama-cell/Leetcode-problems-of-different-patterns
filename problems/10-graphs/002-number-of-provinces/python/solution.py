class Solution:
    def findCircleNum(self, isConnected: list[list[int]]) -> int:
        n = len(isConnected)
        visited = [False] * n
        provinces = 0

        def dfs(node: int) -> None:
            visited[node] = True

            for nxt in range(n):
                if isConnected[node][nxt] == 1 and not visited[nxt]:
                    dfs(nxt)

        for i in range(n):
            if not visited[i]:
                provinces += 1
                dfs(i)

        return provinces
