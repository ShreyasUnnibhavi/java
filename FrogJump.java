import java.util.Arrays;

public class FrogJump {
    public static int jump(int i, int[] energy, int[] dp) {
        //Base case
        if(i == 0) {
            return 0;
        }

        if(dp[i] != -1) return dp[i];
        int left = jump(i - 1, energy, dp) + Math.abs(energy[i] - energy[i - 1]);
        int right = Integer.MAX_VALUE;
        if(i > 1) right = jump(i - 2, energy, dp) + Math.abs(energy[i] - energy[i - 2]);
        return dp[i] = Math.min(left, right);
    }
    public static void main(String[] args) {
        int[] energy = {7, 4, 4, 2, 6, 6, 3, 4};
        int[] dp = new int[energy.length];
        Arrays.fill(dp, -1);
        System.out.println(jump(energy.length - 1, energy, dp));
    }
}
