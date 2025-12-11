public class rainwater2 {
    public static void calculateWaterVolume(int height[]){
        int n = height.length;
        int leftMax[] = new int[n];   
        leftMax[0] = height[0];         //The left most building height remains the maximum in the beginning
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        int water = 0;

        //calculating left side maximum array
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        //calculating right side maximum array
        for(int i = n-2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        //calculating water collected
        for(int i = 0; i < n; i++){
                water = water + Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        System.out.print("Water collected: " + water);
    }
    public static void main(String args[]){
        int height[] = {4,2,0,3,2,5};
        calculateWaterVolume(height);
    }
}
