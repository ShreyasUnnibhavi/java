import java.util.Arrays;

public class LargestPerimeter {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length - 1; i >= 2; i--) {
            int sum = nums[i - 2] + nums[i - 1];
            if(sum > nums[i]) {
                return sum + nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 10};
        System.out.println(largestPerimeter(nums));
    }
}
