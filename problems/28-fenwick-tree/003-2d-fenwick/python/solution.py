class Fenwick2D:
    def __init__(self, rows, cols):
        self.rows, self.cols = rows, cols
        self.bit = [[0] * (cols + 1) for _ in range(rows + 1)]

    def add(self, r, c, delta):
        i = r + 1
        while i <= self.rows:
            j = c + 1
            while j <= self.cols:
                self.bit[i][j] += delta
                j += j & -j
            i += i & -i

    def prefix(self, r, c):
        total = 0
        i = r + 1
        while i > 0:
            j = c + 1
            while j > 0:
                total += self.bit[i][j]
                j -= j & -j
            i -= i & -i
        return total

    def range_sum(self, r1, c1, r2, c2):
        return (self.prefix(r2, c2) - self.prefix(r1 - 1, c2)
                - self.prefix(r2, c1 - 1) + self.prefix(r1 - 1, c1 - 1))
