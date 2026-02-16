public class MajorityElement {
    public static int majorityElement(int nums[]) {
        if(nums.length < 2) 
            return nums[0];
        int vote = 1;
        int maj = nums[0];
        for(int i = 1; i < nums.length; i++) {
            //^ Case 1. if vote is 0, we pick a new candidate
            if(vote == 0) {
                maj = nums[i];
                vote = 1;
            }
            //^ Case 2. if the current number equals the majority element so far, we increase the vote count by 1
            else if(nums[i] == maj) {
                vote++;
            }
            //^ Case 3. decrease the vote by 1 if the current number is different from majority element so far
            else {
                vote--;
            }
        }
        return maj;
    }
    public static void main(String args[]) {
        int nums[] = {2, 2, 1, 1, 1};
        System.out.println(majorityElement(nums));
    }
}

