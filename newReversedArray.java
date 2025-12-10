import java.util.*;

public class newReversedArray {
    public static void reverseArray(int array[]){
        int revArray[] = new int[array.length];
        for(int i = 0; i < array.length; i++){
            revArray[i] = array[array.length - i - 1];
        }
        for(int i = 0; i < array.length; i++){
            System.out.print(revArray[i] + " ");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        reverseArray(array);
    }
}
