public class KnightsTour{
    public static void printBoard(int board[][]) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) 
                System.out.print(board[i][j] + " ");
            System.out.println();
        }
    }
    public static boolean isSafe(int board[][], int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length && board[row][col] == -1;
    }
    public static boolean moveKnight(int board[][], int move, int row, int col, int rows[], int cols[]) {
        //! Base case
        if(move == board.length*board.length)
            return true;

        //! Recursion
        if(!isSafe(board, row, col))
            return false;

        board[row][col] = move;
        for(int i = 0; i < rows.length; i++) {
            int nextRow = row + rows[i];
            int nextCol = col + cols[i];
            if(moveKnight(board, move+1, nextRow, nextCol, rows, cols)) return true;
        }

        board[row][col] = -1;
        return false;
    }
    public static void solve(int board[][]) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = -1;
            }
        }
        int rows[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int cols[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        if(moveKnight(board, 0, 0, 0, rows, cols))
            printBoard(board);
        else
            System.out.println("Solution doesn't exist");
    }
    public static void main(String[] args) {
        int board[][] = new int[8][8];
        solve(board);
    }
}