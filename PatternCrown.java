public class PatternCrown {
    public static void crown(int length, int height) {
        for(int i = 0; i < height; i++) {
            //* Tope star row (i == 0)
            if(i == 0) {
                for(int j = 0; j < length; j++) {
                    if(j == 0 || j == length/2 || j == length-1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            //! Penultimate row
            else if(i == height-2) {
                for(int j = 0; j < length; j++) 
                    System.out.print("|");
            }
            //! Last row
            else if(i == height-1) {
                for(int j = 0; j < length; j++)
                    System.out.print("*");
            }
            //& growing rows
            else {
                //^ Left horizontal bars
                for(int j = 0; j < i; j ++)
                    System.out.print("|");
                //^ Left spaces
                for(int j = 0; j < (height-1)-(i-1)*2; j++)
                    System.out.print(" ");
                //^ Middle horizontal bars
                for(int j = 0; j < (i-1)*2+1; j++)
                    System.out.print("|");
                //^ Right spaces
                for(int j = 0; j < (height-1)-(i-1)*2; j++)
                    System.out.print(" ");
                //^ Right horizontal bars
                for(int j = 0; j < i; j++)
                    System.out.print("|");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int length = 13;
        int height = 6;
        crown(length, height);
    }
}