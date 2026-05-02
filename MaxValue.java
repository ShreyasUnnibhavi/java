public class MaxValue {
    public static long calcSum(long length, long h) {
        long peakToDown = h - 1;
        if(peakToDown >= length) {
            long smallestValue = (peakToDown - length);
            return (smallestValue + peakToDown) * length / 2;
        }else {
            return (peakToDown + 1) * peakToDown / 2;
        }
    }
    public static long getSum(int n, int index, long h) {
        long sum = 0;
        long leftSideLength = index;
        long rightSideLength = n - 1 - index;

        sum += calcSum(leftSideLength, h);
        sum += calcSum(rightSideLength, h);
        sum += h;

        return sum;
    }
    public static int maxValue(int n, int index, int maxSum) {
        maxSum -= n;
        long start = 1;
        long end = maxSum;
        long ans = 0;
        while(start <= end) {
            long mid = start + (end - start) / 2;
            if(getSum(n, index, mid) <= maxSum) {
                ans = mid;
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return (int)ans + 1;
    }
    public static void main(String[] args) {
        int n = 6, index = 1, maxSum = 10;
        System.out.println(maxValue(n, index, maxSum));
    }
}