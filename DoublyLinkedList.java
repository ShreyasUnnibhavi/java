public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;
    public int size;

    //method to add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;        
    }

    //method to add last
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    //method to add at index
    public void add(int index, int data){
        if(index > size){
            System.out.println("index out of bounds");
            return;
        }else if(index == size){
            addLast(data);
            return;
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);
        int i = 0;
        Node temp = head;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        if(temp.next != null){
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        
    }

    //method to print
    public void print(){
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    //method to remove first
    public void removeFirst(){
        if(head == null) return;
        if(size == 1) {
            head = tail = null;
            size--;
            return;
        }
        size--;
        head = head.next;
        head.prev.next = null;
        head.prev = null;
    }

    //method to remove last
    public void removeLast(){
        if(head == null) return;
        if(size == 1) {
            head = tail = null;
            size--;
            return;
        }
        size--;
        tail = tail.prev;
        tail.next = null;
    }

    //method to remove at index
    public void remove(int index){
        if(head == null) return;
        if(index == 0){
            removeFirst();
            return;
        }
        if(index == size-1){
            removeLast();
            return;
        }
        int i = 0;
        Node temp = head;
        while(i < index-1){
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
    }

    //method to reverse
    public void reverse(){
        if(head == null || size == 1) return;
        tail = head;
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.add(2, 100);
        dll.remove(2);
        dll.reverse();
        dll.print();
    }
}
