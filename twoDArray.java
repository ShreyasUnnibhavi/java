import java.util.*;
public class twoDArray {
    public static void largestSmallest(int array[][]){
        int largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j] > largest) largest = array[i][j];
                if(array[i][j] < smallest) smallest = array[i][j];
            }
        }
        System.out.print("largest = " + largest + " Smallest = " + smallest);
    }
    public static void main(String args[]){
        int array[][] = new int[3][3];
        int n = array.length, m = array[0].length;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the elements: \n");
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                    array[i][j] = sc.nextInt();
                }
            }
        }
        largestSmallest(array);
    }
}
