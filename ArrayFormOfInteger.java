import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayFormOfInteger {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }

            result.add(k % 10);
            k /= 10;
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,0,0};
        int k = 34;
        System.out.println(addToArrayForm(nums, k));
    }
}
