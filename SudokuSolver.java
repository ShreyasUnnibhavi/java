public class SudokuSolver {
    public static boolean isSafe(int board[][], int row, int col, int num){
        for(int i = 0; i < 9; i++){
            if(board[i][col] == num || board[row][i] == num) return false;
        }

        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i = sr; i < sr+3; i++){
            for(int j = sc; j < sc+3; j++){
                if(board[i][j] == num) return false;
            }
        }

        return true;
    }
    public static boolean placeNumber(int board[][], int row, int col){
        //base case
        if(row == 9) return true;
        //recursion
        int nextRow = row;
        int nextCol = col+1;
        if(nextCol == 9) {
            nextRow += 1;
            nextCol = 0;
        }

        if(board[row][col] != 0){
            return placeNumber(board, nextRow, nextCol);
        }

        for(int i = 1; i <= 9; i++){
            if(isSafe(board, row, col, i)){
                board[row][col] = i;
                if(placeNumber(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col] = 0;    //backtracking
            }
        }
        return false;
    }
    public static void printBoard(int board[][]){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int board[][] = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };
        if(placeNumber(board, 0, 0)) printBoard(board);
    }
}
