public class NKnights {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(placeKnights(board, 0, 0, n));
    }
    public static int placeKnights(boolean[][] board, int row, int col, int knightsLeft) {
        //Base case 1
        if(knightsLeft == 0) {
            display(board);
            System.out.println();
            return 1;
        }
        //Base case 2
        if(row == board.length) {
            return 0;
        }

        if(col == board.length) {
            return placeKnights(board, row + 1, 0, knightsLeft);
        }
        int count = 0;
        if(isSafe(board, row, col)) {
            board[row][col] = true;
            count += placeKnights(board, row, col + 1, knightsLeft - 1);
            board[row][col] = false;
        }
        count += placeKnights(board, row, col + 1, knightsLeft);
        return count;
    }
    public static boolean isSafe(boolean[][] board, int r, int c) {
        if(isValid(board, r - 2, c - 1) && board[r - 2][c - 1]) return false;
        if(isValid(board, r - 2, c + 1) && board[r - 2][c + 1]) return false;
        if(isValid(board, r - 1, c - 2) && board[r - 1][c - 2]) return false;
        if(isValid(board, r - 1, c + 2) && board[r - 1][c + 2]) return false;
        return true;
    }
    public static boolean isValid(boolean[][] board, int r, int c) {
        return (r >= 0 && r < board.length && c >= 0 && c < board.length);
    }
    public static void display(boolean[][] board) {
        for(boolean[] row : board) {
            for(boolean val : row) {
                if(val) {
                    System.out.print("K ");
                }else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
