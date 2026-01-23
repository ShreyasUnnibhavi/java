class PalindromeLL {
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
    public void addEnd(int data){
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
    public void addAtIndex(int index, int data){
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
    public int delFirst(){
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
    public int delEnd(){
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

    //method to search and return the index of an element
    public int search(int num){
        if(head == null){
            return -1;
        }
        int index = 0;
        Node temp = head;
        while(temp != null){
            if(temp.data == num) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    //helper for recursive search
    public int helper(Node temp, int num){
        if(temp == null){
            return -1;
        }
        if(temp.data == num){
            return 0;
        }
        int index = helper(temp.next, num);
        if(index == -1){
            return -1;
        }
        return index+1;
    }
    //method to recursively search and return the index of an element
    public int recursiveSearch(int num){
        return helper(head, num);
    }

    //method to reverse the linked list
    public void reverse(){
        if(head == null || head == tail) return;
        
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //method to delete nth element from the end of the linked list
    public int delNthElementFromEnd(int n){
        //calculating size
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        
        if(n == size){
            head = head.next;
            return -1;
        }else if(n > size) {
            System.out.println("Index out of bounds");
            return -1;
        }
        Node prev = head;
        int i = 1;
        while(i < size - n){
            prev = prev.next;
            i++;
        }
        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;
    }

    //method to delete nth node 
    public int delNthNode(int n){
        if(head == null) return -1;
        if(n > size) return -1;
        Node prev = head;
        int i = 1;
        while(i < n-1){
            prev = prev.next;
            i++;
        }
        int val = prev.next.data;
        prev.next = prev.next.next;
        return val;
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

    public Node findMid(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    //method to check if a linked list is palindrome
    public boolean isPalindrome(){
        if(head == null || head.next == null) return true;
        Node mid = findMid();
        Node prev = null;
        Node curr = mid;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
    
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeLL ll = new PalindromeLL();
        ll.addFirst(1);
        ll.addEnd(2);
        ll.addEnd(2);
        ll.addEnd(1);
        // ll.addAtIndex(4, 1);
        
        // System.out.println(ll.delNthNode(2));
        // System.out.println(ll.delNthElementFromEnd(1));
        System.out.println(ll.isPalindrome());
    }
}
