public class KthMissingNum {
    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int missingBeforeMid = arr[mid] - (mid + 1);

            if(missingBeforeMid < k) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start + k;
    }
    public static void main(String[] args) {
        int[] nums = {2,3,4,7,11};
        System.out.println(findKthPositive(nums, 2));
    }
}
