public class ThreeSumClosest {
    public static int closest(int[] nums, int target) {
        int n = nums.length;
        int closestSum = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < n; i++) {
            int left = i + 1;
            int right = n - 1;
            while(left < right) {
                int currSum = nums[i] + nums[left] + nums[right];
                if(Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum;
                }
                if(currSum == target) return target;
                if(currSum > target) {
                    right--;
                }else {
                    left++;
                }
            }
        }
        return closestSum;
    }
    public static void main(String[] args) {
        int[] nums = {-1,2,1,-4};
        int target = 1;
        System.out.println(closest(nums, target));
    }
}
