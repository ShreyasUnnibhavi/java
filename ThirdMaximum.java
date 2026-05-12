public class ThirdMaximum {
    public static int thirdMax(int[] nums) {
        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;
        long t = Long.MIN_VALUE;
        for(int num : nums) {
            if(num > f) {
                t = s;
                s = f;
                f = num;
            }else if(num > s && num != f) {
                t = s;
                s = num;
            }else if(num > t && num != f && num != s) {
                t = num;
            }
        }
        return (t != Long.MIN_VALUE)? (int)t : (int)f;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(thirdMax(nums));
    }
}