public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        // while(left < right){
        //     if(maxArea < (right-left)*Math.min(height[left],height[right])){
        //         maxArea = (right-left)*Math.min(height[left],height[right]);
        //     }
        //     if(height[left] < height[right]){
        //         while(left < right && height[left] < )
        //         left++;
        //     }else{
        //         right--;
        //     }
        // }

        //Optimized runtime
        while(left < right){
            int hLeft = height[left];
            int hRight = height[right];
            int currHeight = Math.min(hLeft,hRight);
            int currWidth = right - left;
            int currArea = currHeight * currWidth;
            maxArea = Math.max(maxArea, currArea);
            if(hLeft < hRight){
                while(left < right && height[left] <= currHeight)
                    left++;
            }else{
                while(left < right && height[right] <= currHeight)
                    right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
