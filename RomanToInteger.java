public class RomanToInteger {
    public static int romanToInt(String s) {
        int total = 0;
        int n = s.length();
        for(int i = 0; i < n; i++) {
            int currentVal = getVal(s.charAt(i));
            if(i + 1 < n && currentVal < getVal(s.charAt(i + 1))) {
                total -= currentVal;
            }else {
                total += currentVal;
            }
        }
        return total;
    }
    public static int getVal(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
