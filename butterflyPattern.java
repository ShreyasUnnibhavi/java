public class butterflyPattern{
    public static void main(String args[]){
        int n = 4;
        for(int i = 1; i <= n; i++) {
            //!stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            //!spaces
            for(int j = 1; j <= (n-i)*2; j++) {
                System.out.print("  ");
            }

            //!stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--) {
            //!stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            //!spaces
            for(int j = 1; j <= (n-i)*2; j++) {
                System.out.print("  ");
            }

            //!stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}