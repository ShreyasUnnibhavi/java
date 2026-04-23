public class JumpGame {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > maxReach)
                return false;
            
            maxReach = Math.max(maxReach, i + nums[i]);
            if(maxReach >= nums.length)
                return true;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
