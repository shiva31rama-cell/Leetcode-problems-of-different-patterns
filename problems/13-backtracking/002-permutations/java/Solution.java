import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, new ArrayList<>(), answer);
        return answer;
    }

    private void backtrack(
            int[] nums,
            boolean[] used,
            List<Integer> path,
            List<List<Integer>> answer) {

        if (path.size() == nums.length) {
            answer.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            used[i] = true;          // choose
            path.add(nums[i]);

            backtrack(nums, used, path, answer); // explore

            path.remove(path.size() - 1); // undo
            used[i] = false;
        }
    }
}
