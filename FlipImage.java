public class FlipImage {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i]^1;
        nums[i] = nums[j]^1;
        nums[j] = temp;
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i = 0; i < n; i++) {
            int start = 0, end = n-1;
            while(start <= end) {
                swap(image[i], start, end);
                start++;
                end--;
            }
        }
        return image;
    }
    public static void main(String[] args) {
        int[][] image = {
            {1, 1, 0},
            {0, 1, 0},
            {0, 0, 1}
        };
        flipAndInvertImage(image);
        for(int i = 0; i < image.length; i++) {
            for(int j = 0; j < image.length; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
}
