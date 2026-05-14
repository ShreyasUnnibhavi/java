import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static int[][] mergeIntervals(int[][] intervals) {
        int n = intervals.length;
        if(n == 1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];
        result.add(currentInterval);
        for(int[] nextInterval : intervals) {
            int currentEnd = currentInterval[1];
            int nextStart = nextInterval[0];
            int nextEnd = nextInterval[1];
            if(currentEnd >= nextStart) {
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            }else {
                currentInterval = nextInterval;
                result.add(currentInterval);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {
            {1, 3},
            {8, 10},
            {2, 6},
            {15, 18}
        };
        int[][] res = mergeIntervals(intervals);
        for(int[] r : res) {
            System.out.println(Arrays.toString(r));
        }
    }
}
