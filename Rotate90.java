import java.util.Arrays;

public class Rotate90 {
    public static void swap(int[][] matrix, int a, int b, int c, int d) {
        int temp = matrix[a][b];
        matrix[a][b] = matrix[c][d];
        matrix[c][d] = temp;
    }
    public static void transpose(int[][] matrix, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) 
                swap(matrix, i, j, j, i);
        }
    }
    public static void reverse(int[][] matrix, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2; j++) 
                swap(matrix, i, j, i, n-1-j);
        }
    }
    public static void rotate(int[][] matrix) {
        int m = matrix.length;
        transpose(matrix, m);
        reverse(matrix, m);
    }
    public static void main(String[] args) {
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        rotate(nums);
        for(int[] row : nums) {
            System.out.println(Arrays.toString(row));
        }
    }
}
