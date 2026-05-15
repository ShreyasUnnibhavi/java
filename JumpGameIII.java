public class JumpGameIII {
    public static boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        if(s.charAt(n - 1) != '0') return false;

        boolean dp[] = new boolean[n];
        dp[0] = true;
        int farthestProcessed = 0;
        for(int i = 0; i < n; i++) {
            if(!dp[i]) continue;
            int start = Math.max(i + minJump, farthestProcessed + 1);
            int end = Math.min(i + maxJump, n - 1);
            for(int j = start; j <= end; j++) {
                if(s.charAt(j) == '0') {
                    dp[j] = true;
                }
            }
            farthestProcessed = Math.max(farthestProcessed, end);
            if(dp[n - 1]) return true;
        }
        return dp[n - 1];
    }
    public static void main(String[] args) {
        String s = "0000000000";
        int maxJump = 5;
        int minJump = 2;
        System.out.println(canReach(s, minJump, maxJump));
    }
}
