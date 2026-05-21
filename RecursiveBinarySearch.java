public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 7, 2, 6, 10};
        int res = search(nums, 10, 0, nums.length - 1);
        System.out.println(res);
    }
    public static int search(int[] nums, int target, int s, int e) {
        //Base case
        if(s > e) return -1;
        
        int mid = s + (e - s) / 2;
        if(nums[mid] == target) {
            return mid;
        }else if(nums[mid] > target) {
            return search(nums, target, s, mid - 1);
        }else {
            return search(nums, target, mid + 1, e);
        }
    }
}
