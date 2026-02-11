public class printSpiralMatrix {
    public static void Print(int array[][]){
        int sr = 0, er = array.length - 1;
        int sc = 0, ec = array[0].length - 1;

        while(sr <= er && sc <= ec) {
            //! TOP
            for(int i = sc; i <= ec; i++) {
                System.out.print(array[sr][i] + ", ");
            }

            //! RIGHT
            for(int i = sr+1; i <= er; i++) {
                System.out.print(array[i][ec] + ", ");
            }

            //! BOTTOM
            if(sr < er) {
                for(int i = ec-1; i >= sc; i--) {
                    System.out.print(array[er][i] + ", ");
                }
            }

            //! LEFT
            if(sc < ec) {
                for(int i = er-1; i > sr; i--) {
                    System.out.print(array[i][sc] + ", ");
                }
            }

            sr++;
            er--;
            sc++;
            ec--;
        }
    }
    public static void main(String args[]){
        int array[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20},
            {21, 22, 23, 25}
        };
        Print(array);
    }
}
