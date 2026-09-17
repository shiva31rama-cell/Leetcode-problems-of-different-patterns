import java.util.*;
public class Solution {
    static final long INF = Long.MAX_VALUE / 4;
    public long[] shortestPaths(int n, int[][] edges, int source) {
        long[] d = new long[n]; Arrays.fill(d, INF); d[source] = 0;
        for (int i=1;i<n;i++) { boolean changed=false; for (int[] e:edges) if (d[e[0]]<INF && d[e[1]]>d[e[0]]+e[2]) { d[e[1]]=d[e[0]]+e[2]; changed=true; } if (!changed) break; }
        for (int[] e:edges) if (d[e[0]]<INF && d[e[1]]>d[e[0]]+e[2]) throw new IllegalArgumentException("Reachable negative cycle");
        return d;
    }
}