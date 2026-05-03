import java.util.Arrays;

public class FindRightInterval {
    public static int binarySearch(int[][] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ansIdx = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid][0] >= target) {
                ansIdx = nums[mid][1];
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return ansIdx;
    }
    public static int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int[][] starts = new int[n][2];
        for(int i = 0; i < n; i++) {
            starts[i][0] = intervals[i][0];
            starts[i][1] = i;
        }

        Arrays.sort(starts, (a, b) -> Integer.compare(a[0], b[0]));
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            int target = intervals[i][1];
            result[i] = binarySearch(starts, target);
        }

        return result;
    } 
    public static void main(String[] args) {
        int[][] intervals = {
            {3,4},
            {2,3},
            {1,2}
        };
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }
}