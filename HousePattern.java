public class HousePattern {
    public static void main(String[] args) {
        int n = 5; 

        // Part 1: The Pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Part 2: The Hollow Base
        int width = 2 * n - 1; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == n || j == 1 || j == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}