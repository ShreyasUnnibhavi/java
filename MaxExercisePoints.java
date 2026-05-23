import java.util.Arrays;

public class MaxExercisePoints {
    public static int maxPoints(int index, int last, int[][] excercises, int[][] dp) {
        if(index == 0) {
            int maxi = 0;
            for(int task = 0; task < 3; task++) {
                if(task != last) {
                    maxi = Math.max(maxi, excercises[index][task]);
                }
            }
            return maxi;
        }
        if(dp[index][last] != -1) return dp[index][last];
        int maxi = 0;
        for(int task = 0; task < 3; task++) {
            if(task != last) {
                int point = excercises[index][task] + maxPoints(index - 1, task, excercises, dp);
                maxi = Math.max(maxi, point);
            }
        }
        return dp[index][last] = maxi;
    }
    public static void main(String[] args) {
        int[][] excercises = {
            {10, 60, 15},
            {40, 100, 5}
        };
        int[][] dp = new int[excercises.length][4];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(maxPoints(excercises.length - 1, 3, excercises, dp));
    }
}
