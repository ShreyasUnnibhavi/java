public class CycleInLL {
    public boolean checkForCycle(){
        LinkedList.Node slow = LinkedList.head;
        LinkedList.Node fast = LinkedList.head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedList.head = new LinkedList.Node(1);
        LinkedList.head.next = new LinkedList.Node(2);
        LinkedList.head.next.next = new LinkedList.Node(3);
        // LinkedList.head.next.next.next = LinkedList.head;
        CycleInLL ll = new CycleInLL();
        System.out.println(ll.checkForCycle());
    }
}

