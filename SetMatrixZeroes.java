import java.util.Arrays;

public class SetMatrixZeroes {
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowHasZero = false;
        boolean firstColHasZero = false;

        for(int i = 0; i < n; i++) {
            if(matrix[0][i] == 0)
                firstRowHasZero = true;
        }
        for(int i = 0; i < m; i++) {
            if(matrix[i][0] == 0)
                firstColHasZero = true;
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            }
        }

        if(firstRowHasZero) {
            for(int i = 0; i < n; i++) 
                matrix[0][i] = 0;
        }
        if(firstColHasZero) {
            for(int i = 0; i < m; i++) 
                matrix[i][0] = 0;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {0, 1, 2, 0},
            {3, 4, 5, 2},
            {1, 3, 1, 5}
        };
        setZeroes(matrix);
        for(int res[]:matrix) {
            System.out.println(Arrays.toString(res));
        }
    }
}
