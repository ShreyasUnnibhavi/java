public class InversionCount {
    private static int merge(int nums[], int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];
        int i = si;         //iterator for left part
        int j = mid + 1;    //iterator for right part
        int k = 0;          //iterator for temp
        int inversions = 0;
        
        while(i <= mid && j <= ei){
            if(nums[i] <= nums[j]){
                temp[k++] = nums[i++];
            }else{
                temp[k++] = nums[j++];
                inversions += mid - i + 1;
            }
        }
        while(i <= mid) temp[k++] = nums[i++];
        while(j <= ei) temp[k++] = nums[j++];

        for(i = si, k = 0; k < temp.length; i++, k++){
            nums[i] = temp[k];
        }
        return inversions;
    }
    private static int mergeSort(int nums[], int si, int ei){
        int inversions = 0;

        int mid = si + (ei - si)/2;
        if(si < ei){
            inversions += mergeSort(nums, si, mid);
            inversions += mergeSort(nums, mid + 1, ei);
            inversions += merge(nums, si, mid, ei);
        }
        
        return inversions;
    }
    public static int count(int nums[]){
        return mergeSort(nums, 0, nums.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        System.out.println(count(arr));
    }
}
