public class GreaterOrEqualToX {
    public static int countEqualOrGreater(int[] nums, int x) {
        int count = 0;
        for(int num : nums) {
            count = num >= x ? count + 1: count;
        }
        return count;
    }
    public static int specialArray(int[] nums) {
        int start = 0;
        int end = nums.length;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int count = countEqualOrGreater(nums, mid);
            if(count == mid) 
                return mid;
            else if(count > mid) 
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {0,4,3,0,4};
        System.out.println(specialArray(nums));
    }
}
