public class amazonPractice1 {
    public static int removeDuplicates(int nums[]){
        int k = 0;

        for(int i = 1; i < nums.length; i++){
            if(nums[k] < nums[i]){
                int temp = nums[i];
                nums[i] = nums[k+1];
                nums[k+1] = temp;
                k++;
            }
        }

        return k+1;
    }
    public static void main(String args[]){
        int nums[] = {0,1,1,1,2,2,3};
        System.out.print(removeDuplicates(nums));
    }
}
