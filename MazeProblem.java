import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        System.out.println(maze("", 3, 3));
    }
    public static ArrayList<String> maze(String path, int r, int c) {
        //Base case
        if(r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1) list.addAll(maze(path + "D", r - 1, c));
        if(c > 1) list.addAll(maze(path + "R", r, c - 1));
        return list;
    }
}
