public class arrayPractice {
    public static int checkTarget(int nums[], int target){
        //! we are given a rotated sorted array
        int left = 0;
        int right = nums.length-1;
        while(left <= right) {
            int mid = right - (right-left)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[left] <= nums[mid]) {
                if(target >= nums[left] && target < nums[mid]) 
                    right = mid - 1;
                else
                    left = mid + 1;
            }else {
                if(target > nums[mid] && target <= nums[right]) 
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {5, 6, 0, 1, 2, 3, 4};
        int target = 5;
        System.out.print(checkTarget(nums,target));
    }
}
