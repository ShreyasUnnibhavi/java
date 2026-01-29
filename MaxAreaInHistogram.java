import java.util.Stack;
public class MaxAreaInHistogram {
    public static void nextSmallerRight(int array[], int res[]){
        Stack<Integer> s = new Stack<>();
        for(int i = array.length-1; i >= 0; i--){
            int curr = array[i];
            while(!s.isEmpty() && curr <= array[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                res[i] = array.length;
            }else{
                res[i] = s.peek();
            }
            s.push(i);
        }
    }
    public static void nextSmallerLeft(int array[], int res[]){
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < array.length; i++){
            int curr = array[i];
            while(!s.isEmpty() && curr <= array[s.peek()]){
                s.pop();
            }

            if(s.isEmpty()){
                res[i] = -1;
            }else{
                res[i] = s.peek();
            }
            s.push(i);
        }
    }
    public static int maxArea(int height[]){
        int smallRight[] = new int[height.length];
        nextSmallerRight(height, smallRight);
        int smallLeft[] = new int[height.length];
        nextSmallerLeft(height, smallLeft);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < height.length; i++){
            int width = smallRight[i] - smallLeft[i] - 1; 
            int area = height[i] * width;
            if(area > max){
                max = area;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int height[] = {2, 1, 5, 6, 2, 3};
        System.out.println(maxArea(height));
    }
}
