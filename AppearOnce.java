public class AppearOnce {
    public static int check(int[] nums) {
        int ones = 0;
        int twos = 0;
        for(int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 3, 2, 4, 5, 5, 5, 6, 6, 6, 1, 2, 3};
        System.out.println(check(nums));
    }
}
