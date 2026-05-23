import java.util.Arrays;

public class DataPacketsLabelling {
    private static final long INF = Long.MAX_VALUE / 2;
    public static long getMinCost(int index, int k, int[] a, long[][] dp) {
        if(k == 0) return 0;
        if(index < 0) return INF;
        if(dp[index][k] != -1) return dp[index][k];
        long take = a[index] + getMinCost(index - 2, k - 1, a, dp);
        long skip = getMinCost(index - 1, k, a, dp);
        return dp[index][k] = Math.min(take, skip);
    }
    public static int solve(int N, int B, int[] a) {
        int maxK = (N + 1) / 2;
        long[][] dp = new long[N][maxK + 1];
        for(long[] row : dp) {
            Arrays.fill(row, -1);
        }
        for(int i = maxK; i >= 0; i--) {
            if(getMinCost(N - 1, i, a, dp) <= B) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int N = 5;
        int[] a = {10, 10, 10, 10, 10};
        int B = 1000;
        System.out.println(solve(N, B, a));
    }
}
