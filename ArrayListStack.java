import java.util.ArrayList;
public class ArrayListStack {
    static class stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size() == 0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(list.size() == 0)
                return -1;
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }
        public static int peek(){
            if(list.size() == 0) 
                return -1;
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        stack list = new stack();
        list.push(1);
        list.push(2);
        list.push(3);

        while(!list.isEmpty()){
            System.out.println(list.pop());
        }
    }
}
