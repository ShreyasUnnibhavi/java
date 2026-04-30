public class ArrangeCoins {
    public static int arrangeCoins(int coins) {
        long left = 0;
        long right = coins;
        while(left <= right) {
            long mid = left + (right - left) / 2;
            long currCoins = mid * (mid + 1) / 2;
            if(currCoins == coins)
                return (int) mid;
            else if(currCoins < coins)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return (int) right;
    }
    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n));
    }
}
