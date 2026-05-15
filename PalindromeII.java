public class PalindromeII {
    public static boolean checkPalindromeFormation(String a, String b) {
        return validate(a, b) || validate(b, a);
    }
    private static boolean validate(String a, String b) {
        int i = 0;
        int j = a.length() - 1;
        while(i < j && a.charAt(i) == b.charAt(j)) {
            i++;
            j--;
        }
        return isPalindrome(a, i, j) || isPalindrome(b, i, j);
    }
    private static boolean isPalindrome(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "ulacfd";
        String b = "jizalu";
        System.out.println(checkPalindromeFormation(a, b));
    }
}
