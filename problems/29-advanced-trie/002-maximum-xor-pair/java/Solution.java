public class Solution {
    private static class Node {
        Node[] child = new Node[2];
    }

    private final Node root = new Node();

    private void insert(int value) {
        Node current = root;

        for (int bit = 30; bit >= 0; bit--) {
            int currentBit = (value >> bit) & 1;
            if (current.child[currentBit] == null) {
                current.child[currentBit] = new Node();
            }
            current = current.child[currentBit];
        }
    }

    private int bestXor(int value) {
        Node current = root;
        int result = 0;

        for (int bit = 30; bit >= 0; bit--) {
            int currentBit = (value >> bit) & 1;
            int wantedBit = currentBit ^ 1;

            if (current.child[wantedBit] != null) {
                result |= (1 << bit);
                current = current.child[wantedBit];
            } else {
                current = current.child[currentBit];
            }
        }

        return result;
    }

    public int findMaximumXOR(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int answer = 0;
        insert(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            answer = Math.max(answer, bestXor(nums[i]));
            insert(nums[i]);
        }

        return answer;
    }
}
