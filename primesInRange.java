import java.util.*;

public class primesInRange{
    public static void findPrimes(int sn, int en){
        for(int i = sn; i <= en; i++){
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    break;
                }else{
                    System.out.println(i);
                }
            }
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