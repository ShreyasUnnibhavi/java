import java.util.ArrayList;
import java.util.Collections;

public class LonelyNumbers {
    public static ArrayList<Integer> isLonelyBrute(ArrayList<Integer> list){
        ArrayList<Integer> lonelyList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            boolean check = true;
            for(int j = 0; j < list.size(); j++){
                if(j == i) continue;
                if(list.get(j) == list.get(i) || list.get(j) == list.get(i) + 1 || list.get(j) == list.get(i) - 1){
                    check = false;
                    break;
                }
            }
            if(check) lonelyList.add(list.get(i));
        }
        return lonelyList;
    } 
    public static ArrayList<Integer> optimized(ArrayList<Integer> nums){
        ArrayList<Integer> newList = new ArrayList<>();
        Collections.sort(nums);

        for(int i = 1; i < nums.size()-1; i++) {
            if((nums.get(i-1) < nums.get(i)-1) && (nums.get(i+1) > nums.get(i)+1))
                newList.add(nums.get(i));
        }
        if(nums.size() < 2)
            newList.add(nums.get(0));
        else {
            if(nums.get(0) + 1 < nums.get(1))
                newList.add(nums.get(0));
            if(nums.get(nums.size()-1) > nums.get(nums.size()-2) + 1)
                newList.add(nums.get(nums.size()-1));
        }

        return newList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.add(5);
        System.out.println(isLonelyBrute(list));
        System.out.println(optimized(list));
    }
}
