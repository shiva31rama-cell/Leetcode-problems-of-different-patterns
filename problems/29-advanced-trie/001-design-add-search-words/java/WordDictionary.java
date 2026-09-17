public class WordDictionary {
    private static class Node {
        Node[] next = new Node[26];
        boolean word;
    }

    private final Node root = new Node();

    public void addWord(String word) {
        Node current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.next[index] == null) current.next[index] = new Node();
            current = current.next[index];
        }
        current.word = true;
    }

    public boolean search(String word) {
        return dfs(root, word, 0);
    }

    private boolean dfs(Node node, String word, int index) {
        if (index == word.length()) return node.word;

        char ch = word.charAt(index);
        if (ch != '.') {
            Node next = node.next[ch - 'a'];
            return next != null && dfs(next, word, index + 1);
        }

        for (Node next : node.next) {
            if (next != null && dfs(next, word, index + 1)) return true;
        }
        return false;
    }
}
