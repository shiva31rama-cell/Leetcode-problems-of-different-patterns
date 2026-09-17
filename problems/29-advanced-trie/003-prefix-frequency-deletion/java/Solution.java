import java.util.*;

public class Solution {
    static class Node { Node[] next = new Node[26]; int pass, end; }
    private final Node root = new Node();

    public void insert(String word) {
        Node cur = root; cur.pass++;
        for (char ch : word.toCharArray()) {
            int i = ch - 'a';
            if (cur.next[i] == null) cur.next[i] = new Node();
            cur = cur.next[i]; cur.pass++;
        }
        cur.end++;
    }

    public boolean delete(String word) {
        Node[] path = new Node[word.length() + 1];
        Node cur = root; path[0] = root;
        for (int p = 0; p < word.length(); p++) {
            int i = word.charAt(p) - 'a';
            if (cur.next[i] == null || cur.next[i].pass == 0) return false;
            cur = cur.next[i]; path[p + 1] = cur;
        }
        if (cur.end == 0) return false;
        cur.end--;
        for (Node node : path) node.pass--;
        return true;
    }

    public int prefixCount(String prefix) {
        Node cur = root;
        for (char ch : prefix.toCharArray()) {
            cur = cur.next[ch - 'a'];
            if (cur == null) return 0;
        }
        return cur.pass;
    }
}