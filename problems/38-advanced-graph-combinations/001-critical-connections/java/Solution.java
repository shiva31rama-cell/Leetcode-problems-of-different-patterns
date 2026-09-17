import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private List<Integer>[] graph;
    private int[] disc;
    private int[] low;
    private int time;
    private List<List<Integer>> bridges;

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();
        for (List<Integer> edge : connections) {
            int u = edge.get(0), v = edge.get(1);
            graph[u].add(v);
            graph[v].add(u);
        }

        disc = new int[n];
        low = new int[n];
        bridges = new ArrayList<>();
        time = 1;

        for (int i = 0; i < n; i++) {
            if (disc[i] == 0) dfs(i, -1);
        }
        return bridges;
    }

    private void dfs(int u, int parent) {
        disc[u] = low[u] = time++;

        for (int v : graph[u]) {
            if (v == parent) continue;
            if (disc[v] == 0) {
                dfs(v, u);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] > disc[u]) bridges.add(Arrays.asList(u, v));
            } else {
                low[u] = Math.min(low[u], disc[v]);
            }
        }
    }
}
