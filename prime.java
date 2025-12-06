import java.util.*;

public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num == 2){
            System.out.print("Prime number");
        }
        boolean isPrime = true;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if((num % i) == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime == false){
            System.out.print("Not prime");
        }else{
            System.out.print("Prime");
        }
    }
}