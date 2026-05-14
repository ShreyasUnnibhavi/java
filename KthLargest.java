public class KthLargest {
    public static int findKthLargest(int[] nums, int k) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for(int num : nums) {
            start = Math.min(start, num);
            end = Math.max(end, num);
        }
        int ans = start;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(countGreaterOrEqual(nums, mid) >= k) {
                ans = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static int countGreaterOrEqual(int[] nums, int target) {
        int count = 0;
        for(int num : nums) {
            if(num >= target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums, 4));
    }
}
