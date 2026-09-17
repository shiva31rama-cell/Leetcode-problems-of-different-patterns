import java.util.PriorityQueue;

public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int value : nums) {
            minHeap.offer(value);

            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest of the current top k.
            }
        }

        return minHeap.peek();
    }
}
