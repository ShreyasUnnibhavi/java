import java.util.ArrayList;

public class PairSum2 {
    public static boolean findTarget(ArrayList<Integer> list, int target){
        int pivot = -1;
        for(int k = 0; k < list.size()-1; k++){
            if(list.get(k) > list.get(k + 1)){
                pivot = k+1;
                break;
            }
        }
        if(pivot == -1) pivot = 0;
        int j = pivot;
        int i = pivot-1;
        if(i == -1) i = list.size()-1;
        while(i != j){
            if(list.get(i) + list.get(j) == target) return true;
            else if(list.get(i) + list.get(j) > target){
                i--;
                if(i == -1) i = list.size()-1;
            }else{
                 j++;
                 if(j == list.size()) j = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //11, 15, 6, 8, 9, 10
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 20;
        System.out.println(findTarget(list, target));
    }
}
