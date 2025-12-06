public class reverseArray {
    public static void ReverseArray(int array[]){
        int start = 0, end = array.length - 1;
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
    public static void main(String args[]){
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        ReverseArray(array);
    }
}
