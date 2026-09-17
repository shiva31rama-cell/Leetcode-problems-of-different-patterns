public class Solution {
    private int rows, cols;
    private long[][] bit;

    public Solution(int rows, int cols) {
        this.rows = rows; this.cols = cols;
        bit = new long[rows + 1][cols + 1];
    }

    public void add(int row, int col, long delta) {
        for (int i = row + 1; i <= rows; i += i & -i)
            for (int j = col + 1; j <= cols; j += j & -j)
                bit[i][j] += delta;
    }

    public long prefix(int row, int col) {
        long sum = 0;
        for (int i = row + 1; i > 0; i -= i & -i)
            for (int j = col + 1; j > 0; j -= j & -j)
                sum += bit[i][j];
        return sum;
    }

    public long rangeSum(int r1, int c1, int r2, int c2) {
        return prefix(r2,c2)-prefix(r1-1,c2)-prefix(r2,c1-1)+prefix(r1-1,c1-1);
    }
}