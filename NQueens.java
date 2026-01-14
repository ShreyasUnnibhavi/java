public class NQueens {
    public static boolean isSafe(char chessBoard[][], int row, int col){

        //vertically upwards, col remains same
        for(int i = row-1; i >= 0; i--){
            if(chessBoard[i][col] == 'Q') return false;
        }

        //diagonally left, both row and col go on decreasing
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--){
            if(chessBoard[i][j] == 'Q') return false;
        }

        //diagonally right, row decreases col increases
        for(int i = row-1, j = col+1; i >= 0 && j < chessBoard.length; i--, j++){
            if(chessBoard[i][j] == 'Q') return false;
        }

        return true;
    }
    public static void printBoard(char chessBoard[][]){
        System.out.println("-------chess board -------");
        for(int i = 0; i < chessBoard.length; i++){
            for(int j = 0; j < chessBoard.length; j++){
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean nQueens(char chessBoard[][], int row){
        if(row == chessBoard.length){
            // printBoard(chessBoard);
            return true;
        }
        for(int j = 0; j < chessBoard.length; j++){
            if(isSafe(chessBoard, row, j)){
                chessBoard[row][j] = 'Q' ;
                if(nQueens(chessBoard, row+1)){
                    return true;
                }
                chessBoard[row][j] = '.';
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 3;
        char chessBoard[][] = new char[n][n];
        for(int i = 0; i < chessBoard.length; i++){
            for(int j = 0; j < chessBoard.length; j++){
                chessBoard[i][j] = '.';
            }
        }
        if(nQueens(chessBoard, 0)){
            System.out.println("Solution is possible");
            printBoard(chessBoard);
        }else{
            System.out.println("There is no solution");
        }
    }
}
