import java.util.*;
public class evenOddSum {
    public static void main(String args[]){
        int evenSum = 0;
        int oddSum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of integers you want to enter:");
            int n = sc.nextInt();
            for(int i=0; i<n; i++){
                int num = sc.nextInt();
                if(num%2==0){
                    evenSum = evenSum + num ;
                }else{
                    oddSum = oddSum + num ;
                }
            }
        }
        System.out.print("Sum of even integers: "+ evenSum +"\nSum of odd integers: " + oddSum);
    }
}
