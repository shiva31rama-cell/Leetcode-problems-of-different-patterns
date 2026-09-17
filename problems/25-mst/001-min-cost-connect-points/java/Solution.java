import java.util.Arrays;

public class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int[] minDistance = new int[n];
        boolean[] used = new boolean[n];
        Arrays.fill(minDistance, Integer.MAX_VALUE);
        minDistance[0] = 0;

        int total = 0;
        for (int count = 0; count < n; count++) {
            int current = -1;
            for (int i = 0; i < n; i++) {
                if (!used[i] && (current == -1 || minDistance[i] < minDistance[current])) {
                    current = i;
                }
            }

            used[current] = true;
            total += minDistance[current];

            for (int next = 0; next < n; next++) {
                if (!used[next]) {
                    int distance = Math.abs(points[current][0] - points[next][0])
                            + Math.abs(points[current][1] - points[next][1]);
                    minDistance[next] = Math.min(minDistance[next], distance);
                }
            }
        }

        return total;
    }
}
