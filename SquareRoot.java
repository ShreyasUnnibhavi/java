public class SquareRoot {
    public static int mySqrt(int num) {
        if(num == 0) return 0;
        int left = 0;
        int right = num;
        while(left <= right) {
            int mid = right - (right - left)/2;
            long square = mid * mid;
            if(square == num)
                return mid;
            else if(square > num)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return right;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(9));
    }
}
