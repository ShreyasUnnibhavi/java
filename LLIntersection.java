public class LLIntersection {
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

    public Node getIntersectionNode(Node headA, Node headB) {
        if(headA == null || headB ==null) return null;

        Node temp1 = headA;
        Node temp2 = headB;

        while(temp1 != temp2){
            if(temp1 == null){
                temp1 = headB;
            }else temp1 = temp1.next;

            if(temp2 == null){
                temp2 = headA;
            }else temp2 = temp2.next;
        }

        return temp1;
    }
    public static void main(String[] args) {
        LLIntersection sol = new LLIntersection();

        // 1. Create the Intersection Part (Common nodes: 8 -> 4 -> 5)
        Node common = new Node(8);
        common.next = new Node(4);
        common.next.next = new Node(5);

        // 2. Create Head A (Distinct part: 4 -> 1)
        Node headA = new Node(4);
        Node nodeA2 = new Node(1);
        headA.next = nodeA2;
        nodeA2.next = common; // Connect A to the common part

        // 3. Create Head B (Distinct part: 5 -> 6 -> 1)
        Node headB = new Node(5);
        Node nodeB2 = new Node(6);
        Node nodeB3 = new Node(1);
        headB.next = nodeB2;
        nodeB2.next = nodeB3;
        nodeB3.next = common; // Connect B to the common part

        // 4. Pass the two heads to the function
        // List A: 4 -> 1 -> 8 -> 4 -> 5
        // List B: 5 -> 6 -> 1 -> 8 -> 4 -> 5
        Node intersection = sol.getIntersectionNode(headA, headB);

        // 5. Output the result
        if (intersection != null) {
            System.out.println("Intersected at '" + intersection.data + "'");
        } else {
            System.out.println("No intersection");
        }
    }
}
