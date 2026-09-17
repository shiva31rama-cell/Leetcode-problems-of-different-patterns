import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int value : nums) {
            frequency.put(value, frequency.getOrDefault(value, 0) + 1);
        }

        // Min-heap ordered by frequency.
        PriorityQueue<Integer> heap = new PriorityQueue<>(
                (a, b) -> Integer.compare(frequency.get(a), frequency.get(b))
        );

        for (int value : frequency.keySet()) {
            heap.offer(value);

            if (heap.size() > k) {
                heap.poll();
            }
        }

        int[] answer = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            answer[i] = heap.poll();
        }

        return answer;
    }
}
