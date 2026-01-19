import java.util.*;
class Solution {
    public List<List<Integer>> solve(int nums[], int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n-2; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < n-2; j++){
                if(j > i+1 && nums[j] == nums[j-1]) continue;
                int left = j + 1;
                int right = n-1;
                while(left < right){
                    long sum = (long)nums[i] + nums[left] + nums[right] + nums[j];
                    if(sum > target) right--;
                    else if(sum < target) left++;
                    else{
                        res.add(Arrays.asList(nums[i] , nums[left] , nums[right] , nums[j]));

                        while(left < right && nums[left] == nums[left+1]) left++;
                        while(left < right && nums[right] == nums[right-1]) right--;

                        left++;
                        right--;
                    }
                }
            }
            
        }
        return res;
    }
    public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2,2};
        int target = 0;
        Solution sol = new Solution();
        List<List<Integer>> res = sol.solve(nums, target);
        for(List<Integer> quadruplet : res){
            System.out.println(quadruplet);
        } 
    }
}
