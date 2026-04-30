import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfArrays {
    public static boolean binarySearch(int[] nums, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
                return true;
            else if(nums[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        Arrays.sort(nums2);
        Arrays.sort(nums1);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < m; i++) {
            if(i > 0 && nums1[i] == nums1[i - 1])
                continue;

            if(binarySearch(nums2, nums1[i], 0, n - 1)) {
                list.add(nums1[i]);
            }
        }

        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {9,4,9,8,4};
        int[] nums2 = {4,9,5};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
