public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        //^* 1. Finding the pivot
        int i = nums.length-2;
        while(i >= 0 && nums[i] >= nums[i+1]) {
            i--;
        }

        //^* 2. swapping the pivot element with its strictly greater element to its right
        if(i >= 0) {
            int j = nums.length-1;
            while(j > i && nums[j] < nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        //^* 3. Reverse to get the next greater element/next permutation
        reverse(nums, i+1, nums.length-1);

        for(int k = 0; k < nums.length; k++) {
            System.out.print(nums[k]);
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int[] nums, int left, int right) {
        while(left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        nextPermutation(nums);
    }
}
