public class MergeSort {
    public static void sort(int nums[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;

        sort(nums, si, mid);        //sorting the left part
        sort(nums, mid+1, ei);      //sorting the right part
        merge(nums, si, mid, ei);   //merging left part and right part
    }
    public static void merge(int nums[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];
        int i = si;                 //iterator for left part
        int j = mid + 1;            //iterator for right part
        int k = 0;                  //iterator for temp
        while(i <= mid && j <= ei){
            if(nums[i] < nums[j]) temp[k++] = nums[i++];
            else temp[k++] = nums[j++];
        }
        while(i <= mid) temp[k++] = nums[i++];  //if elements remain in the left part
        while(j <= ei) temp[k++] = nums[j++];   //if elements remain in the right part

        for(k = 0, i = si; k < temp.length; k++, i++){
            nums[i] = temp[k];      //updating the original array
        }
        
    }
    public static void print(int nums[]){
         for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
         }   
    }
    public static void main(String[] args) {
        int nums[] = {2, 6, 1, 9, 4, 7};
        sort(nums,0,nums.length-1);
        print(nums);
    }
}
