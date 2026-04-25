public class isSortedArray {
    public static boolean check(int[] nums) {
        int n = nums.length;
        int drops = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] > nums[(i + 1) % n])
                drops++;
            
            if(drops > 1)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 4};
        System.out.println(check(nums));
    }
}