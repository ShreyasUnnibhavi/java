public class rainwater2{
    public static int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int maxL = 0, maxR = 0;
        int res = 0;
        while(left < right) {
            if(height[left] < height[right]) {
                if(height[left] > maxL) maxL = height[left];
                else res += maxL - height[left];
                left++;
            }else {
                if(height[right] > maxR) maxR = height[right];
                else res += maxR - height[right];
                right--;
            }
        }
        return res;
    }
    public static void main(String args[]) {
        int heights[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.print(trap(heights));
    }
}