public class ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right) {
            char leftChar = s.charAt(left);
            char rightChar = s.charAt(right);
            if(leftChar != rightChar) {
                return isActualPalindrome(s, left + 1, right) || isActualPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean isActualPalindrome(String s, int i, int j) {
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "deeee";
        System.out.println(validPalindrome(s));
    }
}
