import java.util.Arrays;

public class SortByParityII {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        while(i < n && j < n) {
            if(nums[i] % 2 == 0) i += 2;
            else if(nums[j] % 2 != 0) j += 2;
            else {
                swap(nums, i, j);
                i += 2;
                j += 2;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 4, 5, 6};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }
}
