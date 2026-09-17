import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    private int time;
    private int[] discovery;
    private int[] low;
    private boolean[] onStack;
    private Deque<Integer> stack;
    private List<List<Integer>> components;

    public List<List<Integer>> stronglyConnectedComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
        }

        time = 0;
        discovery = new int[n];
        low = new int[n];
        onStack = new boolean[n];
        stack = new ArrayDeque<>();
        components = new ArrayList<>();

        for (int node = 0; node < n; node++) {
            if (discovery[node] == 0) {
                dfs(node, graph);
            }
        }

        return components;
    }

    private void dfs(int node, List<List<Integer>> graph) {
        discovery[node] = ++time;
        low[node] = discovery[node];
        stack.push(node);
        onStack[node] = true;

        for (int next : graph.get(node)) {
            if (discovery[next] == 0) {
                dfs(next, graph);
                low[node] = Math.min(low[node], low[next]);
            } else if (onStack[next]) {
                low[node] = Math.min(low[node], discovery[next]);
            }
        }

        if (low[node] == discovery[node]) {
            List<Integer> component = new ArrayList<>();
            while (true) {
                int current = stack.pop();
                onStack[current] = false;
                component.add(current);
                if (current == node) {
                    break;
                }
            }
            components.add(component);
        }
    }
}
