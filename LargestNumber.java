import java.util.Arrays;

public class LargestNumber {
    public static String largestNumber(int[] nums) {
        int n = nums.length;
        String[] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(str, (a, b) -> {
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);
        });
        if(str[0].equals("0")) return "0";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            sb.append(str[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(nums));
    }
}
