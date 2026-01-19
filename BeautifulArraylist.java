import java.util.ArrayList;
public class BeautifulArraylist {
    public static ArrayList<Integer> createArray(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        while(ans.size() < n){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int value: ans){
                if(value * 2 - 1 <= n) temp.add(value * 2 - 1);
            }

            for(int value: ans){
                if(value * 2 <= n) temp.add(value * 2);
            }
            ans = temp;
        }
        return ans;
    }
    public static ArrayList<Integer> recursive(int n){
        ArrayList<Integer> list = new ArrayList<>();
        solve(1, 1, list, n);
        return list;
    }
    public static void solve(int start, int inc, ArrayList<Integer> list, int n){
        if(start + inc > n){
            list.add(start);
            return;
        }
        solve(start, inc * 2, list, n);         //solving for the left part
        solve(start + inc, inc * 2, list, n);   //solving for the right part
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(createArray(n));
        System.out.println(recursive(n));
    }
}
