import java.util.Arrays;

public class MinAbsoluteSumDiff {
    public static int findInsertionPoint(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            else if(target > nums[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return start;
    }
    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int n = nums1.length;
        long mod = 1_000_000_007;

        int[] sorted = nums1.clone();
        Arrays.sort(sorted);

        long totalSumDiff = 0;
        for(int i = 0; i < n; i++) {
            totalSumDiff += Math.abs(nums1[i] - nums2[i]);
        }

        long maxReduction = 0;
        for(int i = 0; i < n; i++) {
            long originalDiff = Math.abs(nums1[i] - nums2[i]);
            int target = nums2[i];
            int closestidx = findInsertionPoint(sorted, target);

            if(closestidx < n) {
                int newDiff = Math.abs(sorted[closestidx] - target);
                maxReduction = Math.max(maxReduction, originalDiff - newDiff);
            }
            if(closestidx > 0) {
                int newDiff = Math.abs(sorted[closestidx - 1] - target);
                maxReduction = Math.max(maxReduction, originalDiff - newDiff);
            }
        }
        return (int)((totalSumDiff - maxReduction) % mod);
    }
    public static void main(String[] args) {
        int[] nums1 = {2,4,6,8,10};
        int[] nums2 = {2,4,6,8,10};
        System.out.println(minAbsoluteSumDiff(nums1, nums2));
    }
}