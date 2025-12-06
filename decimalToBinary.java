public class decimalToBinary {
    public static int decToBin(int num) {
        int pow = 0;
        int binary = 0;

        while (num != 0) {
            int remainder = num % 2;
            binary = binary + remainder * (int)Math.pow(10, pow);
            pow++;
            num = num / 2;
        }
        return binary;
    }

    public static void main(String args[]) {
        int num = 4;
        int binary = decToBin(num);
        System.out.println("The binary value of " + num + " is " + binary);
    }
}
