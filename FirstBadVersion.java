public class FirstBadVersion {
    public static boolean isBadVersion(int n) {
        return n >= 4 ? true : false;
    }
    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(isBadVersion(mid)) {
                end = mid;
            }else
                start = mid + 1;
        }
        return start;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(firstBadVersion(n));
    }
}
