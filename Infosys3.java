import java.util.Arrays;
import java.util.Scanner;

public class Infosys3 {
    private static final int INF = 1000000000;
    public static int getMaxScore(int index, int k, int b, int[] a, int[][][] dp) {
        if(index == -1 && k == 0) {
            return 0;
        }
        if(index == -1 || k == 0) {
            return -INF;
        }

        if(dp[index][k][b] != -1) return dp[index][k][b];
        int maxScore = -INF;
        int maxval = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        for(int p = index; p >= k - 1; p--) {
            maxval = Math.max(maxval, a[p]);
            minVal = Math.min(minVal, a[p]);
            int span = maxval - minVal;
            if(span <= b) {
                int len = index - p + 1;
                int lensq = len * len;
                int prevMax = getMaxScore(p - 1, k - 1, b - span, a, dp);
                if(prevMax != -INF) {
                    maxScore = Math.max(maxScore, prevMax + lensq);
                }
            }
        }
        return dp[index][k][b] = maxScore;
    }
    public static int solve(int n, int k, int b, int[] a) {
        if(n < k) return -1;

        int[][][] dp = new int[n][k + 1][b + 1];
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < dp[0].length; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        } 
        int res = getMaxScore(n - 1, k, b, a, dp);
        return res < 0 ? -1 : res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read parameters sequentially
        int n = sc.nextInt();
        int k = sc.nextInt();
        int b = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int result = solve(n, k, b, a);
        System.out.println(result);
        
        sc.close();
    }
}
