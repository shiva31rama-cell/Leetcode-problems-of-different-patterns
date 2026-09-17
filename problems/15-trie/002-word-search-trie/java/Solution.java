import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        String word;
    }

    private final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public List<String> findWords(char[][] board, String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            insert(root, word);
        }

        List<String> answer = new ArrayList<>();

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                dfs(board, r, c, root, answer);
            }
        }

        return answer;
    }

    private void insert(TrieNode root, String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            node = node.children.computeIfAbsent(ch, key -> new TrieNode());
        }

        node.word = word;
    }

    private void dfs(char[][] board, int r, int c, TrieNode node, List<String> answer) {
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length) {
            return;
        }

        char ch = board[r][c];
        if (ch == '#' || !node.children.containsKey(ch)) {
            return;
        }

        TrieNode next = node.children.get(ch);

        if (next.word != null) {
            answer.add(next.word);
            next.word = null; // prevent duplicate output
        }

        board[r][c] = '#';

        for (int[] direction : directions) {
            dfs(board, r + direction[0], c + direction[1], next, answer);
        }

        board[r][c] = ch;
    }
}
