import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int elem = 0;
        for(int row = 0; row < m; row++) {
            int col = getMinCol(matrix[row]);
            elem = matrix[row][col];
            if(isMaxInCol(matrix, col, elem))
                list.add(elem);
        }
        return list;
    }
    public static boolean isMaxInCol(int[][] matrix, int col, int elem) {
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][col] > elem)
                return false;
        }
        return true;
    }
    public static int getMinCol(int[] row) {
        int col = 0;
        for (int i = 1; i < row.length; i++) {
            if(row[i] < row[col])
                col = i;
        }
        return col;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 10, 4, 2},
            {9, 3, 8, 7},
            {15, 16, 17, 12}
        };
        System.out.println(luckyNumbers(matrix));
    }
}