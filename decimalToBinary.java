import java.util.*;

public class decimalToBinary{
    public static int generateBinary(int num){
        int binary = 0;
        int placeValue = 1;
        while(num > 0) {
            int rem = num % 2;
            binary = binary + (rem * placeValue);
            num = num / 2;
            placeValue *= 10;
        }
        return binary;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        System.out.print(generateBinary(num));
    }
}