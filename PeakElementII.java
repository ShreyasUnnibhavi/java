import java.util.Arrays;

public class PeakElementII {
    public static int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int start = 0;
        int end = cols - 1;
        while(start <= end) {
            int midCol = start + (end - start);

            int maxRow = 0;
            for(int i = 0; i < rows; i++) {
                if(mat[i][midCol] > mat[maxRow][midCol]) midCol = i;
            }

            int leftNeighbour = (midCol > 0)? mat[maxRow][midCol - 1]: -1;
            int rightNeighbour = (midCol < cols - 1)? mat[maxRow][midCol + 1]: -1;

            if(mat[maxRow][midCol] > leftNeighbour && mat[maxRow][midCol] > rightNeighbour) {
                return new int[] {maxRow, midCol};
            }else if(leftNeighbour > mat[maxRow][midCol]) {
                end = midCol - 1;
            }else {
                start = midCol + 1;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 4},
            {3, 2}
        };
        System.out.println(Arrays.toString(findPeakGrid(mat)));
    }
}
