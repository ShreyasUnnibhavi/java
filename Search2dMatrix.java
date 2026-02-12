public class Search2dMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n * m - 1;

        while(left <= right) {
            int mid = right - (right - left)/2;
            int row = mid / n;
            int col = mid % n;
            if(matrix[row][col] == target) 
                return true;
            else if(target > matrix[row][col])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{0,3,5,7},{10,11,16,20},{23,30,34,60}}, target = 100;
        System.out.println(searchMatrix(matrix, target));
    }
}
