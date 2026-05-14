public class DecryptString {
    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) == '#') {
                int num = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
                sb.append((char)(num + 'a' - 1));
                i -= 2;
            }else {
                int num = s.charAt(i) - '0';
                sb.append((char)(num + 'a' - 1));
            }
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }
}
