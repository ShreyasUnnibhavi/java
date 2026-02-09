public class hollowRhombusPattern{
    public static void main(String args[]){
        int n = 5;
        for(int i = 1; i <= n; i++) {
            //!spaces
            for(int j = n-1; j >= i; j--) {
                System.out.print("  ");
            }
            
            //!stars
            for(int j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}