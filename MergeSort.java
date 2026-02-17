public class MergeSort {
    public static void print(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void merge(int nums[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;         //^ Iterator for left half
        int j = mid + 1;    //^ Iterator for right half
        int k = 0;          //^ Iterator for temporary array

        //& comparing numbers from left and right arrays and adding in temp array
        while(i <= mid && j <= ei) {
            if(nums[i] < nums[j]) 
                temp[k++] = nums[i++];  
            else
                temp[k++] = nums[j++];
        }

        while(i <= mid)
            temp[k++] = nums[i++];  //* if numbers remain in left half
        while(j <= ei)
            temp[k++] = nums[j++];  //* if numbers remain in right half

        for(k = 0, i = si; k < temp.length; i++, k++) {
            nums[i] = temp[k];      //* Updating the main array(nums)
        }
    }
    public static void sort(int nums[], int si, int ei) {
        //! Base case
        if(si >= ei) {
            return;
        }
        //! Recursion
        int mid = si + (ei - si)/2;
        
        sort(nums, 0, mid);
        sort(nums, mid+1, ei);
        merge(nums, si, mid, ei);
    }
    public static void main(String[] args) {
        int nums[] = {2, 6, 1, 9, 4, 7};
        sort(nums,0,nums.length-1);
        print(nums);
    }
}
