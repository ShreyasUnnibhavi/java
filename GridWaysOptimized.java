public class GridWaysOptimized {
    public static long findWays(int n, int m){
        int N = n + m - 2;      //total moves
        int r = m - 1;          //total down moves/ can be right moves as well(m - 1)

        if(r > N - r){
            r = N - r;
        }
        long res = 1;
        for(int i = 1; i <= r; i++){
            res = res * (N - i + 1);
            res = res / i;
        }
        return res;
    }
    public static void main(String[] args) {
        int n = 4, m = 3;
        System.out.println(findWays(n, m));
    }
}
