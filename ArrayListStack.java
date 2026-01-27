import java.util.ArrayList;
public class ArrayListStack {
    static class stack<T>{
        private ArrayList<T> list = new ArrayList<>();
        public boolean isEmpty(){
            return list.size() == 0;
        }
        public void push(T data){
            list.add(data);
        }
        public T pop(){
            if(list.isEmpty())
                throw new java.util.EmptyStackException();
            return list.remove(list.size() - 1);
        }
        public T peek(){
            if(list.isEmpty()) 
                throw new java.util.EmptyStackException();
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        stack<String> list = new stack<>();
        list.push("World");
        list.push("hellow");
        list.push("-----");

        while(!list.isEmpty()){
            System.out.println(list.pop());
        }
    }
}
