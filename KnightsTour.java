public class KnightsTour{
    public static void printSolution(int board[][]){
        for(int i = 0; i < board.length; i++){
            for(int j = 0;j < board.length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isValid(int board[][], int x, int y){
        return x >= 0 && x < board.length && y >= 0 && y < board.length && board[x][y] == -1;
    }
    public static boolean moveKnight(int board[][], int move, int row, int col, int rows[], int cols[]){
        //base case
        if(move == board.length*board.length) return true;

        //recursion
        for(int k = 0; k < rows.length; k++){
            int nextRow = row + rows[k];
            int nextCol = col + cols[k];
            if(isValid(board, row, col)){
                board[row][col] = move;
                if(moveKnight(board, move + 1, nextRow, nextCol, rows, cols)) return true;
                else board[row][col] = -1;
            }
        }
        return false;
    }
    public static void solve(int board[][]){
        for(int i = 0; i < board.length; i++){
            for(int j = 0;j < board.length; j++){
                board[i][j] = -1;
            }
        }
        int rows[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int cols[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        if(!moveKnight(board, 0, 0, 0, rows, cols)){
            System.out.println("Solution not possible");
        }else{
            printSolution(board);
        }
    }
    public static void main(String[] args) {
        int board[][] = new int[8][8];
        solve(board);
    }
}