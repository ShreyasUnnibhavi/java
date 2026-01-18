import java.util.ArrayList;

public class ContainerWithMostWater2 {
    public static void maxContainerBrute(ArrayList<Integer> height){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<height.size(); i++){
            for(int j=i+1; j<height.size(); j++){
                int width = j - i;
                int length = Math.min(height.get(i),height.get(j));
                int area = length * width;
                max = Math.max(max, area);
            }
        }
        System.out.println(max);
    }
    public static void maxContainer2Pointer(ArrayList<Integer> height){
        int left = 0;
        int right = height.size() - 1;
        int max = 0;
        while(left < right){
            int hLeft = height.get(left);
            int hRight = height.get(right);
            int width = right - left;
            int length = Math.min(hLeft, hRight);
            int area = length * width;
            max = Math.max(max, area);
            if(hLeft < hRight){
                while(left < right && height.get(left) <= length) left++;
            }else{
                while(left < right && height.get(right) <= length) right--;
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        //1, 8, 6, 2, 5, 4, 8, 3, 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        maxContainerBrute(height);
        maxContainer2Pointer(height);
    }
}
