import java.util.*;

public class practice_8_1 {
    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            if (a < 0) {
                System.out.print("Negative number");
            } else {
                System.out.print("Positive number");
            }
        }
    }
}
