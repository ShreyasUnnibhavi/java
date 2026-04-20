import java.util.List;

public class CountMatches {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n = items.size();
        int count = 0;
        int index;

        if (ruleKey.equals("type"))
            index = 0;
        else if (ruleKey.equals("color"))
            index = 1;
        else
            index = 2;

        for(int i = 0; i < n; i++) {
            if(items.get(i).get(index).equals(ruleValue))
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        List<List<String>> items = List.of(
            List.of("phone", "blue", "pixel"),
            List.of("computer", "silver", "lenovo"),
            List.of("phone", "gold", "iphone")
        );
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(items, ruleKey, ruleValue));
    }
}
