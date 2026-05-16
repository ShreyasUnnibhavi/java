import java.util.Arrays;
import java.util.List;
public class MinTimeDifference {
    public static int findMinDifference(List<String> timePoints) {
        int n = timePoints.size();
        if(n > 1440) return 0;
        int[] minutes = new int[n];
        for(int i = 0; i < n; i++) {
            int mins = getMinutes(timePoints.get(i));
            minutes[i] = mins;
        }
        Arrays.sort(minutes);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++) {
            min = Math.min(min, minutes[i] - minutes[i - 1]);
        }
        min = Math.min(min, 1440 - minutes[n -1] + minutes[0]);
        return min;
    }
    public static int getMinutes(String s) {
        int h = 0, m = 0;
        for(int i = 0; i < s.length(); i++) {
            if(i < 2) {
                h = h * 10 + (s.charAt(i) - '0');
            }else if(i > 2) {
                m = m * 10 + (s.charAt(i) - '0');
            }
        }
        return (h * 60) + m;
    }
    public static void main(String[] args) {
        String[] timeStamps = {"23:59","00:00"};
        System.out.println(findMinDifference(Arrays.asList(timeStamps)));
    }
}
