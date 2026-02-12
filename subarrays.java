public class subarrays {
    public static void printSubarrays(int nums[]) {
        int n = nums.length;
        for(int i = 0; i < n; i++) {
            //^ Using the Stringbuilder to optimize the TC from O(n^3) to O(n^2)
            StringBuilder curr = new StringBuilder();
            for(int j = i; j < n; j++) {
                curr.append(nums[j]);
                System.out.println(curr + " ");
            }
        }
    }
    public static void bruteForceMaxSum(int nums[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i; j < nums.length; j++) {
                int currSum = 0;
                for(int k = i; k <= j; k++) {
                    currSum = currSum + nums[k];
                }
                max = Math.max(max, currSum);
                min = Math.min(min, currSum);
            }
        }
        System.out.println(max + ", " + min);
    }
    public static void prefixMethod(int nums[]) {
        int prefix[] = new int[nums.length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }
        for(int i = 0; i < nums.length; i++) {
            int start = i;
            for(int j = i; j < nums.length; j++) {
                int end = j;
                int prefixSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                max = Math.max(max, prefixSum);
                min = Math.min(min, prefixSum);
            }
        }
        System.out.println(max + ", " + min);
    }
    public static void kadanes(int nums[]) {
        int curr = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            count = nums[i] < 0 ? count++: count;
        }

        for(int i = 0; i < nums.length; i++) {
            if(count == nums.length) {
                max = Math.max(max, nums[i]);
            }else {
                curr = curr + nums[i];
                if(curr < 0) {
                    curr = 0;
                }
                max = Math.max(max, curr);
            }
        }
        System.out.println(max);
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3};
        bruteForceMaxSum(numbers);
        prefixMethod(numbers);
        kadanes(numbers);
        printSubarrays(numbers);
    }
}
