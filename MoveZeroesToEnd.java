import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int insertPos = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] != 0) {
                swap(nums, i, insertPos);
                insertPos++;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
