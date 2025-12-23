// import java.util.*;
public class sorting {
    public static void bubbleSort(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<nums.length-1-i; j++){
                //Descending order
                if(nums[j] < nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
                //Ascending order
                // if(nums[j] > nums[j+1]){
                //     int temp = nums[j];
                //     nums[j] = nums[j+1];
                //     nums[j+1] = temp;
                // }
            }
        }
    }
    public static void selectionSort(int nums[]){
        for(int i=0; i<nums.length-1; i++){
            int min = i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] > nums[j]) min = j;
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }
    //nums[] = {3,6,2,1,8,7,4,5,3,1};
    public static void insertionSort(int nums[]){
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i] < nums[j]){
                    int tempo = nums[j];
                    nums[j] = nums[i];
                    nums[i] = tempo;
                }
            }
        }
    }
    public static void countingSort(int nums[]) {
    // Step 1: Find the largest number
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        // Step 2: Create count array
        int count[] = new int[largest + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        // Step 3: Rebuild the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[index] = i;
                index++;
                count[i]--;
            }
        }
    }

    public static void printArray(int nums[]){
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String args[]){
        int nums[] = {3,6,2,1,8,7,4,5,3,1};
        // Arrays.sort(nums,0,3);
        // bubbleSort(nums);
        // selectionSort(nums);
        insertionSort(nums);
        // countingSort(nums);
        printArray(nums);
    }
}
