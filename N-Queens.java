public class NQueens {
    private int N;

    public NQueens(int N) {
        this.N = N;
    }

    private boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < col; i++)
            if (board[row][i] == 1) return false;

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1) return false;

        for (int i = row, j = col; i < N && j >= 0; i++, j--)
            if (board[i][j] == 1) return false;

        return true;
    }

    private boolean solveNQUtil(int[][] board, int col) {
        if (col >= N) return true;

        for (int i = 0; i < N; i++) {
            if (isSafe(board, i, col)) {
                board[i][col] = 1;
                if (solveNQUtil(board, col + 1)) return true;
                board[i][col] = 0; // backtrack
            }
        }
        return false;
    }

    private void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print((board[i][j] == 1 ? "Q " : ". "));
            System.out.println();
        }
        System.out.println();
    }

    public void solve() {
        int[][] board = new int[N][N];
        if (solveNQUtil(board, 0)) printBoard(board);
        else System.out.println("No solution exists");
    }

    public static void main(String[] args) {
        NQueens q = new NQueens(8);
        q.solve();
    }
}
