public class binaryToDecimal{
    public static int binToDec(int binary){
        int pow = 0;
        int decimal = 0;
        while(binary > 0){
            int lastDigit = binary % 10 ;
            decimal = decimal + (int)(lastDigit*Math.pow(2, pow));
            pow++;
            binary = binary / 10;
        }
        return decimal;
    }
    public static void main(String args[]){
        int binary = 1111;
        int decimal = binToDec(binary);
        System.out.print(decimal);
    }
}