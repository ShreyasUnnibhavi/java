public class spiralMatrix {
    public static void printSpiralMatrix(int array[][]){
        int startRow = 0,
        startCol = 0,
        endRow = array.length - 1,
        endCol = array[0].length - 1;
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(array[startRow][j] + " ");
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(array[i][endCol] + " ");
            }

            //bottom
            for(int j=endCol-1; j>=startCol; j--){
                if(startCol == endCol){break;}
                System.out.print(array[endRow][j] + " ");
            }

            //left
            for(int i=endRow-1; i>=startRow+1; i--){
                if(startRow == endRow){break;}
                System.out.print(array[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String args[]){
        int array[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
            // {13,14,15,16}
        };
        printSpiralMatrix(array);
    }
}
