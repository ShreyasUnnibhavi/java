// public class binaryToDecimal{
//     public static int binToDec(int binary){
//         int pow = 0;
//         int decimal = 0;
//         while(binary > 0){
//             int lastDigit = binary % 10 ;
//             decimal = decimal + (int)(lastDigit*Math.pow(2, pow));
//             pow++;
//             binary = binary / 10;
//         }
//         return decimal;
//     }
//     public static void main(String args[]){
//         int binary = 1111;
//         int decimal = binToDec(binary);
//         System.out.print(decimal);
//     }
// }

import java.util.*;

public class binaryToDecimal{
    public static int generateDecimal(int num){
        int sum = 0;
        int count = 0;
        while(num > 0){
            int n = num % 10;
            sum = (int)(sum + n*(Math.pow(2,count)));
            count++;
            num = num / 10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        int binary = sc.nextInt();
        System.out.print(generateDecimal(binary));
    }
}