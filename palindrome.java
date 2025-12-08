// public class palindrome {
//     public static boolean palindromeCheck(int num){
//         int temp = num;
//         int sum = 0;
//         while(num > 0){
//             int f = num % 10 ;
//             sum = sum * 10 + f;
//             num = num / 10;
//         }
//         return temp == sum;
//     }
//     public static void main(String args[]){
//         int num = 324423;
//         boolean check = palindromeCheck(num);
//         System.out.print(check);
//     }
// }

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