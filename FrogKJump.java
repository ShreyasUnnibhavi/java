import java.util.Arrays;

public class FrogKJump {
    public static int jump(int i, int[] energy, int k, int[] dp) {
        if(i == 0) {
            return 0;
        }
        int min = Integer.MAX_VALUE;
        if(dp[i] != -1) return dp[i];
        for(int j = 1; j <= k; j++) {
            if(i - j >= 0) {
                int jumpCost = jump(i - j, energy, k, dp) + Math.abs(energy[i] - energy[i - j]);
                min = Math.min(min, jumpCost);
            }else {
                break;
            }
        }
        return dp[i] = min;
    }
    public static void main(String[] args) {
        int[] energy = {40, 10, 20, 70, 80, 10, 20, 70, 80, 60};
        int k = 4;
        int[] dp = new int[energy.length];
        Arrays.fill(dp, -1);
        System.out.println(jump(energy.length - 1, energy, k, dp));
    }
}
