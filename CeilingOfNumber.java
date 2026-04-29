public class CeilingOfNumber {
    public static int findCeiling(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target)
                return nums[mid];
            else if(nums[mid] < target) 
                start = mid + 1;
            else 
                end = mid - 1;
        }
        return nums[start];
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 8, 9, 10, 13, 17, 21, 25, 76};
        int target = 1;
        System.out.println(findCeiling(nums, target));
    }
}
