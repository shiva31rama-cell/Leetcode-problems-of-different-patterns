import java.util.*;

public class Solution {
    static final long INF = Long.MAX_VALUE / 4;
    private long[][] dist;
    private int[][] next;

    public void build(int n, int[][] edges) {
        dist = new long[n][n]; next = new int[n][n];
        for (int i=0;i<n;i++) Arrays.fill(dist[i], INF);
        for (int i=0;i<n;i++) { dist[i][i]=0; next[i][i]=i; }
        for (int[] e: edges) if (e[2] < dist[e[0]][e[1]]) { dist[e[0]][e[1]]=e[2]; next[e[0]][e[1]]=e[1]; }
        for (int k=0;k<n;k++) for (int i=0;i<n;i++) for (int j=0;j<n;j++)
            if (dist[i][k] < INF && dist[k][j] < INF && dist[i][j] > dist[i][k]+dist[k][j]) {
                dist[i][j]=dist[i][k]+dist[k][j]; next[i][j]=next[i][k];
            }
    }

    public boolean hasNegativeCycle() {
        for (int i=0;i<dist.length;i++) if (dist[i][i] < 0) return true;
        return false;
    }

    public List<Integer> path(int from, int to) {
        if (next[from][to] == 0 && from != to) return Collections.emptyList();
        List<Integer> result = new ArrayList<>();
        result.add(from);
        while (from != to) { from = next[from][to]; result.add(from); if (result.size() > dist.length + 1) return Collections.emptyList(); }
        return result;
    }
}