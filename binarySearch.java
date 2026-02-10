public class binarySearch{
    public static int findKey(int array[], int key){
        int start = 0;
        int end = array.length-1;
        while(start <= end){
            int mid =  start + (end - start)/2;
            if(array[mid] == key)
                return mid;
            else if(array[mid] < key)
                start = mid + 1;
            else if(array[mid] > key)
                end = mid - 1;
        }
        return -1;
    }
    public static void main(String args[]){
        int array[] = {0,1,2,3,4,5,6,7,8,9,10};
        int key = 9;
        System.out.print("The key is at pos " + findKey(array,key));
    }
}