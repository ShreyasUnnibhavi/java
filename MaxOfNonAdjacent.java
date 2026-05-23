import java.util.Arrays;

public class MaxOfNonAdjacent {
    public static int max(int index, int[] nums, int[] dp) {
        //Base case
        if(index == 0) return nums[index];
        if(index < 0) return 0;
        if(dp[index] != -1) return dp[index];
        int pick = nums[index] + max(index - 2, nums, dp);
        int notPick = 0 + max(index - 1, nums, dp);
        return dp[index] = Math.max(pick, notPick);
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 9};
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        System.out.println(max(nums.length - 1, nums, dp));
    }
}
