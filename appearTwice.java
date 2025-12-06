import java.util.*;
public class appearTwice{
    public static boolean checkForTwice(int[] array){
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i] == array[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements: ");
            int n = sc.nextInt();
            System.out.println("Enter the elements: ");
            int array[] = new int[n];
            for(int i=0; i<n; i++){
                array[i] = sc.nextInt();
            }
            boolean res = checkForTwice(array);
            System.out.print(res);
        }
    }
}