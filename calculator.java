import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
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
