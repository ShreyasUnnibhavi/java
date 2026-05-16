public class MaxRemovableCharacters {
    public static int maxRemovals(String s, String p, int[] removable) {
        int left = 0;
        int right = removable.length;
        int ans = 0;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(containsSubsequence(s, p, removable, mid)) {
                ans = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return ans;
    }
    public static boolean containsSubsequence(String s, String p, int[] removable, int k) {
        boolean[] removed = new boolean[s.length()];
        for(int i = 0; i < k; i++) {
            removed[removable[i]] = true;
        }

        int sPtr = 0;
        int pPtr = 0;
        while(sPtr < s.length() && pPtr < p.length()) {
            if(!removed[sPtr] && s.charAt(sPtr) == p.charAt(pPtr)) {
                pPtr++;
            }
            sPtr++;
        }
        return pPtr == p.length();
    }
    public static void main(String[] args) {
        String s = "abcbddddd";
        String p = "abcd";
        int[] removable = {3, 2, 1, 4, 5, 6};
        System.out.println(maxRemovals(s, p, removable));
    }
}
