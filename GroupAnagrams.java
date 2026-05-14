import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        if(n == 0)  return new ArrayList<>();
        String[][] pairs = new String[n][2];
        for(int i = 0; i < n; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String signature = new String(charArray);
            pairs[i][0] = signature;
            pairs[i][1] = strs[i];
        }
        Arrays.sort(pairs, (a, b) -> a[0].compareTo(b[0]));
        List<List<String>> result = new ArrayList<>();
        int i =0;
        while(i < n) {
            List<String> subList = new ArrayList<>();
            String currStr = pairs[i][0];
            while(i < n && pairs[i][0].equals(currStr)) {
                subList.add(pairs[i][1]);
                i++;
            }
            result.add(subList);
        }
        return result;
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
