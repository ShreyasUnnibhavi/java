public class InversionCount {
    private static int merge(int nums[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;         //! iterator for left half
        int j = mid + 1;    //! iterator for right half
        int k = 0;          //! iterator for temporary array
        int inversions = 0;

        while(i <= mid && j <= ei) {
            if(nums[i] <= nums[j])
                temp[k++] = nums[i++];
            else {
                temp[k++] = nums[j++];
                inversions += mid - i + 1;
            }
        }

        while(i <= mid)
            temp[k++] = nums[i++];
        while(j <= ei)
            temp[k++] = nums[j++];

        for(i = si, k = 0; k < temp.length; i++, k++) 
            nums[i] = temp[k];

        return inversions;
    }
    private static int sort(int nums[], int si, int ei) {
        //& Base case
        if(si >= ei) {
            return 0;
        }
        //& Recursion
        int inversions = 0;
        int mid = si + (ei - si)/2;

        inversions += sort(nums, si, mid);
        inversions += sort(nums, mid+1, ei);
        inversions += merge(nums, si, mid, ei);
        
        return inversions;
    }
    public static int count(int arr[]) {
        return sort(arr, 0, arr.length-1);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,1,3,5};
        System.out.println(count(arr));
    }
}
