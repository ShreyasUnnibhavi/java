public class ReachTarget {
    public static int reachTarget(int target) {
        target = Math.abs(target);
        long start = 1;
        long end = target;
        long k = 0;
        while(start <= end) {
            long mid = start + (end - start) / 2;
            long sum = mid * (mid + 1) / 2;
            if(sum >= target) {
                k = mid;
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        long currSum = k * (k + 1) / 2;
        while((currSum - target) % 2 != 0) {
            k++;
            currSum += k;
        }
        return (int)k;
    }
    public static void main(String[] args) {
        int target = 5;
        System.out.println(reachTarget(target));
    }
}
