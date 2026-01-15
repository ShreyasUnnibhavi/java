public class RatInMaze {
    public static boolean isValid(int maze[][], int row, int col, int sol[][]){
        if(row >= 0 && row < maze.length && col >= 0 && col < maze.length && maze[row][col] == 1 && sol[row][col] == 0){
            return true; 
        }       
        
        return false;
    }
    public static void print(int sol[][]){
        for(int i = 0; i < sol.length; i++){
            for(int j = 0; j < sol.length; j++){
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean findWays(int maze[][], int row, int col, int sol[][]){
        //base case
        if(row == maze.length-1 && col == maze.length-1 && maze[row][col] == 1){
            sol[row][col] = 1;
            print(sol);
            return true;
        }
        //recursion
        if(isValid(maze, row, col, sol)){
            sol[row][col] = 1;
            if(findWays(maze, row + 1, col, sol)) return true;      //move down
            if(findWays(maze, row, col + 1, sol)) return true;      //move right
            // if(findWays(maze, row - 1, col, sol)) return true;      //move up
            // if(findWays(maze, row, col - 1, sol)) return true;      //move left
            sol[row][col] = 0;
        }
        return false;
    }
    public static void main(String[] args) {
        int maze[][] = {
            {1, 1, 1, 0},
            {0, 0, 1, 0},
            {0, 0, 1, 1},
            {0, 0, 0, 1}
        };
        int sol[][] = new int[maze.length][maze.length];
        if(!findWays(maze, 0, 0, sol)){
            System.out.println("Solution does not exist");
        }
    }
}
