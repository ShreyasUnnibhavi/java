import java.util.Arrays;

public class CycleSort {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void cyclicSort(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            if(nums[i] - 1 == i) i++;
            else swap(nums, i, nums[i] - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 1, 4};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
