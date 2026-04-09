import java.util.Scanner;

public class prime {
    public static boolean isPrime(int num) {
        if(num == 2)
            return true;
        else if(num == 0 || num == 1)
            return false;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(isPrime(num))
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
}