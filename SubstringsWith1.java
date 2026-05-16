public class SubstringsWith1 {
    public static int numSub(String s) {
        int n = s.length();
        int mod = 1_000_000_007; 
        int total = 0;
        for(int i = 0; i < n; i++) {
            int count = 0;
            while(i < n && s.charAt(i) == '1') {
                count++;
                total = (total + count) % mod;
                i++;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        String s = "0110111";
        System.out.println(numSub(s));
    }
}
