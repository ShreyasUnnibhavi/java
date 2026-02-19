import java.util.ArrayList;
import java.util.Arrays;

public class PairSum2 {
    public static boolean findTarget(ArrayList<Integer> list, int sum) {
        //? 1. Find pivot element
        int pivot = -1;
        for(int i = 0; i < list.size()-1; i++) {
            if(list.get(i) > list.get(i + 1)) {
                pivot = i + 1;
                break;
            } 
        }

        int j = pivot - 1;
        int i = pivot;
        while(i != j) {
            if(list.get(i) + list.get(j) == sum)
                return true;
            else if(list.get(i) + list.get(j) > sum) {
                j--;
                if(j == -1)
                    j = list.size()-1;
            }else {
                i++;
                if(i == list.size())
                    i = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Integer arr[] = {11, 15, 6, 8, 9, 10};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(findTarget(list, 14));
    }
}

