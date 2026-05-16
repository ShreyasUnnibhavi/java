public class BasicCalculator {
    public static int calculate(String s) {
        int n = s.length();
        if(s == null || n == 0) return 0;
        int currentNum = 0;
        int lastNum = 0;
        int total = 0;
        char operator = 'x';
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                currentNum = currentNum * 10 + (c - '0');
            }else if((!Character.isDigit(c) && c != ' ') || i == n - 1) {
                if(operator == '+') {
                    total += lastNum;
                    lastNum = currentNum;
                }else if(operator == '-') {
                    total += lastNum;
                    lastNum = -currentNum;
                }else if(operator == '*') {
                    lastNum *= currentNum;
                }else if(operator == '/') {
                    lastNum /= currentNum;
                }
                operator = c;
                currentNum = 0;
            }
        }
        return total += lastNum;
    }
    public static void main(String[] args) {
        String s = "3 + 5 / 2";
        System.out.println(calculate(s));
    }
}
