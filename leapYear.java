import java.util.*;

public class LeapYear {
    public static void main(String args[]) {
        System.out.print("Enter year: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.print("Leap year");
        } else {
            System.out.print("Not a leap year");
        }
    }
}
