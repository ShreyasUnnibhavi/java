import java.util.*;
public class calculator {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.print("Enter the operation you want to perform(+,-,*,/): ");
            char operation = sc.next().charAt(0);
            switch(operation){
                case '+' : System.out.print(a + b);
                            break;
                case '-' : System.out.print(a - b);
                            break;
                case '*' : System.out.print(a * b);
                            break;
                case '/' : System.out.print(a / b);
                            break;
                default: System.out.print("Invalid operator");
            }
        }
    }
}
