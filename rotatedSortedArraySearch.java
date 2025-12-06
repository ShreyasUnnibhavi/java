public class rotatedSortedArraySearch {
    public static int search(int array[], int target){
        int left = 0;
        int right = array.length-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(array[mid] == target){
                return mid;
            }
            if(array[left] <= array[mid]){
                if(target >= array[left] && target < array[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }else {
                if(target > array[mid] && target <= array[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }return -1;
    }
    public static void main(String args[]){
        int array[] = {5, 6, 7, 8, 9, 1, 2, 3, 4};
        System.out.print(search(array, 4));
    }
}
