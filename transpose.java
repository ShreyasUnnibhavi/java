public class transpose {
    public static void findTranspose(int matrix[][]){
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                transpose[i][j] = matrix[j][i]; 
            }
        }
        printMatrix(transpose);
    }
    public static void printMatrix(int transpose[][]){
        for(int i=0; i<transpose.length; i++){
            for(int j=0; j<transpose[0].length; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][] = {
            {1,2,3},
            {4,5,6}
        };
        printMatrix(matrix);
        findTranspose(matrix);
    }
}
