import java.util.*;

public class primesInRange{
    public static void findPrimes(int sn, int en){
        for(int i = sn; i <= en; i++){
            int j = 2;
            boolean isPrime = true;
            while(j <= Math.sqrt(i)) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
                j++;
            }
            if(isPrime && i > 1)
                System.out.println(i);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int sn = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int en = sc.nextInt();
        findPrimes(sn,en);
    }
}