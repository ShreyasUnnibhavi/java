public class ShiftingLetters {
    public static String shiftingLetters(String s, int[] shifts) {
        char[] chars = s.toCharArray();
        int n = s.length();
        long totalShift = 0;
        for(int i = n - 1; i >= 0; i--) {
            totalShift += shifts[i];
            int netShift = (int) ((chars[i] - 'a' + totalShift) % 26);
            chars[i] = (char)('a' + netShift);
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String s = "abc";
        int[] shifts = {3, 5, 9};
        System.out.println(shiftingLetters(s, shifts));
    }
}
