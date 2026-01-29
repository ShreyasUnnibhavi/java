import java.util.Stack;
public class DuplicateParentheses {
    public static boolean isMatching(char open, char close){
        return (close == ')' && open == '(') || (close == ']' && open == '[') || (close == '}' && open == '{');
    }
    public static boolean checkDuplicate(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            if(curr == ')' || curr == '}' || curr == ']'){
                int count = 0;
                //pop until we find the matching opening bracket
                while(!s.isEmpty() && !isMatching(s.peek(), curr)){
                    count++;
                    s.pop();
                }

                //if count = 0, we have duplicates () or (())
                if(count == 0){
                    return true;
                }

                //pop the opening bracket in the stack
                if(!s.isEmpty())
                    s.pop();
            }else{
                s.push(curr);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "([a]*(a+b)/{c-d})";
        System.out.println(checkDuplicate(str));
    }
}
