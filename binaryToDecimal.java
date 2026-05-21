import java.util.*;

public class binaryToDecimal{
    public static int generateDecimal(int num){
        int sum = 0;
        int mul = 1;
        while(num > 0) {
            int temp = num % 10;
            sum = sum + temp * mul;
            mul = mul * 2;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();
        System.out.print(generateDecimal(binary));
    }
}