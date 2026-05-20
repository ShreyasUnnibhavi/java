public class LargestSubstringLexico {
    public static String lastSubstring(String s) {
        int n = s.length();
        int i = 0;
        int j = 1;
        int k = 0;
        
        while (j + k < n) {
            char charI = s.charAt(i + k);
            char charJ = s.charAt(j + k);
            
            if (charI == charJ) {
                //* Characters match, expand the lookahead window
                k++;
            } else if (charI < charJ) {
                //* Suffix starting at i loses. Skip i past the matched zone.
                i = Math.max(i + k + 1, j);
                j = i + 1;
                k = 0; //* Reset lookahead offset
            } else {
                //* Suffix starting at j loses. Skip j past the matched zone.
                j = j + k + 1;
                k = 0; //* Reset lookahead offset
            }
        }
        
        //^ The index 'i' will always hold the starting position of the winning suffix
        return s.substring(i);
    }
    public static void main(String[] args) {
        String s = "zaaazb";
        System.out.println(lastSubstring(s));
    }
}
