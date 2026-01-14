public class SudokuBitM {
    // arrays to store already present numbers
    static int rows[] = new int[9];
    static int cols[] = new int[9];
    static int box[] = new int[9];

    public static void solveSudoku(char board[][]){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] - '1';        //convert char to integer (0 to 8)
                    int boxIndex = (i/3)*3 + (j/3);     //calculates the (3 X 3)box number
                    rows[i] |= (1 << num);              //setting the ith bit, indicating its presence in the row
                    cols[j] |= (1 << num);              //setting the ith bit, indicating its presence in the column
                    box[boxIndex] |= (1 << num);        //setting the ith bit, indicating its presence in the box
                }
            }
        }
        placeNumbers(board, 0, 0);
    }
    public static boolean isValid(int boxIndex, int row, int col, int num){
        int val = (1 << num);
        
        // returns true if the num is present in row, column or box
        return ((rows[row] & val) != 0 || (cols[col] & val) != 0 || (box[boxIndex] & val) != 0);
    }
    public static void toggle(int row, int col, int boxIndex, int num){
        int mask = (1 << num);
        
        //sets or clears the ith bit (necessary for backtracking)
        rows[row] ^= mask;      
        cols[col] ^= mask;
        box[boxIndex] ^= mask;
    }
    public static boolean placeNumbers(char[][] board, int row, int col){
        //base case
        if(row == 9) return true;
        //recursion
        int nextRow = row;
        int nextCol = col + 1;
        if(nextCol == 9){
            nextRow += 1;
            nextCol = 0;
        }

        if(board[row][col] != '.') return placeNumbers(board, nextRow, nextCol);
        int boxIndex = (row/3)*3 + (col/3);
        for(int i = 0; i < 9; i++){
            if(!isValid(boxIndex, row, col, i)){
                board[row][col] = (char) (i + '1');
                toggle(row, col, boxIndex, i);
                if(placeNumbers(board, nextRow, nextCol)) return true;
                toggle(row, col, boxIndex, i);
                board[row][col] = '.';
            }
        }
        return false;
    }
    public static void print(char[][] board){
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++){
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
        solveSudoku(board);
        print(board);
    }
}
