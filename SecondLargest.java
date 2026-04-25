public class SecondLargest {
    public static int findSecondLargest(int[] nums) {
        int n = nums.length;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i] > secondLargest && nums[i] != largest)
                secondLargest = nums[i];
        }
        if(secondLargest == Integer.MIN_VALUE)
            return -1;
        return secondLargest;
    }
    public static void main(String[] args) {
        int[] nums = {8, 8, 7, 6, 5};
        System.out.println(findSecondLargest(nums));
    }
}
