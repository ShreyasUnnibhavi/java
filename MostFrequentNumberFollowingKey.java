import java.util.ArrayList;
import java.util.Arrays;

public class MostFrequentNumberFollowingKey {
    public static int findTarget(ArrayList<Integer> nums, int key){
        int counts[] = new int[1001];
        for(int i = 0; i < nums.size()-1; i++){
            if(nums.get(i) == key){
                counts[nums.get(i+1)]++;
            }
        }
        int max = 0;
        int target = 0;
        for(int i = 0; i < counts.length; i++){
            if(counts[i] > 0 && counts[i] > max){
                max = counts[i];
                target = i;
            }
        }
        return target;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 2, 2, 3));
        int key = 2;
        System.out.println(findTarget(nums, key));
    }
}
