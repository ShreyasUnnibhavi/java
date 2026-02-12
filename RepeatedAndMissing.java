import java.util.Arrays;

public class RepeatedAndMissing {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int check[] = new int[n*n+1];
        int pair[] = new int[2];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                check[grid[i][j]]++;
            }
        }

        for(int i = 1; i < check.length; i++) {
            if(check[i] > 1) 
                pair[0] = i;    //? Repeated numbner
            else if(check[i] == 0) 
                pair[1] = i;    //? Missing number
        }

        return pair;
    }

    public static void main(String[] args) {
        int grid[][] = {{9,1,7},{8,9,2},{3,4,6}};
        RepeatedAndMissing obj = new RepeatedAndMissing();
        int[] result = obj.findMissingAndRepeatedValues(grid);
        System.out.println(Arrays.toString(result));
    }
}