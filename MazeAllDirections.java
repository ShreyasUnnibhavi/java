import java.util.Arrays;

public class MazeAllDirections {
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true},
        };
        maze("", board, 0, 0, new int[board.length][board[0].length], 1);
    }
    public static void maze(String p, boolean[][] board, int r, int c, int[][] path, int step) {
        //! Base case
        if(r == board.length - 1 && c == board[0].length - 1) {
            path[r][c] = step;
            for(int[] row : path) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println(p);
            System.out.println();
        }
        if(!board[r][c]) return;
        path[r][c] = step;
        board[r][c] = false;
        //^ Moving up
        if(r > 0) {
            maze(p + "U", board, r - 1, c, path, step + 1);
        }
        //^ Moving down
        if(r < board.length - 1) {
            maze(p + "D", board, r + 1, c, path, step + 1);
        }
        //^ Moving Left
        if(c > 0) {
            maze(p + "L", board, r, c - 1, path, step + 1);
        }
        //^ Moving Right
        if(c < board[0].length - 1) {
            maze(p + "R", board, r, c + 1, path, step + 1);
        }
        board[r][c] = true;
        path[r][c] = 0;
    }
}
