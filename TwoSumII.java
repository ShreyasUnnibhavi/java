import java.util.Arrays;

public class TwoSumII {
    public static int[] twoSum(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start < end) {
            int sum = nums[start] + nums[end];
            if(sum == target)
                return new int[]{start+1, end+1};
            else if(sum > target)
                end--;
            else
                start++;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
