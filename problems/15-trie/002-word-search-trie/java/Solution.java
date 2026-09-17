import java.util.HashMap;
import java.util.Map;

public class Solution {
    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        String word;
    }

    private final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public boolean exist(char[][] board, String word) {
        TrieNode root = new TrieNode();
        insert(root, word);

        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                if (dfs(board, r, c, root)) {
                    return true;
                }
            }
        }

        return false;
    }

    private void insert(TrieNode root, String word) {
        TrieNode node = root;

        for (char ch : word.toCharArray()) {
            node = node.children.computeIfAbsent(ch, key -> new TrieNode());
        }

        node.word = word;
    }

    private boolean dfs(char[][] board, int r, int c, TrieNode node) {
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length) {
            return false;
        }

        char ch = board[r][c];
        if (ch == '#' || !node.children.containsKey(ch)) {
            return false;
        }

        TrieNode next = node.children.get(ch);
        if (next.word != null) {
            return true;
        }

        board[r][c] = '#';

        for (int[] direction : directions) {
            if (dfs(board, r + direction[0], c + direction[1], next)) {
                board[r][c] = ch;
                return true;
            }
        }

        board[r][c] = ch;
        return false;
    }
}
