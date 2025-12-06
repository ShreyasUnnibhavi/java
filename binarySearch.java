public class binarySearch {
    public static int BinarySearch(int numbers[], int key){
        int start = 0; 
        int end = numbers.length - 1;
        int mid = numbers.length/2;
        while(start <= end){
            mid = (start + end)/2; 
            if(key == numbers[mid]){
                return mid ;
            }else if(key > numbers[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7,8,9};
        int key = 10;
        int index = BinarySearch(numbers, key);
        System.out.print(key + " is in "+ index +"th index");
    }
}
