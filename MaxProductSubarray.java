public class MaxProductSubarray {
    public static int maxProduct(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;
        for(int i = 1; i < nums.length; i++){
            int curr = nums[i];
            if(curr < 0){
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }

            maxSoFar = Math.max(curr, maxSoFar * curr);
            minSoFar = Math.min(curr, minSoFar * curr);

            result = Math.max(result , maxSoFar);
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
