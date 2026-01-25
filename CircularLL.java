public class CircularLL {
    private class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }
    private Node tail = null;
    private int size;

    //method to add first
    public void addFirst(int data){
        size ++;
        Node newNode = new Node(data);
        if(tail == null){
            tail = newNode;
            tail.next = tail;
        }else{
            newNode.next = tail.next;
            tail.next = newNode;
        }
    }

    //method to add last
    public void addLast(int data){
        size++;
        Node newNode =  new Node(data);
        if(tail == null){
            tail = newNode;
            tail.next = tail;
        }else{
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    //method to add at index
    public void add(int index, int data){
        Node newNode = new Node(data);
        if(index > size){
            System.out.println("Index out of bounds");
            return;
        }
        if(index == size){
            addLast(data);
            return;
        }
        if(index == 0){
            addFirst(data);
            return;
        }
        Node temp = tail.next;
        int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    //method to remove first
    public void removeFirst(){
        if(tail == null) return;
        if(size == 1){
            tail = null;
            size--;
        }else{
            tail.next = tail.next.next;
            size--;
        }
    }

    //method to remove last
    public void removeLast(){
        if(tail == null) return;
        if(size == 1){
            tail = null;
            size--;
        }else{
            Node temp = tail.next;
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = tail.next;
            tail = temp;
            size--;
        }
    }

    //method to remove at index
    public void remove(int index){
        if(tail == null) {
            System.out.println("empty list");
            return;
        }
        if(index == 0){
            removeFirst();
            return;
        }
        if(index == size-1){
            removeLast();
            return;
        }else if(index >= size){
            System.out.println("Index out of bounds");
            return;
        }
        Node temp = tail.next;
        int i = 0;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        size--;
    }

    //method to print 
    public void print(){
        if(tail == null) return;
        Node temp = tail.next;
        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        }while(temp != tail.next);
        System.out.println();
    }
    public static void main(String[] args) {
        CircularLL sol = new CircularLL();
        sol.addFirst(1);
        sol.addLast(2);
        sol.addLast(3);
        sol.addFirst(0);
        sol.add(1, 1000);
        sol.print();
        sol.remove(2);
        sol.print();
        System.out.println(sol.size);
    }
}
