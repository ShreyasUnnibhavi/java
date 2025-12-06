public class diagonalSum {
    public static void sum(int array[][]){
        int n = array.length;
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += array[i][i];
            if(i != n-1-i){
                sum += array[i][n-1-i];
            }
        }
        System.out.print(sum);
    }
    public static void main(String args[]){
        int array[][] = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        sum(array);
    }
}
