import java.util.ArrayList;
import java.util.List;

public class DuplicatesInArray {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n) {
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]) {
                swap(nums, i, nums[i] - 1);
            }else {
                i++;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(i = 0; i < n; i++) {
            if(nums[i] != i + 1) {
                list.add(nums[i]);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }
}
