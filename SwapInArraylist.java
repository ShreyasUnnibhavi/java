import java.util.ArrayList;
import java.util.Collections;
public class SwapInArraylist {
    public static void swap(ArrayList<Integer> list, int indx1, int indx2){
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(10);
        System.out.println("before: " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("after: " + list);
    }
}
