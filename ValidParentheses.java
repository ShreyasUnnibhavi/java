import java.util.Stack;

public class ValidParentheses {
    public static boolean check(String str){
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            if(curr == '(' || curr == '{' || curr == '['){
                s.push(i);
            }else if(curr == ')' || curr == '}' || curr == ']'){
                if(s.isEmpty())
                    return false;

                int top = s.pop();

                if((curr == '(' && top != ')') || (curr == '[' && top != ']') || (curr == '{' && top != '}'))
                    return false;
            }
        }
        return s.isEmpty();
    }
    public static void main(String[] args) {
        String str = "[{}]";
        System.out.println(check(str));
    }
}
