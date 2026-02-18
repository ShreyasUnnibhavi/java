public class MergeSortString {
    public static void print(String arr[]) {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei - si + 1];
        int i = si;
        int j = mid + 1; 
        int k = 0;

        while(i <= mid && j <= ei) {
            if(arr[i].compareTo(arr[j]) < 0) 
                temp[k++] = arr[i++];
            else
                temp[k++] = arr[j++];
        }

        while(i <= mid)
            temp[k++] = arr[i++];
        while(j <= ei)
            temp[k++] = arr[j++];

        for(k = 0, i = si; k < temp.length; i++, k++) 
            arr[i] = temp[k];
    }
    public static void sort(String arr[], int si, int ei) {
        //! Base case
        if(si >= ei)
            return;

        //! Recursion
        int mid = si + (ei - si)/2;
        sort(arr, si, mid);
        sort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury", "zevra", "aaaa", "aba", "aca", "sss"};
        sort(arr, 0, arr.length-1);
        print(arr);
    }
}
