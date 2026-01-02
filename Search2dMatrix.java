public class Search2dMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high = (rows*cols) - 1;
        while(low <= high){
            int mid = high - (high-low)/2;
            int midVal = matrix[mid/cols][mid%cols];
            if(target == midVal){
                return true;
            }else if(target < midVal){
                high = mid - 1;
            }else{
                low = low + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}}, target = 39;
        System.out.println(searchMatrix(matrix, target));
    }
}
