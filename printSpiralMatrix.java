public class printSpiralMatrix {
    public static void Print(int array[][]){
        int startRow = 0, startCol = 0; 
        int endRow = array.length-1, endCol = array[0].length-1;
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int i = startCol; i <= endCol; i++){
                System.out.print(array[startRow][i] + " ");
            }

            //right
            for(int i = startRow+1; i <= endRow; i++){
                System.out.print(array[i][endCol] + " ");
            }

            //bottom
            for(int i = endCol-1; i >= startCol; i--){
                if(startRow == endRow) break;
                System.out.print(array[endRow][i] + " ");
            }

            //left
            for(int i = endRow-1; i >= startRow+1; i--){
                if(startCol == endCol) break;
                System.out.print(array[i][startCol] + " ");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String args[]){
        int array[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20}
        };
        Print(array);
    }
}
