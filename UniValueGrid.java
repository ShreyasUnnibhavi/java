import java.util.Arrays;
public class UniValueGrid {
    public static int minOperations(int[][] grid, int x) {
        int m = grid.length; 
        int n = grid[0].length;
        int[] nums = new int[m * n];
        int rem = grid[0][0] % x;
        int idx = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(grid[i][j] % x != rem)
                    return -1;
                nums[idx++] = grid[i][j];
            }
        }
        Arrays.sort(nums);
        int median = nums[m * n / 2];
        int operations = 0;
        for(int num : nums) 
            operations += Math.abs(num - median) / x;
        return operations;
    }
    public static void main(String[] args) {
        int[][] grid = {
            {1, 5},
            {2, 3}
        };
        int x = 1;
        System.out.println(minOperations(grid, x));
    }
}
