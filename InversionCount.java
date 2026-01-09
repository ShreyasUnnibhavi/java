public class InversionCount {
    public static int count(int nums[]){
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            int j = i+1;
            while(j < nums.length){
                if(nums[j] < nums[i]){
                    count++;
                }
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        System.out.println(count(arr));
    }
}
