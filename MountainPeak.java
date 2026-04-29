public class MountainPeak {
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int start = 1;
        int end = n - 2;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return end;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 6};
        System.out.println(peakIndexInMountainArray(nums));
    }
}