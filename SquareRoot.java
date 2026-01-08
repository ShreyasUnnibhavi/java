public class SquareRoot {
    public static int mySqrt(int x) {
        if(x == 1 || x == 0) return x;
        long left = 1;
        long right = x;
        while(left <= right){
            long mid = left + (right - left)/2;
            if(mid * mid == x){
                return (int) mid;
            }else if( mid * mid > x){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return (int) right;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}
