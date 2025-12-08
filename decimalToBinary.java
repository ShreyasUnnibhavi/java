// public class decimalToBinary {
//     public static int decToBin(int num) {
//         int pow = 0;
//         int binary = 0;

//         while (num != 0) {
//             int remainder = num % 2;
//             binary = binary + remainder * (int)Math.pow(10, pow);
//             pow++;
//             num = num / 2;
//         }
//         return binary;
//     }

//     public static void main(String args[]) {
//         int num = 4;
//         int binary = decToBin(num);
//         System.out.println("The binary value of " + num + " is " + binary);
//     }
// }

import java.util.*;

public class decimalToBinary{
    public static int generateBinary(int num){
        int temp = 0;
        int bin = 0;
        while(num > 0){
            int n = num % 2;
            temp = temp*10 + n;
            num = num / 2;
        }
        while(temp > 0){
            int m = temp % 10;
            bin = bin * 10 + m;
            temp = temp / 10;
        }
        return bin;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int num = sc.nextInt();
        System.out.print(generateBinary(num));
    }
}