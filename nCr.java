import java.util.*;
public class nCr{
    public static int factorial(int n){
        int fact = 1;
        for(int i=2; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static float calculate(int n, int r){
        float res = factorial(n)/(factorial(n-r)*factorial(r));
        return res;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        System.out.print(calculate(n,r));
    }
}