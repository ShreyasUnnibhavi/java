import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(nums[j] + nums[j-i] == target) {
                    return new int[]{j-i, j};
                }
            }               
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int[] res = twoSum(nums, 9);
        System.out.println(Arrays.toString(res));
    }
}