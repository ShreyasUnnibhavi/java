public class EqualSubstringsBudget {
    public static int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int left = 0;
        int currentCost = 0;
        int maxLen = 0;
        for(int right = 0; right < n; right++) {
            currentCost += Math.abs(s.charAt(right) - t.charAt(right));
            if(currentCost > maxCost) {
                currentCost -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "abcd", t = "bcdf";
        int maxCost = 3;
        System.out.println(equalSubstring(s, t, maxCost));
    }
}
