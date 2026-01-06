//solved using recursion
public class TilingProblem {
    public static int tiling(int n){
        if(n == 0 || n == 1) return 1;
        int vertical = tiling(n-1);    //function to calculate the remaining n-1 ways when the first tile is placed vertically(2 x 1)
        int horizontal = tiling(n-2);  //function to calculate the remaining n-2 ways when the first 2 tiles are placed horizontally(2 x 1)
        return vertical + horizontal;   //total number of ways to place 2 X 1 tiles on the floor(2 x n)
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(tiling(n));
    }
}
