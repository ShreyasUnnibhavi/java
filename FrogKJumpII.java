import java.util.Arrays;

public class FrogKJumpII {
    public static int jump(int[] energy, int k) {
        int n = energy.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= k; j++) {
                if(i - j >= 0) {
                    int jumpCost = dp[i - j] + Math.abs(energy[i] - energy[i - j]);
                    dp[i] = Math.min(dp[i], jumpCost);
                }else {
                    break;
                }
            }
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        int[] energy = {40, 10, 20, 70, 80, 10, 20, 70, 80, 60};
        int k = 4;
        System.out.println(jump(energy, k));
    }
}
