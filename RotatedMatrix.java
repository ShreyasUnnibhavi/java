import java.util.Arrays;

public class RotatedMatrix {
    public static boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if(Arrays.deepEquals(mat, target))
                return true;
            rotate(mat);
        }
        return false;
    }
    public static void rotate(int[][] mat) {
        //1. Transpose
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        //2. Reverse
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n-1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] mat = {
            {0, 0, 0},
            {0, 1, 0},
            {1, 1, 1}
        };

        int[][] target = {
            {1, 1, 1},
            {0, 1, 0},
            {0, 0, 0}
        };

        System.out.println(findRotation(mat, target));
    }
}
