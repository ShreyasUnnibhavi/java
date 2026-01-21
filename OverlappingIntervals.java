import java.util.*;
class Solution {
    public int[][] mergeIntervals(int intervals[][]){
        if(intervals.length <= 1) return intervals;
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        List<int[]> result = new ArrayList<>();
        while(!list.isEmpty()){
            int current[] = list.remove(0);
            
            for(int i = 0; i < list.size(); i++){
                int other[] = list.get(i);

                if(Math.max(current[0], other[0]) <= Math.min(current[1], other[1])){
                    current = new int[]{Math.min(current[0], other[0]) , Math.max(current[1], other[1])};
                    list.remove(i);
                    i--;
                }
            }
            result.add(current);
        }
        return result.toArray(new int[list.size()][]);
    }
    public static void main(String[] args) {
        int intervals[][] = {{2,6},{1,3},{15,18},{8,10}};
        Solution sol = new Solution();
        intervals = sol.mergeIntervals(intervals);
        for(int i = 0; i < intervals.length; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(intervals[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
