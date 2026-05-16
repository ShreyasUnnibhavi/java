public class HomogenourSubstrings {
    public static int countHomogenous(String s) {
        int n = s.length();
        int mod = 1_000_000_007;
        int total = 0;
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int count = 0;
            while(i < n && s.charAt(i) == ch) {
                count++;
                total = (total + count) % mod;
                i++;
            }
            i--;
        }
        return total;
    }
    public static void main(String[] args) {
        String s = "abbcccaa";
        System.out.println(countHomogenous(s));
    }
}
