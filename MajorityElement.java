public class MajorityElement {
    public static int count(int nums[], int target, int si, int ei){
        int count = 0;
        for(int i = si; i <= ei; i++) if(nums[i] == target) count++;
        return count;
    }
    public static int majorityElement(int[] nums, int si, int ei) {
        if(si == ei) return nums[si];

        int mid = si + (ei - si)/2;
        int leftMaj = majorityElement(nums, si, mid);
        int rightMaj = majorityElement(nums, mid + 1, ei);
        
        if(leftMaj == rightMaj) return leftMaj;

        int leftCount = count(nums, leftMaj, si, ei);
        int rightCount = count(nums, rightMaj, si, ei);

        return leftCount > rightCount ? leftMaj : rightMaj;
    }
    public static void main(String args[]){
        int nums[] = {3,4,3};
        System.out.println(majorityElement(nums, 0, nums.length-1));
    }
}
