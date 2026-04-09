import java.util.*;

public class palindrome{
    public static void isPalindrome(int num) {
        int temp = num;
        long rev = 0; // use long to handle integer overflow
        while(temp > 0) {
            rev = rev*10 + (temp % 10);
            temp /= 10;
        }
        if(rev == num) 
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        isPalindrome(n);
        sc.close();
    }
}