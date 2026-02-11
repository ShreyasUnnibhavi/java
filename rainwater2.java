public class rainwater2{
    public static int trap(int[] height) {
        int res = 0;
        int left = 1, right = height.length-2;
        int maxL = height[left], maxR = height[right];

        while(left < right) {
            if(height[left] < height[right]) {
                left++;
                maxL = Math.max(maxL, height[left]);
                res += maxL - height[left];
            }else {
                right--;
                maxR = Math.max(maxR, height[right]);
                res += maxR - height[right];
            }
        }
        return res;
    }
    public static void main(String args[]) {
        int heights[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.print(trap(heights));
    }
}