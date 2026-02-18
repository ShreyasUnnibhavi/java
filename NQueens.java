public class NQueens {
    public static boolean isSafe(char chessBoard[][], int row, int col) {
        //* checking for 'Q' vertically upwards (only row decreases, same column)
        for(int i = row-1; i >= 0; i--) {
            if(chessBoard[i][col] == 'Q')
                return false;
        }

        //* checking for 'Q' diagonally left (row and col both decrease)
        for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if(chessBoard[i][j] == 'Q')
                return false;
        }

        //* checking for 'Q' diagonally right (row decrease, col increases)
        for(int i = row-1, j = col+1; i >= 0 && j < chessBoard.length; i--, j++) {
            if(chessBoard[i][j] == 'Q')
                return false;
        }

        return true;
    }
    public static boolean insertQueen(char chessBoard[][], int row) {
        //! Base case
        if(row == chessBoard.length){
            return true;
        } 

        //! Recursive logic
        for(int i = 0; i < chessBoard.length; i++) {
            if(isSafe(chessBoard, row, i)){
                chessBoard[row][i] = 'Q';
                if(insertQueen(chessBoard, row+1))
                    return true;
                chessBoard[row][i] = '.';
            }
        }

        return false;
    }
    public static void printBoard(char arr[][]) {
        int n = arr.length;
        System.out.println("***************CHESS BOARD***************");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        char chessBoard[][] = new char[n][n];
        for(int i = 0; i < chessBoard.length; i++) {
            for(int j = 0; j < chessBoard.length; j++) {
                chessBoard[i][j] = '.';
            }
        }
        if(insertQueen(chessBoard, 0)) 
            printBoard(chessBoard);
        else
            System.out.println("Solution doesn't exist");
    }
}