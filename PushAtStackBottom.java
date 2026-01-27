import java.util.Stack;
public class PushAtStackBottom {
    public static void pushAtBottom(Stack<Integer> stack, int bottom){
        //base case
        if(stack.isEmpty()){
            stack.push(bottom);
            return;
        }
        //recursion
        Integer data = stack.pop();
        pushAtBottom(stack, bottom);
        stack.push(data);
        return;
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        pushAtBottom(stack, 4);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
