import java.util.Arrays;

public class RepeatedAndMissing {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int count[] = new int[n*n + 1];
        int ret[] = new int[2];
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                count[grid[i][j]]++;
            }
        }
        for(int i = 1; i < count.length; i++){
            if(count[i] > 1){
                ret[0] = i;
            }else if(count[i] == 0){
                ret[1] = i;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        int grid[][] = {{9,1,7},{8,9,2},{3,4,6}};
        RepeatedAndMissing obj = new RepeatedAndMissing();
        int[] result = obj.findMissingAndRepeatedValues(grid);
        System.out.println(Arrays.toString(result));
    }
}