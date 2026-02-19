public class SudokuBitM {
    static int rows[] = new int[9];
    static int cols[] = new int[9];
    static int box[] = new int[9];
    public static void toggle(char board[][], int boxIndex, int row, int col, int num) {
        int mask = (1 << num);

        rows[row] ^= mask;
        cols[col] ^= mask;
        box[boxIndex] ^= mask;
    }
    public static boolean isSafe(char board[][], int boxIndex, int row, int col, int num) {
        int mask = (1 << num);

        return ((rows[row] & mask) == 0) && ((cols[col] & mask) == 0) && ((box[boxIndex] & mask) == 0);
    }
    public static boolean solveSudoku(char board[][], int row, int col) {
        //* Base case
        if(row == 9)
            return true;

        //* Recusrion
        int nextRow = row;
        int nextCol = col + 1;
        if(nextCol == 9) {
            nextRow += 1;
            nextCol = 0;
        }
        if(board[row][col] != '.')
            return solveSudoku(board, nextRow, nextCol);
        
        for(int i = 0; i < 9; i++) {
            int boxIndex = (row/3)*3 + (col/3);
            if(isSafe(board, boxIndex, row, col, i)) {
                board[row][col] = (char) (i + '1');
                toggle(board, boxIndex, row, col, i);
                if(solveSudoku(board, nextRow, nextCol))
                    return true;
                toggle(board, boxIndex, row, col, i);
                board[row][col] = '.';
            }
        }
        return false;
    }
    public static void solve(char board[][]) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    rows[i] |= (1 << num);
                    cols[j] |= (1 << num);
                    int boxIndex = (i/3)*3 + (j/3);
                    box[boxIndex] |= (1 << num);
                }
            }
        }
        solveSudoku(board, 0, 0); 
    }
    public static void print(char board[][]) {
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        solve(board);
        print(board);
    }
}