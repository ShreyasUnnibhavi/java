import java.util.Scanner;

public class LCMandHCF {
    public static int findHCF (int a, int b) {
        while(b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("LCM: " + Math.abs(num1*num2/findHCF(num1, num2)));
        System.out.println(findHCF(num1, num2));
    }
}
