public class HouseRobber {
    public static int rob(int[] nums) {
        int prev1 = 0;
        int prev2 = 0;

        for(int currentHouse : nums) {
            int currentMax = Math.max(prev2 + currentHouse, prev1);

            prev2 = prev1;
            prev1 = currentMax;
        }
        return prev1;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,1,2};
        System.out.println(rob(nums));
    }
}
