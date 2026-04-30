import java.util.Arrays;

public class DoubleExists {
    public static boolean binarySearch(int[] nums, int target, int i) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target && mid != i)
                return true;
            else if(target > nums[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return false;
    }
    public static boolean checkIfExist(int[] arr) {
        int m = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i < m; i++) {
            if(binarySearch(arr, arr[i] * 2, i))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }
}