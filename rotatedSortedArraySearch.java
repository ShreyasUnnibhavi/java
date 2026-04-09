public class rotatedSortedArraySearch {
    public static int findkey(int[] array, int key) {
        int left = 0;
        int right = array.length-1;
        while(left <= right) {
            int mid = right - (right-left)/2;
            if(key == array[mid]) {
                return mid;
            }
            // Case 1: If left half is sorted
            if(array[left] <= array[mid]) {
                if(key >= array[left] && key <= array[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            //Case 2: Right half is sorted
            else {
                if(key <= array[right] && key >= array[mid])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[] = {5, 6, 7, 8, 9, 1, 2};
        int key = 22;
        int position = findkey(array, key);
        if(position == -1)
            System.out.println("The key does not exist");
        else
            System.out.println("The key is at index " + position);
    }
}