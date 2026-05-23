public class MaxExercisePointsII {
    public static int maxPoints(int[][] excercises) {
        int m = excercises.length;
        int[][] dp = new int[m][4];
        dp[0][0] = Math.max(excercises[0][1], excercises[0][2]);
        dp[0][1] = Math.max(excercises[0][0], excercises[0][2]);
        dp[0][2] = Math.max(excercises[0][0], excercises[0][1]);
        dp[0][3] = Math.max(excercises[0][0], Math.max(excercises[0][1], excercises[0][2]));
        for (int i = 1; i < m; i++) {
            for (int last = 0; last < 3; last++) {
                dp[i][last] = 0;
                for(int task = 0; task < 3; task++) {
                    if(task != last) {
                        int points = excercises[i][task] + dp[i - 1][task];
                        dp[i][last] = Math.max(dp[i][last], points);
                    }
                }
            }
        }
        return dp[m - 1][2];
    }
    public static void main(String[] args) {
        int[][] excercises = {
            {10, 60, 15},
            {40, 100, 5}
        };
        System.out.println(maxPoints(excercises));
    }
}
