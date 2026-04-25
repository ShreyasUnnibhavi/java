public class ConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int num : nums) {
            if(num == 1)
                count++;
            else {
                max = Math.max(count, max);
                count = 0;
            }  
        }
        max = Math.max(count, max);
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
