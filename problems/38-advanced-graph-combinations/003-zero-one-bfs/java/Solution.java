import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    public int[] shortestPath(int n, int[][] edges, int source) {
        List<int[]>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            graph[edge[0]].add(new int[] {edge[1], edge[2]});
        }

        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(source);

        while (!deque.isEmpty()) {
            int node = deque.removeFirst();

            for (int[] edge : graph[node]) {
                int next = edge[0];
                int weight = edge[1];
                int newDistance = distance[node] + weight;

                if (newDistance < distance[next]) {
                    distance[next] = newDistance;
                    if (weight == 0) {
                        deque.addFirst(next);
                    } else {
                        deque.addLast(next);
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                distance[i] = -1;
            }
        }

        return distance;
    }
}
