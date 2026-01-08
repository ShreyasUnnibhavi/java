public class MonkeyProblem {
    private static final int MOD = 1000000007;
    public static int monkeyMove(int n) {
        long collisions = (pow(2,n) - 2 + MOD) % MOD;
        return (int) collisions;
    }
    private static long pow(long a, long n){
        long collisions = 1;
        a %= MOD;
        while(n > 0){
            if((n & 1) == 1){
                collisions = (collisions * a) % MOD;
            }
            a = (a * a) % MOD;
            n = n >> 1;
        }
        return collisions;
    }
    public static void main(String[] args) {
        System.out.println(monkeyMove(4));
    }
}
