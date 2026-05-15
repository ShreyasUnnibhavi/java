import java.util.ArrayList;
import java.util.List;

public class SplitString {
    public static int numWays(String s) {
        long n = s.length();
        long mod = 1_000_000_007;
        List<Integer> onesIdx = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == '1') onesIdx.add(i);
        }
        int k = onesIdx.size();
        if(k == 0) return (int) (((n - 1) * (n - 2) / 2) % mod);
        if(k % 3 != 0) return 0;
        int target = k / 3;
        long gap1 = onesIdx.get(target) - onesIdx.get(target - 1);
        long gap2 = onesIdx.get(2 * target) - onesIdx.get(2 * target - 1);
        return (int)((gap1 * gap2) % mod);
    }
    public static void main(String[] args) {
        String s = "0000";
        System.out.println(numWays(s));
    }
}
