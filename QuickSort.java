public class QuickSort {
    public static void print(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void sort(int[] nums, int low, int high) {
        if(low >= high) {
            return;
        }
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = nums[m];
        while(s <= e) {
            while(nums[s] < pivot) {
                s++;
            }
            while(nums[e] > pivot) {
                e--;
            }
            if(s <= e) {
                int temp = nums[s];
                nums[s++] = nums[e];
                nums[e--] = temp;
            }
        }
        sort(nums, low, e);
        sort(nums, s, high);
    }

    public static void main(String[] args) {
        int nums[] = {2, 5, 1, 7, 9, 2, 4, -2};
        sort(nums, 0, nums.length-1);
        print(nums);
    }
}
