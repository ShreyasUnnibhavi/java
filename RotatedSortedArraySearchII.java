public class RotatedSortedArraySearchII {
    public static boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] == target)
                return true;
            
            if(nums[mid] == nums[left] && nums[right] == nums[mid]) {
                left++;
                right--;
                continue;
            }

            if(nums[left] <= nums[mid]) { //Left side is sorted
                if(target >= nums[left] && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }else { //Right side is sorted
                if(target > nums[mid] && target <= nums[right]) 
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {2,5,6,0,0,1,2};
        System.out.println(search(nums, 7));
    }
}
