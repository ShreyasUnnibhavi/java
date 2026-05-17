public class ValidNumber {
    public static boolean isNumber(String s) {
        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExponent = false;
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                seenDigit = true;
            }else if(ch == '+' || ch == '-') {
                if(i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }else if(ch == '.') {
                if(seenDot || seenExponent) {
                    return false;
                }
            }else if(ch == 'e' || ch == 'E') {
                if(seenExponent || !seenDigit) {
                    return false;
                }
            }else {
                return false;
            }
        }
        return seenDigit;
    }
    public static void main(String[] args) {
        String s = "-.3";
        System.out.println(isNumber(s));
    }
}
