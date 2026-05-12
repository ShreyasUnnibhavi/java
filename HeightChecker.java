public class HeightChecker {
    public static int heightChecker(int[] heights) {
        int[] frequency = new int[101];
        for(int height : heights) {
            frequency[height]++;
        }
        int n = heights.length;
        int[] expected = new int[n];
        int j = 0;
        for(int i = 0; i < 101; i++) {
            while(frequency[i] > 0) {
                expected[j++] = i;
                frequency[i]--;
            }
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(heights[i] != expected[i]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,4,2,1,3};
        System.out.println(heightChecker(nums));
    }
}
