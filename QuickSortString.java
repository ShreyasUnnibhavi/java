public class QuickSortString {
    public static void print(String arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static int partition(String arr[], int si, int ei){
        String pivot = arr[ei];
        int i = si - 1; //to make space for strings smaller than pivot string
        for(int j = si; j < ei; j++){
            if(arr[j].compareTo(pivot) < 0){
                i++;
                //swap
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        //swap pivot element
        String temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void sort(String arr[], int si, int ei){
        if(si >= ei) return;

        int pIdx = partition(arr, si, ei);
        sort(arr, si, pIdx-1);
        sort(arr, pIdx+1, ei);
    }
    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury"};
        sort(arr,0,arr.length-1);
        print(arr);
    }
}
