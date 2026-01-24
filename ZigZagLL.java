public class ZigZagLL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

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

    //method to print the Linked List
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

    //method to return the mid node
    //note: if size is even, include the mid in left i.e., half(fast = head.next)
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //merge the left and right lists to from zigzag list
    public Node mergeZigzag(Node left, Node right){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        boolean flag = true;
        while(left != null && right != null){
            if(flag){         
                temp.next = left;
                left = left.next;
            }else{
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
            flag = !flag;
        }

        //adding the remaining nodes either in left half or right half
        if(left != null) temp.next = left;
        if(right != null) temp.next = right;
        return mergedLL.next;
    }
    public Node zigzagLL(){
        //creating left half of the list
        Node mid = getMid(head);
        Node curr = mid.next;
        mid.next = null;

        //creating right half of the list
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        return mergeZigzag(left, right);
    }
    public static void main(String[] args) {
        ZigZagLL sol = new ZigZagLL();
        sol.addFirst(1);
        sol.addLast(2);
        sol.addLast(3);
        sol.addLast(4);
        sol.addLast(5);
        head = sol.zigzagLL();
        sol.print();
    }
}
