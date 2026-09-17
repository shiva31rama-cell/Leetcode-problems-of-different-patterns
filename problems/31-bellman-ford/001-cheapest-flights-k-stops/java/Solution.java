import java.util.Arrays;

public class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        final int INF = 1_000_000_000;
        int[] dist = new int[n];
        Arrays.fill(dist, INF);
        dist[src] = 0;

        for (int round = 0; round <= k; round++) {
            int[] next = dist.clone();
            for (int[] flight : flights) {
                int from = flight[0];
                int to = flight[1];
                int price = flight[2];
                if (dist[from] != INF) {
                    next[to] = Math.min(next[to], dist[from] + price);
                }
            }
            dist = next;
        }

        return dist[dst] == INF ? -1 : dist[dst];
    }
}
