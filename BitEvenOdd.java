import java.util.*;
public class BitEvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  number: ");
        long num = sc.nextLong();
        if((num & 1) == 1){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
}
