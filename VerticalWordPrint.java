import java.util.ArrayList;
import java.util.List;

public class VerticalWordPrint {
    public static List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int n = Integer.MIN_VALUE;
        for(String word : words) {
            n = Math.max(n, word.length());
        }
        List<String> res = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for(String word : words) {
                if(i < word.length()) {
                    sb.append(word.charAt(i));
                }else {
                    sb.append(" ");
                }
            }
            // int len = sb.length();
            // while(len > 0 && sb.charAt(len - 1) == ' ') {
            //     len--;
            // }
            // sb.setLength(len);
            res.add(sb.toString().stripTrailing());
        }
        return res;
    }
    public static void main(String[] args) {
        String s = "RCB CHAMPIONS 2026";
        System.out.println(printVertically(s));
    }
}
