public class arrayPractice {
    public static int checkTarget(int nums[], int target){
        int mid = 0;
        for(int i = 1; i < nums.length-1; i++){
            if(nums[i] > nums[i+1] && nums[i] > nums[i-1]){
                mid = i;
            }
        }
        int start = 0;
        int end = nums.length-1;
        while(start < end){
            if(nums[mid] == target){
                return mid;
            }else if(target > nums[end]){
                end = mid-1;
            }else if(target < nums[start]){
                start = mid+1;
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }
    public static void main(String args[]){
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 9;
        System.out.print(checkTarget(nums,target));
    }
}
