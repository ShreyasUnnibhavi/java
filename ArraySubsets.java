
import java.util.ArrayList;
import java.util.List;
public class ArraySubsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> list = subsets(nums);
        for(List<Integer> l : list) {
            System.out.println(l);
        }
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int i = 0; i < nums.length; i++) {
            int n = outer.size();
            for(int j = 0; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(nums[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
