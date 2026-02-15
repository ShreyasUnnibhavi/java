public class sorting{
    public static void printSortedArray(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void swap(int nums[], int i, int j) {
        if(nums[j] < nums[i]) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }
    //* BUBBLE SORT
    public static void bubbleSort(int nums[]) {
        boolean swap = false;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 1; j < nums.length - i; j++) {
                swap(nums, j, j-1);
                swap = true;
            }
            if(swap == false)
                return;    
        }
    }

    //* SELECTION SORT
    public static void selectionSort(int nums[]) {
        for(int i = 0; i < nums.length-1; i++) {
            int min = i;
            for(int j = i+1; j < nums.length; j++) {
                if(nums[j] < nums[min])
                    min = j;
            }
            swap(nums, i, min);
        }
    }

    //* INSERTION SORT
    public static void insertionSort(int nums[]) {
        for(int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > key) {
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }

    //* COUNTING SORT
    public static void countingSort(int nums[]) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int count[] = new int[max+1];
        for(int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int j = 0;
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {3, 5, 0, 1, 7, 9, 2};
        // bubbleSort(nums);
        // selectionSort(nums);
        // insertionSort(nums);
        countingSort(nums);
        printSortedArray(nums);
    }
}