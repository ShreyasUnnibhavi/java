public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int m = num1.length();
        int n = num2.length();
        int[] result = new int[m + n];
        for(int i = m - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';
            for(int j = n - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';
                int p1 = i + j + 1;
                int p2 = i + j;
                int product = d1 * d2;
                int sum = product + result[p1];
                result[p1] = sum % 10;
                result[p2] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int val : result) {
            if(sb.length() == 0 && val == 0) {
                continue;
            }
            sb.append(val);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String num1 = "100";
        String num2 = "100";
        System.out.println(multiply(num1, num2));
    }
}
