class TrieNode:
    def __init__(self):
        self.children = {}
        self.word = None


class Solution:
    def exist(self, board: list[list[str]], word: str) -> bool:
        root = TrieNode()
        self._insert(root, word)

        rows = len(board)
        cols = len(board[0])
        directions = ((1, 0), (-1, 0), (0, 1), (0, -1))

        def dfs(r, c, node):
            if r < 0 or c < 0 or r >= rows or c >= cols:
                return False

            ch = board[r][c]
            if ch == "#" or ch not in node.children:
                return False

            next_node = node.children[ch]
            if next_node.word is not None:
                return True

            board[r][c] = "#"

            for dr, dc in directions:
                if dfs(r + dr, c + dc, next_node):
                    board[r][c] = ch
                    return True

            board[r][c] = ch
            return False

        for r in range(rows):
            for c in range(cols):
                if dfs(r, c, root):
                    return True

        return False

    def _insert(self, root, word):
        node = root
        for ch in word:
            node = node.children.setdefault(ch, TrieNode())
        node.word = word
