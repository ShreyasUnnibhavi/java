import java.util.*;
class Solution {
    public int[][] mergeIntervals(int intervals[][]){
        if(intervals.length <= 1) return intervals;
        List<int[]> intervalsList = new ArrayList<>(Arrays.asList(intervals));
        boolean mergeHpnd = true;
         while(mergeHpnd){
            List<int[]> temp = new ArrayList<>();
            mergeHpnd = false;

            while(!intervalsList.isEmpty()){
                int[] current = intervalsList.remove(0);

                for(int i = 0; i < intervalsList.size(); i++){
                    int other[] = intervalsList.get(i);

                    if(Math.max(current[0], other[0]) <= Math.min(current[1], other[1])){
                        current = new int[]{Math.min(current[0], other[0]), Math.max(current[1], other[1])};
                        intervalsList.remove(i);
                        mergeHpnd = true;
                        break;
                    }
                }
                temp.add(current);
            }
            intervalsList = temp;
         }
        return intervalsList.toArray(new int[intervalsList.size()][]);
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
