import java.util.Arrays;

public class AssignCookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int childPtr = 0;
        int cookiePtr = 0;
        while(childPtr < g.length && cookiePtr < s.length) {
            if(s[cookiePtr] >= g[childPtr]) childPtr++;
            cookiePtr++;
        }
        return childPtr;
    }
    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.println(findContentChildren(g, s));
    }
}
