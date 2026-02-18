public class QuickSort {
    public static void print(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int partition(int nums[], int si, int ei) {
        int pivot = nums[ei];
        int i = si - 1;
        for(int j = si; j < ei; j++) {
            if(nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        i++;
        swap(nums, i, ei);
        return i;
    }
    public static void sort(int nums[], int si, int ei) {
        //^ Base case
        if(si >= ei)
            return;

        //^ Recursion
        int pivot = partition(nums, si, ei);    //* finding the pivot element and putting all smaller numbers to its left
        sort(nums, si, pivot-1);                //* Sort left half (pivot excluded)
        sort(nums, pivot+1, ei);                //* Sort right half (pivot excluded)
    }

    public static void main(String[] args) {
        int nums[] = {2, 5, 1, 7, 9, 2, 4, -2};
        sort(nums, 0, nums.length-1);
        print(nums);
    }
}
