import java.util.Arrays;

public class Leetcode1030 {
    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] result = new int[rows * cols][2];
        int k = 0;
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                result[k++] = new int[] {r, c};
            }
        }

        Arrays.sort(result, (a, b) -> {
            int distA = Math.abs(rCenter - a[0]) + Math.abs(cCenter - a[1]);
            int distB = Math.abs(rCenter - b[0]) + Math.abs(cCenter - b[1]);
            return Integer.compare(distA, distB);
        });

        return result;
    }
    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int rCenter = 1;
        int cCenter = 2;
        int[][] res = allCellsDistOrder(rows, cols, rCenter, cCenter);
        for(int nums[] : res) {
            System.out.print(Arrays.toString(nums) + ", ");
        }
    }
}