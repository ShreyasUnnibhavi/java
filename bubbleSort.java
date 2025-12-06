public class bubbleSort {
    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - 1 - i; ++j) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Print array elements
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Add newline for clean output
    }

    // Main method to test sorting
    public static void main(String[] args) {
        int[] numbers = {4, 3, 1, 2, 5};
        bubblesort(numbers);
        printArray(numbers);
    }
}

