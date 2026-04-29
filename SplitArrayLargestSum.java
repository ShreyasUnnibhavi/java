public class SplitArrayLargestSum {
    public static boolean canSplit(int[] nums, int mid, int k) {
        int sum = 0;
        int pieces = 1;
        for(int num : nums) {
            if(sum + num > mid) {
                sum = num;
                pieces++;
                if(pieces > k)
                    return false;
            }else
                sum  += num;
        }
        return true;
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int num : nums) {
            start = Math.max(start, num);
            end += num;
        }
        while(start < end) {
            int mid = start + (end - start)/2;
            if(canSplit(nums, mid, k))
                end = mid;
            else
                start = mid + 1;
        }
        return end;
    }
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }
}
