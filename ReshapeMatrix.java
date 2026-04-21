import java.util.Arrays;

public class ReshapeMatrix {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c)
            return mat;
        int[][] res = new int[r][c];
        for(int i = 0; i < m*n; i++) {
            res[i / c][i % c] = mat[i / n][i % n];
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2},
            {3, 4}
        };
        int r = 4, c = 1;
        int[][] res = matrixReshape(mat, r, c);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
