public class GoalParser {
    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        int n = command.length();
        for(int i = 0; i < n; i++) {
            char ch = command.charAt(i);
            if(ch == 'G') {
                sb.append(ch);
            }else if(ch == '(' && command.charAt(i + 1) == 'a') {
                sb.append("al");
                i += 3;
            }else if(ch  == '(') {
                sb.append('o');
                i++;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }
}
