import java.util.Arrays;

public class SetMismatch {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < nums.length) {
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]) {
                swap(nums, i, nums[i] - 1);
            }else {
                i++;
            }
        }
        for(i = 0; i < n; i++) {
            if(nums[i] != i+1) {
                return new int[]{nums[i], i+1};
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
