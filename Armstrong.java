// Program to print all the 3 digit armstrong numbers
public class Armstrong {
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            sum = sum + rem*rem*rem;
            num = num/10;
        }

        return sum == original;
    }
    public static void main(String[] args) {
        for(int i = 100; i < 1000; i++) {
            if(isArmstrong(i))
                System.out.println(i);
        }
    }
}
