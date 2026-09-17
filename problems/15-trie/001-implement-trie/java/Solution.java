public class Solution {
    private static class Node {
        Node[] children = new Node[26];
        boolean isWord;
    }

    private final Node root = new Node();

    public void insert(String word) {
        Node current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        Node node = findNode(word);
        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix) {
        return findNode(prefix) != null;
    }

    private Node findNode(String text) {
        Node current = root;
        for (char ch : text.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) return null;
            current = current.children[index];
        }
        return current;
    }
}
