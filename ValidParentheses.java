import java.util.Stack;

public class ValidParentheses {
    public static boolean check(String s){
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        for(int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            if(curr == '(' || curr == '[' || curr == '{') {
                stack.push(curr);
            }else {
                if(stack.isEmpty()) return false;
                char top = stack.pop();
                if(curr == ')' && top != '(') return false;
                if(curr == ']' && top != '[') return false;
                if(curr == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "[}]";
        System.out.println(check(str));
    }
}
