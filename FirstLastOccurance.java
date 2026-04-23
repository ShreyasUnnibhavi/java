import java.util.Arrays;

public class FirstLastOccurance {
    public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[]{-1, -1};
        int left = 0; 
        int right = n-1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                res[0] = mid;
                right = mid - 1;
            }else if(target < nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        
        left = 0;
        right = n-1;
        while(left <= right) {
            int mid = left + (right - left)/2;
            if(nums[mid] == target) {
                res[1] = mid;
                left = mid + 1;
            }else if(target < nums[mid])
                right = mid - 1;
            else
                left = mid + 1;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
