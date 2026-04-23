import java.util.Arrays;

public class SpiralMatrixIII {
    public static int[][] spiralMatrix(int rows, int cols, int rStart, int cStart) {
        int[][] ans = new int[rows * cols][2];
        int r = rStart;
        int c = cStart;
        int idx = 0;
        int steps = 1;
        while(idx < rows * cols) {
            for(int i = 0; i < steps; i++) {
                if(r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[idx][0] = r;
                    ans[idx][1] = c;
                    idx++;
                }
                c++;
            }
            for(int i = 0; i < steps; i++) {
                if(r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[idx][0] = r;
                    ans[idx][1] = c;
                    idx++;
                }
                r++;
            }
            steps++;
            for(int i = 0; i < steps; i++) {
                if(r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[idx][0] = r;
                    ans[idx][1] = c;
                    idx++;
                }
                c--;
            }
            for(int i = 0; i < steps; i++) {
                if(r >= 0 && r < rows && c >= 0 && c < cols) {
                    ans[idx][0] = r;
                    ans[idx][1] = c;
                    idx++;
                }
                r--;
            }
            steps++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int rows = 5, cols = 6, rStart = 1, cStart = 4;
        int[][] res = spiralMatrix(rows, cols, rStart, cStart);
        for(int[] arr : res) {
            System.out.println(Arrays.toString(arr));
        }
    }
}