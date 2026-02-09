public class pattern3{
    public static void main(String args[]){
        int n = 4;
        for(int i = 1; i <= n; i++) {
            //! white space
            for(int j = n-1; j >= i; j--) {
                System.out.print("  ");
            }

            //! stars
            for(int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}