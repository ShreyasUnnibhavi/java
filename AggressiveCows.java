public class AggressiveCows {
    // 1, 2, 4, 8, 9
    public static boolean canPlace(int[] stalls, int n, int cows, int d) {
        cows--;
        int lastPlace = 0;
        for(int i = 1; i < n; i++) {
            if(stalls[i] >= stalls[lastPlace] + d) {
                lastPlace = i;
                cows--;
            }
            if(cows <= 0) return true;
        }
        return false;
    }
    public static int minDistance(int n, int cows, int[] stalls) {
        java.util.Arrays.sort(stalls);
        int start = 1;
        int end = stalls[n-1] - stalls[0];
        int ans = 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(canPlace(stalls, n, cows, mid)) {
                ans = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int cows = 3;
        int[] stalls = {1, 2, 8, 4, 9};
        System.out.println(minDistance(n, cows, stalls));
    }
}
