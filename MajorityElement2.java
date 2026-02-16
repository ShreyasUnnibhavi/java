public class MajorityElement2 {
    public static int count(int nums[], int target, int si, int ei) {
        int count = 0;
        for(int i = si; i <= ei; i++) {
            if(nums[i] == target)
                count++;
        }
        return count;
    }
    public static int solve(int nums[], int si, int ei) {
        //& Base condition
        if(si == ei)
            return nums[si];

        //& Recursive logic
        int mid = si + (ei - si)/2;
        int leftMaj = solve(nums, si, mid);
        int rightMaj = solve(nums, mid+1, ei); 

        //* Return either left major/ right major if theres a same majority element on both sides
        if(leftMaj == rightMaj) return leftMaj;

        //! Calculate the count of majority element on the left
        int leftMajCount = count(nums, leftMaj, 0, mid);
        int rightMajCount = count(nums, rightMaj, mid+1, nums.length-1);

        return leftMajCount > rightMajCount ? leftMaj : rightMaj;
    }
    public static int findMajorityElement(int nums[]) {
        return solve(nums, 0, nums.length-1);
    }
    public static void main(String[] args) {
        int nums[] = {3, 4, 3};
        System.out.println(findMajorityElement(nums));
    }
}
