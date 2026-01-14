public class GridWays {
    public static int findWays(int n, int m, int row, int col){
        if(row == n - 1 && col == m - 1){
            return 1;
        }
        if(row == n || col == m){
            return 0;
        }
        // 2 options
        int ways1 = findWays(n, m, row+1, col);  //move down
        int ways2 = findWays(n, m, row, col+1);  //move right
        
        return ways1 + ways2;   //ways moving down + ways moving right
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(findWays(n, m, 0, 0));
    }
}
