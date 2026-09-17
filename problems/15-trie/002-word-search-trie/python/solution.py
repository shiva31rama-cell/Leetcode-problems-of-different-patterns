class TrieNode:
    def __init__(self):
        self.children = {}
        self.word = None


class Solution:
    def findWords(self, board: list[list[str]], words: list[str]) -> list[str]:
        root = TrieNode()

        for word in words:
            self._insert(root, word)

        rows = len(board)
        cols = len(board[0])
        directions = ((1, 0), (-1, 0), (0, 1), (0, -1))
        answer = []

        def dfs(r, c, node):
            if r < 0 or c < 0 or r >= rows or c >= cols:
                return

            ch = board[r][c]
            if ch == "#" or ch not in node.children:
                return

            next_node = node.children[ch]

            if next_node.word is not None:
                answer.append(next_node.word)
                next_node.word = None  # avoid duplicate output

            board[r][c] = "#"

            for dr, dc in directions:
                dfs(r + dr, c + dc, next_node)

            board[r][c] = ch

        for r in range(rows):
            for c in range(cols):
                dfs(r, c, root)

        return answer

    def _insert(self, root, word):
        node = root
        for ch in word:
            node = node.children.setdefault(ch, TrieNode())
        node.word = word
