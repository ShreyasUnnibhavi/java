public class MinimizeSweetness {
    //1, 2, 3, 4, 5, 6, 7, 8, 9
    public static boolean canSplit(int[] nums, int limit, int k) {
        int currSum = 0;
        int count = 0;
        for(int num : nums) {
            if(currSum + num >= limit) {
                count++;
                currSum = 0;
            } else {
                currSum += num;
            }
        }
        return count >= k;
    }
    public static int minimizeSweetness(int[] sweetness, int k) {
        k++;
        int min = 0;
        int sum = 0;
        for(int sweet : sweetness) {
            min = Math.min(min, sweet);
            sum += sweet;
        }
        int start = min;
        int end = sum;
        int ans = 0;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(canSplit(sweetness, mid, k)) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] sweetness = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 5;
        System.out.println(minimizeSweetness(sweetness, k));
    }
}