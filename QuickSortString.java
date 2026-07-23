public class QuickSortString {
    public static void print(String arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(String arr[], int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(String arr[], int si, int ei) {
        String pivot = arr[si];
        int i = si, j = ei;
        while(i < j) {
            while(arr[i].compareTo(pivot) <= 0 && i < ei) i++;
            while(arr[j].compareTo(pivot) > 0 && j > si) j--;
            if(i < j) swap(arr, i, j);
        }
        swap(arr, si, j);
        return j;
    }
    public static void sort(String arr[], int si, int ei) {
        //! Base case
        if(si >= ei)
            return;

        //! Recursion
        int pivot = partition(arr, si, ei);
        sort(arr, si, pivot-1);
        sort(arr, pivot+1, ei);
    }
    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury", "zevra", "aaaa", "aba", "aca", "sss"};
        sort(arr,0,arr.length-1);
        print(arr);
    }
}
