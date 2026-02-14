public class GridWaysOptimized {
    public static int findWays(int n, int m) {
        int totalWays = n + m - 2;  //! Total moves/ Depth
        int r = n - 1;  //! numbers of ways (dowm/right) that must be correct

        if(r > totalWays - r)
            r = totalWays - r;

        long res = 1;
        for(int i = 1; i <= r; i++) {
            res = res * (totalWays - i + 1);
            res = res / i;
        }

        return (int)res;
    }
    public static void main(String[] args) {
        int n = 4, m = 3;
        System.out.println(findWays(n, m));
    }
}
