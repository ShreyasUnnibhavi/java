import java.util.Stack;

public class TrappingRainwater {
    public static int calculateWater(int height[]){
        Stack<Integer> s = new Stack<>();
        int water = 0;

        for(int i = 0; i < height.length; i++){
            while(!s.isEmpty() && height[i] > height[s.peek()]){
                int middle = s.pop();
                int leftWall = s.peek();
                int width = i - leftWall - 1;
                int h = Math.min(height[i], height[leftWall]) - height[middle];
                water = water + h*width;
            }
            s.push(i);
        }

        return water;
    }
    public static void main(String[] args) {
        int heights[] = {7, 0, 4, 2, 5, 0, 6, 4, 0, 5};
        System.out.println(calculateWater(heights));
    }
}
