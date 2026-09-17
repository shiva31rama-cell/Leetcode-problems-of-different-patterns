public class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                provinces++;
                dfs(i, isConnected, visited);
            }
        }

        return provinces;
    }

    private void dfs(int node, int[][] graph, boolean[] visited) {
        visited[node] = true;

        for (int next = 0; next < graph.length; next++) {
            if (graph[node][next] == 1 && !visited[next]) {
                dfs(next, graph, visited);
            }
        }
    }
}
