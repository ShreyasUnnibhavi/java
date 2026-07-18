public class QuickSort {
    public static void print(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
    public static int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        int i = low, j = high;
        while(i < j) {
            while(nums[i] <= pivot && i < high) i++;
            while(nums[j] > pivot && j > low) j--;
            if(i < j) swap(nums, i, j);
        }
        swap(nums, low, j);
        return j;
    }
    public static void sort(int[] nums, int low, int high) {
        if(low < high) {
            int pIdx = partition(nums, low, high);
            sort(nums, low, pIdx - 1);
            sort(nums, pIdx + 1, high);
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 5, 1, 7, 9, 2, 4, -2};
        sort(nums, 0, nums.length-1);
        print(nums);
    }
}
