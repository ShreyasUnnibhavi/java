public class QuickSort {
    public static void print(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void sort(int nums[], int si, int ei){
        if(si >= ei) return;
         
        int pIdx = partition(nums, si, ei);
        sort(nums, si, pIdx-1);
        sort(nums, pIdx+1, ei);
    }
    public static int partition(int nums[], int si, int ei){
        int pivot = nums[ei];
        int i = si - 1;     //iterator to make space for elements smaller than pivot element
        for(int j = si; j < ei; j++){
            if(nums[j] <= pivot){
                i++;
                //swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        i++;
        //swap the pivot element
        int temp = pivot;
        nums[ei] = nums[i];
        nums[i] = temp;
        return i;
    }
    public static void main(String[] args) {
        int nums[] = {2, 5, 1, 7, 9, 2, 4, -2};
        sort(nums, 0, nums.length-1);
        print(nums);
    }
}
