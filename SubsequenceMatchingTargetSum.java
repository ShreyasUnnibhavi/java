import java.util.ArrayList;

public class SubsequenceMatchingTargetSum {
    public static boolean printSubsequence(int i, int n, int target, int[] nums, int s, ArrayList<Integer> list) {
        //! Base case
        if(i == n - 1) {
            if(s == target) {
                System.out.println(list);
                return true;
            }
            return false;
        }
        list.add(nums[i]);
        s += nums[i];
        if(printSubsequence(i + 1, n, target, nums, s, list)) {
            return true;
        }
        list.remove(list.size() - 1);
        s -= nums[i];
        if(printSubsequence(i + 1, n, target, nums, s, list)) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int target = 2;
        printSubsequence(0, 4, target, nums, 0, new ArrayList<>());
    }
}
