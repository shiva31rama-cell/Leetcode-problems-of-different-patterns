class Node:
    def __init__(self):
        self.next = {}
        self.pass_count = 0
        self.end = 0

class Trie:
    def __init__(self):
        self.root = Node()

    def insert(self, word):
        cur = self.root
        cur.pass_count += 1
        for ch in word:
            cur = cur.next.setdefault(ch, Node())
            cur.pass_count += 1
        cur.end += 1

    def delete(self, word):
        cur = self.root
        path = [cur]
        for ch in word:
            if ch not in cur.next or cur.next[ch].pass_count == 0:
                return False
            cur = cur.next[ch]
            path.append(cur)
        if cur.end == 0:
            return False
        cur.end -= 1
        for node in path:
            node.pass_count -= 1
        return True

    def prefix_count(self, prefix):
        cur = self.root
        for ch in prefix:
            if ch not in cur.next:
                return 0
            cur = cur.next[ch]
        return cur.pass_count
