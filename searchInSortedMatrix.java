public class searchInSortedMatrix {
    public static void search(int[][] matrix, int key) {
        int row = 0, col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0) {
            if(key == matrix[row][col]) {
                System.out.println("Key is at index [" + row + ", " + col + "]");
                return;
            }
            else if(key > matrix[row][col])
                row++;
            else
                col--;
        }
        System.out.println("Key does not exist");
    }
    public static void main(String args[]){
        int matrix[][] = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        search(matrix,10);
    }
}
