import java.util.Arrays;

public class ArrayParttion {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int s = 0;
        for(int i = 0; i < nums.length; i += 2) {
            s += nums[i];
        }
        return s;
    }
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2, 5, 7};
        System.out.println(arrayPairSum(nums));
    }
}
