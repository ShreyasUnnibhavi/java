import java.util.*;

public class palindrome{
    public static void check(int n){
        int stay = n;
        int comp;
        int sum = 0;
        while(n > 0){
            comp = n % 10;
            sum = sum*10 + comp;
            n = n / 10;
        }
        if(sum == stay){
            System.out.print("Its a palindrome");
        }else{
            System.out.print("It ain't a palindrome");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        check(n);
    }
}