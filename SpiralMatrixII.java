import java.util.Arrays;

public class SpiralMatrixII {
    public static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int startRow = 0,
        startCol = 0,
        endRow = n-1,
        endCol = n-1;
        int k = 1;
        while(startRow <= endRow && startCol <= endCol) {
            //top
            for(int j=startCol; j<=endCol; j++){
                matrix[startRow][j] = k;
                k++;
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                matrix[i][endCol] = k;
                k++;
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startRow == endRow){break;}
                matrix[endRow][j] = k;
                k++;
            }

            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startCol == endCol){break;}
                matrix[i][startCol] = k;
                k++;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        } 
        return matrix;
    }
    public static void main(String[] args) {
        int[][] result = generateMatrix(3);
        for(int[] res : result) {
            System.out.println(Arrays.toString(res));
        }
    }
}
