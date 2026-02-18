public class SudokuSolver {
    public static boolean isSafe(int board[][], int num, int row, int col) {
        //! Checking for num horizontally and vertically
        for(int i = 0; i < 9; i++) {
            if(board[i][col] == num || board[row][i] == num)
                return false;
        }

        //! checking in the smaller box(3x3)
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for(int i = sr; i < sr + 3; i++) {
            for(int j = sc; j < sc + 3; j++) {
                if(board[i][j] == num)
                    return false;
            }
        }

        return true;
    }
    public static boolean solve(int board[][], int row, int col) {
        //^ Base case
        if(row == 9)
            return true;

        //^ Recursion
        int nextRow = row;
        int nextCol = col + 1;
        if(nextCol == 9) {
            nextCol = 0;
            nextRow = nextRow + 1;
        }

        if(board[row][col] != 0)
            return solve(board, nextRow, nextCol);

        for(int i = 1; i <= 9; i++) {
            if(isSafe(board, i, row, col)) {
                board[row][col] = i;
                if(solve(board, nextRow, nextCol))
                    return true;
                board[row][col] = 0;    //* Backtracking
            }
        }

        return false;
    }
    public static void print(int board[][]) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] board = {
            {0, 0, 1, 0, 0, 9, 0, 0, 0},
            {0, 0, 0, 7, 0, 0, 2, 0, 1},
            {2, 8, 9, 3, 0, 0, 0, 0, 0},
            {0, 0, 2, 0, 4, 0, 6, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0, 7},
            {0, 0, 6, 0, 8, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 5, 4, 3, 8},
            {6, 0, 4, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 9, 0, 0, 5, 0, 0}
        };
        if(solve(board, 0, 0))
            print(board);
    }
}