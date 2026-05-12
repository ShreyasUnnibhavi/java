import java.util.Arrays;

public class SortByParity {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        while(i < j) {
            if(nums[i] % 2 == 0) i++;
            else if(nums[j] % 2 != 0) j--;
            else {
                swap(nums, i, j);
                i++;
                j--;
            } 
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }
}
