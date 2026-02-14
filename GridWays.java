public class GridWays {
    public static int findWays(int rows, int cols, int i, int j) {
        //* Base case
        if(i == rows-1 && j == cols-1)
            return 1;
        if(i == rows || j == cols)
            return 0;
        
        //* Recursion
        int down = findWays(rows, cols, i+1, j);    //&ways moving down
        int right = findWays(rows, cols, i, j+1);   //&ways moving right
        return down + right;    //^Total ways
    }
    public static void main(String[] args) {
        int n = 3, m = 3;
        System.out.println(findWays(n, m, 0, 0));
    }
}
