import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : times) {
            graph.get(edge[0]).add(new int[] {edge[1], edge[2]});
        }

        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[k] = 0;

        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        heap.offer(new int[] {k, 0});

        while (!heap.isEmpty()) {
            int[] current = heap.poll();
            int node = current[0];
            int dist = current[1];

            if (dist != distance[node]) {
                continue;
            }

            for (int[] edge : graph.get(node)) {
                int next = edge[0];
                int newDist = dist + edge[1];

                if (newDist < distance[next]) {
                    distance[next] = newDist;
                    heap.offer(new int[] {next, newDist});
                }
            }
        }

        int answer = 0;
        for (int node = 1; node <= n; node++) {
            if (distance[node] == Integer.MAX_VALUE) {
                return -1;
            }
            answer = Math.max(answer, distance[node]);
        }
        return answer;
    }
}
