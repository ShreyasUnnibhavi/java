public class BSin2DArray {
    public static void binarySearch(int[][] nums, int target) {
        int m = nums.length;
        int n = nums[0].length;
        int left = 0;
        int right = m*n-1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int i = mid / n;
            int j = mid % n;
            if(nums[i][j] == target) {
                System.out.println(i + " " + j);
                return;
            }
            else if(nums[i][j] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
    }
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int target = 5;
        binarySearch(array, target);
    }
}
