public class ComputePowXn {
    public static double myPow(double x, int n) {
        double ans = 1;
        if(n < 0) {
            x = 1/x;
            n = -n;
        }
        while(n > 0) {
            if((n & 1) == 1) {
                ans = ans * x;
            }
            x = x * x;
            n = n >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x = 5, n = -2;
        System.out.println(myPow(x, n));
    }
}
