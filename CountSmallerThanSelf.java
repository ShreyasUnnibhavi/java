import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountSmallerThanSelf {
    public static int findInsertionIndex(List<Integer> list, int target) {
        int start = 0;
        int end = list.size() - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(list.get(mid) < target) {
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return start;
    }
    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> result = new ArrayList<>();
        List<Integer> sortedList = new ArrayList<>();
        for(int i = nums.length - 1; i >= 0; i--) {
            int index = findInsertionIndex(sortedList, nums[i]);
            result.add(index);
            sortedList.add(index, nums[i]);
        } 
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {5, 2, 6, 1};
        System.out.println(countSmaller(nums));
    }
}
