import java.util.EmptyStackException;
public class LinkedListStack {
    //generic class type
    static class Stack<T>{
        private class Node{
            T data;
            Node next;

            public Node(T data){
                this.data = data;
                this.next = null;
            }
        }
        private Node head = null;
        // private int size = 0;

        public boolean isEmpty(){
            return head == null;
        }
        public void push(T data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }
        }
        public T pop(){
            if(isEmpty()){
                throw new EmptyStackException();
            }
            T val = head.data;
            head = head.next;
            return val;
        }

        // Peek: Look at the head node (O(1))
        public T peek(){
            if(isEmpty()){
                throw new EmptyStackException();
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        while(!list.isEmpty()){
            System.out.println(list.pop());
        }
        
        System.out.println();
        Stack<String> s = new Stack<>();
        s.push("Unnibhavi");
        s.push("Shreyas");
        s.push("Hi");
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
