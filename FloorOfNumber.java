public class FloorOfNumber {
    public static int findFloor(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) 
                return nums[mid];
            else if(nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return nums[right];
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 8, 9, 10, 13, 17, 21, 25, 76};
        int target = 18;
        System.out.println(findFloor(nums, target));
    }
}
