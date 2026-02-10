import java.util.Arrays;
public class appearTwice{
    public static boolean checkForRepeat(int nums[]){
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4};
        Arrays.sort(nums);
        if(checkForRepeat(nums)){
            System.out.print("There is repetion");
        }else{
            System.out.print("There is no repetion");
        }
    }
}