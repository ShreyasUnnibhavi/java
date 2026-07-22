//solved using recursion
public class TilingProblem {
    public static int tiling(int n, int[] dp){
        if(n == 0 || n == 1) return 1;
        if(dp[n] != 0) return dp[n];
        int vertical = tiling(n-1, dp);    //function to calculate the remaining n-1 ways when the first tile is placed vertically(2 x 1)
        int horizontal = tiling(n-2, dp);
        dp[n] = vertical + horizontal;  //function to calculate the remaining n-2 ways when the first 2 tiles are placed horizontally(2 x 1)
        return dp[n];   //total number of ways to place 2 X 1 tiles on the floor(2 x n)
    }
    public static void main(String[] args) {
        int n = 4;
        int[] dp = new int[n + 1];
        System.out.println(tiling(n, dp));
    }
}
