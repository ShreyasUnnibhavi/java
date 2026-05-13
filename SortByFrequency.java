import java.util.Arrays;
public class SortByFrequency {
    public static int[] sortByFrequency(int[] nums) {
        int n = nums.length;
        int[] freq = new int[201];
        for(int num : nums) {
            freq[num + 100]++;
        }
        Integer[] temp = new Integer[n];
        for(int i = 0; i < n; i++) {
            temp[i] = nums[i];
        }
        Arrays.sort(temp, (a, b) -> {
            if(freq[a + 100] == freq[b + 100]) return Integer.compare(b, a);
            return Integer.compare(freq[a + 100], freq[b + 100]);
        });
        for(int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3};
        System.out.println(Arrays.toString(sortByFrequency(nums)));
    }
}
