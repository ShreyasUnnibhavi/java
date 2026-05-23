import java.util.Arrays;

public class MaxOfNonAdjacentII {
    public static int max(int index, int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            int take = nums[i];
            if(i > 1) take += dp[i - 2];
            int notTake = dp[i - 1];
            dp[i] = Math.max(take, notTake);
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 9};
        System.out.println(max(nums.length - 1, nums));
    }
}
