import java.util.Arrays;

public class FairCandySwap {
    public static boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start +  (end - start) / 2;
            if(nums[mid] == target) return true;
            else if(nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return false;
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        for(int num : aliceSizes) sumA += num;
        int sumB = 0;
        for(int num : bobSizes) sumB += num;
        Arrays.sort(bobSizes);
        int delta = (sumB - sumA) / 2;
        for(int x : aliceSizes) {
            int targetY = x + delta;
            if(binarySearch(bobSizes, targetY)) return new int[] {x, targetY};
        }
        return new int[] {0};
    }
    public static void main(String[] args) {
        int[] aliceSizes = {1, 2};
        int[] bobSizes = {2, 3};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }
}
