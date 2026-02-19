public class RatInMaze {
    public static void print(int sol[][]) {
        for(int i = 0; i < sol.length; i++) {
            for(int j = 0; j < sol[0].length; j++)
                System.out.print(sol[i][j] + " ");
            System.out.println();
        }
    }
    public static boolean isSafe(int maze[][], int row, int col, int sol[][]) {
        if(row >= 0 && row < maze.length && col >= 0 && col < maze[0].length && maze[row][col] == 1 && sol[row][col] == 0)
            return true;
        
        return false;
    }
    public static boolean solve(int maze[][], int row, int col, int sol[][]) {
        //* Base case
        if(row == maze.length-1 && col == maze[0].length-1 && maze[row][col] == 1) {
            sol[row][col] = 1;
            print(sol);
            return true;
        }

        //* Recursion
        if(isSafe(maze, row, col, sol)) {
            sol[row][col] = 1;
            if(solve(maze, row+1, col, sol)) return true;   //! Moving down
            if(solve(maze, row, col+1, sol)) return true;   //! Moving right
            sol[row][col] = 0;  //& Backtracking step
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
        int sol[][] = new int[maze.length][maze[0].length];
        if(!solve(maze, 0, 0, sol))
            System.out.println("Solution doesn't exist");    
    }
}
