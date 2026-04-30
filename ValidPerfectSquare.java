public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        long start = 1;
        long end = num / 2;
        while(start <= end) {
            long mid = start + (end - start) / 2;
            long square = mid * mid;
            if(square == num)
                return true;
            else if(square > num)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 808201;
        System.out.println(isPerfectSquare(num));
    }
}
