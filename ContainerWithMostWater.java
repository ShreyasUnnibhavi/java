public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left < right) {
            int hLeft = height[left];
            int hRight = height[right];
            int length = Math.min(hLeft, hRight);
            int width = right - left;
            int currArea = length * width;
            maxArea = Math.max(maxArea, currArea);
            if(hLeft < hRight) {
                while(left < right && length >= height[left])
                    left++;
            }else {
                while(left < right && length >= height[right])
                    right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4};
        System.out.println(maxArea(height));
    }
}
