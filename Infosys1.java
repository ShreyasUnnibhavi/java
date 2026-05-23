import java.util.Scanner;
import java.util.Arrays;

public class Infosys1 {
    public static int solve(int N, int T, int[][] denominations) {
        Arrays.sort(denominations, (a, b) -> Integer.compare(b[0], a[0]));
        long remaining = T;
        int totalTokens = 0;
        int i = 0;
        while(remaining > 0 && i < N) {
            int val = denominations[i][0];
            int count = denominations[i][1];
            if(count > 0 && remaining % val == 0) {
                long canTake = remaining / val;
                long take = Math.min(canTake, (long)count);
                remaining -= take * val;
                denominations[i][1] -= take;
                totalTokens += take;
                i = 0;
            }else {
                i++;
            }
        }
        return remaining == 0 ? (int) totalTokens : -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int[][] denominations = new int[N][2];

        for (int i = 0; i < N; i++) {
            denominations[i][0] = sc.nextInt(); // value
            denominations[i][1] = sc.nextInt(); // count
        }

        int result = solve(N, T, denominations);
        System.out.println(result);
    }
}
