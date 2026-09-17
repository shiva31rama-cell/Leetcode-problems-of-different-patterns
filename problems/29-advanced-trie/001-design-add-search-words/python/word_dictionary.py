class WordDictionary:
    def __init__(self):
        self.children = {}
        self.word = False

    def addWord(self, word: str) -> None:
        node = self
        for ch in word:
            if ch not in node.children:
                node.children[ch] = WordDictionary()
            node = node.children[ch]
        node.word = True

    def search(self, word: str) -> bool:
        def dfs(node, index):
            if index == len(word):
                return node.word

            ch = word[index]
            if ch != '.':
                next_node = node.children.get(ch)
                return next_node is not None and dfs(next_node, index + 1)

            for next_node in node.children.values():
                if dfs(next_node, index + 1):
                    return True
            return False

        return dfs(self, 0)
