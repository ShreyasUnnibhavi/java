import java.util.ArrayList;

public class PairSumTarget {
    public static boolean findPair(ArrayList<Integer> list, int target){
        int i = 0;
        int j = list.size()-1;
        while(i < j){
            if(list.get(i) + list.get(j) == target) return true;
            else if(list.get(i) + list.get(j) < target) i++;
            else j--;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //1, 2, 3, 4, 5, 6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 12;
        System.out.println(findPair(list, target));
    }
}
