public class SwapNodesLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head;
    public Node tail;
    public int size;

    //method to add a node at the beginning
    public void addFirst(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //method to add a node at the end
    public void addLast(int data){
        size++;
        Node newNode = new Node(data);
        if(head == null){
            tail = head = newNode;
            return;
        }
        
        tail.next = newNode;
        tail = newNode;
    }

    //method to add Node in the middle
    public void add(int index, int data){
        if(index == 0){
            addFirst(data);
            return;
        }
        int count = 0;
        Node temp = head;
        Node newNode = new Node(data);
        while(count < index-1){
            temp = temp.next;
            if(temp == null){
                System.out.println("Index out of bounds");
                return;
            }
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    //method to delete Node at the beginning
    public int removeFirst(){
        if(head == null){
            System.out.println("Empty list");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        size--;
        int val = head.data;
        head = head.next;
        return val;
    }

    //method to delete node at the end
    public int removeLast(){
        if(head == null) {
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }else{
            Node temp = head;
            for(int i = 0; i < size-2; i++){
                temp = temp.next;
            }

            int val = temp.next.data;
            temp.next = null;
            tail = temp;
            size--;
            return val;
        }
    }

    public void print(){
        if(head == null){
            System.out.println("Empty list");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next; 
        }
        System.out.println("-> null");
        return;
    }

    //method to swap nodes
    public void swap(int x, int y){
        //edge case: x and y are the same
        if(x == y) return;

        //1. search for x and its previous node
        Node currX = head, prevX = null;
        while(currX != null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        }

        //2. search for y and its previous node
        Node currY = head, prevY = null;
        while(currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }

        //3. return if either x or y is not in the list
        if(currX == null || currY == null) return;

        //4. update previous of x to point y
        if(prevX != null){
            prevX.next = currY;
        }else{
            head = currY;  //x was head
        }

        //5. update previous of y to point x
        if(prevY != null){
            prevY.next = currX;
        }else{
            head = currX;   //y was head
        }

        //6. Update the next pointers of x and y
        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }
    public static void main(String[] args) {
        SwapNodesLL ll = new SwapNodesLL();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);
        ll.addLast(8);
        ll.addLast(9);
        ll.swap(1, 9);
        ll.print();
    }
}
