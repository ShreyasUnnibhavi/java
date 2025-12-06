public class searchInSortedMatrix {
    public static void search(int matrix[][], int key){
        int n = matrix.length;
        int row = n-1, column = 0;
        while(key != matrix[row][column]){
            if(key > matrix[row][column]){
                column++;
            }else{
                row--;
            }
        }
        System.out.print(row + " " + column);
    }
    public static void main(String args[]){
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        search(matrix,32);
    }
}
