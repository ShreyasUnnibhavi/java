public class MedianOfSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if(m > n)  return findMedianSortedArrays(nums2, nums1);

        int low = 0;
        int high = m;
        while(low <= high) {
            int i = (low + high) / 2;
            int j = (m + n + 1) / 2 - i;

            int L1 = (i == 0)? Integer.MIN_VALUE : nums1[i - 1];
            int R1 = (i == m)? Integer.MAX_VALUE : nums1[i];
            int L2 = (j == 0)? Integer.MIN_VALUE : nums2[j - 1];
            int R2 = (j == n)? Integer.MAX_VALUE : nums2[j];

            if(L1 <= R2 && L2 <= R1) {
                if((m + n) % 2 == 0) return (Math.max(L1, L2) + Math.min(R1, R2)) / 2.0;
                else return Math.max(L1, L2);
            } else if(L1 > R2) high = i - 1;
            else low = i + 1;
        }
        return 0.0;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}