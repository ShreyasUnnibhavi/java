public class FindKthBit {
    public static char findKthBit(int n, int k) {
        boolean invert = false;
        while(n > 1) {
            int totalLength = (1 << n) - 1;
            int mid = (totalLength / 2) + 1;
            if(k == mid) {
                return invert ? '0' : '1';
            }else if(k > mid) {
                k = 2 * mid - k;
                invert = !invert;
            }
            n--;
        }
        return invert ? '1' : '0';
    }
    public static void main(String[] args) {
        System.out.println(findKthBit(3, 1));
    }
}
