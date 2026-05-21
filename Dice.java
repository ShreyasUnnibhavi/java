import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        List<String> list = dice("", 5);
        System.out.println(list);
    }
    public static List<String> dice(String p, int target) {
        //Base case
        if(target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        //recursion
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(dice(p + i, target - i));
        }
        return list;
    }
}
