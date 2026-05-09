public class MostFrequentNum {
    public static int maxFrequency(int[] nums, int k) {
        java.util.Arrays.sort(nums);
        int left = 0;
        int maxFreq = 0;
        long currWindowSum = 0;
        for(int right = 0; right < nums.length; right++) {
            currWindowSum += nums[right];

            while((long)nums[right] * (right - left + 1) - currWindowSum > k) {
                currWindowSum -= nums[left];
                left++;
            }

            maxFreq = Math.max(maxFreq, (right - left + 1));
        }
        return maxFreq;
    }
    public static void main(String[] args) {
        int[] nums = {1, 4, 8, 13};
        int k = 5;
        System.out.println(maxFrequency(nums, k));
    }
}
