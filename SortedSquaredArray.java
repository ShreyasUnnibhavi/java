import java.util.Arrays;

public class SortedSquaredArray {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int i = 0;
        int j = n - 1;
        int k = n - 1;
        while(i <= j) {
            int val1 = nums[i]*nums[i];
            int val2 = nums[j]*nums[j];
            res[k] = Math.max(val1, val2);
            if(val1 > val2) i++;
            else j--;
            k--;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
}
