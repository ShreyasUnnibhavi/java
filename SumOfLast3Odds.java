import java.util.Scanner;
public class SumOfLast3Odds {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int sum = 0;
        while(count < 3 && num > 0) {
            int last = num % 10;
            if(last % 2 != 0) {
                sum += last;
                count++;
            }
            num /= 10;
        }
        if(count == 3) {
            System.out.println("Sum: " + sum);
        }else {
            System.out.println("The number of odd digits is not three");
        }
    }
}
