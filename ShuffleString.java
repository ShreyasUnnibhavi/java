public class ShuffleString {
    public static String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] charArray = new char[n];
        for(int i = 0; i < n; i++) {
            charArray[indices[i]] = s.charAt(i);
        }
        
        return new String(charArray);
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int[] nums = {4, 5, 6, 7, 0, 2, 1, 3};
        System.out.println(restoreString(s, nums));
    }
}
