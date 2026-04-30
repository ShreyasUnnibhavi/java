public class NegNumsInSortedMatrix {
    public static int binarySearch(int[][] grid, int row, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(grid[row][mid] >= 0) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return grid[0].length - start;
    }
    public static int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int row = 0; row < m; row++) {
            count += binarySearch(grid, row, 0, n - 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };
        System.out.println(countNegatives(grid));
    }
}
