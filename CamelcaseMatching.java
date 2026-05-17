import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> result = new ArrayList<>();
        for(String query : queries) {
            result.add(isMatch(query, pattern));
        }
        return result;
    }
    public static boolean isMatch(String query, String pattern) {
        int j = 0;
        int p = pattern.length();
        for(int i = 0; i < query.length(); i++) {
            char ch = query.charAt(i);
            if(j < p && ch == pattern.charAt(j)) {
                j++;
            }else if(Character.isUpperCase(ch)) {
                return false;
            }
        }
        return j == p;   
    }
    public static void main(String[] args) {
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FB";
        System.out.println(camelMatch(queries, pattern));
    }
}
