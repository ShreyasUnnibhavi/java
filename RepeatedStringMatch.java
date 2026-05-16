public class RepeatedStringMatch {
    public static int repeatedStringMatch(String a, String b) {
        boolean[] chars = new boolean[26];
        for(char ch : a.toCharArray()) {
            chars[ch - 'a'] = true;
        }
        for(char ch : b.toCharArray()) {
            if(!chars[ch - 'a']) return -1;
        }

        int blen = b.length();
        if(blen == 0) return -1;
        int alen = a.length();
        int minCopies = blen / alen;
        if(blen % alen > 0) {
            minCopies++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < minCopies; i++) {
            sb.append(a);
        }

        if(sb.indexOf(b) != -1) return minCopies;
        if(sb.append(a).indexOf(b) != -1) return minCopies + 1;

        return -1;
    }
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";
        System.out.println(repeatedStringMatch(a, b));
    }
}
