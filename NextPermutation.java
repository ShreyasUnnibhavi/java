public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                int j = nums.length-1;
                while(j > i){
                    if(nums[j] > nums[i]){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                    j--;
                }
                int k = nums.length-1;
                reverse(nums,i+1,k);
                break;
            }else if(i == 0){
                int k = nums.length-1;
                reverse(nums,i,k);
                break;
            }
        }
        printNums(nums);
    }
    static void reverse(int nums[], int i, int k){
        while(i < k){
            int temp = nums[k];
            nums[k] = nums[i];
            nums[i] = temp;
            k--;
            i++;
        }
    }
    static void printNums(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        nextPermutation(nums);
    }
}
